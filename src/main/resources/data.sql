INSERT INTO auth_user (name, login, sanction_cleared)
SELECT 'Tom',
       'ukb_tom',
       TRUE WHERE NOT EXISTS (SELECT 1 FROM auth_user WHERE login = 'ukb_tom');

INSERT INTO auth_user (name, login, sanction_cleared)
SELECT 'Paul',
       'ukb_paul',
       FALSE WHERE NOT EXISTS (SELECT 1 FROM auth_user WHERE login = 'ukb_paul');

INSERT INTO project (name, access_level)
SELECT 'Project A', 3 WHERE NOT EXISTS (SELECT 1 FROM project WHERE name = 'Project A');

INSERT INTO project (name, access_level)
SELECT 'Project B', 6 WHERE NOT EXISTS (SELECT 1 FROM project WHERE name = 'Project B');

INSERT INTO collaborator (user_id, project_id)
SELECT u.id, p.id
FROM auth_user u
JOIN project p
WHERE u.login = 'ukb_tom'
  AND p.name = 'Project A'
  AND NOT EXISTS (
    SELECT 1 FROM collaborator c
    WHERE c.user_id = (SELECT uu.id FROM auth_user uu WHERE uu.login = 'ukb_tom')
    AND c.project_id = (SELECT pp.id FROM project pp WHERE pp.name = 'Project A')
  );

INSERT INTO collaborator (user_id, project_id)
SELECT u.id, p.id
FROM auth_user u
JOIN project p
WHERE u.login = 'ukb_paul'
  AND p.name = 'Project B'
  AND NOT EXISTS (
  SELECT 1 FROM collaborator c
  WHERE c.user_id = (SELECT uu.id FROM auth_user uu WHERE uu.login = 'ukb_paul')
    AND c.project_id = (SELECT pp.id FROM project pp WHERE pp.name = 'Project B')
);