package uk.ac.ukbiobank.ams.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import uk.ac.ukbiobank.ams.user.entity.User;

/**
 * Data access for user entity.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

  @Query(value = """
      // TODO: please provide SQL here.
      """,
      nativeQuery = true)
  @Nullable
  User getByLogin(@NonNull @Param("login") String login);

}
