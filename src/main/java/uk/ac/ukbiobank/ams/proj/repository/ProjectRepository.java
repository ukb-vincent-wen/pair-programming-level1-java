package uk.ac.ukbiobank.ams.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import uk.ac.ukbiobank.ams.proj.entity.Project;

/**
 * Data access for project entity.
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

  @Query(value = """
      // TODO: please provide SQL here.
      """,
      nativeQuery = true)
  @Nullable
  Project getByProjectIdAndUserLogin(
      @NonNull @Param("projectId") final Integer projectId,
      @NonNull @Param("login") final String login);
}