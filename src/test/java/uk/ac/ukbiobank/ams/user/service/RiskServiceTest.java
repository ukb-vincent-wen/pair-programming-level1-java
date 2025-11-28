package uk.ac.ukbiobank.ams.user.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;
import uk.ac.ukbiobank.ams.proj.entity.Project;
import uk.ac.ukbiobank.ams.user.dto.RiskRequestDto;
import uk.ac.ukbiobank.ams.user.entity.User;

/**
 * //TODO: Please provide unit test for RiskServiceImpl
 */
@ExtendWith(MockitoExtension.class)
public class RiskServiceTest {

  private RiskRequestDto request;
  private User user;
  private Project project;

  @BeforeEach
  void setUp() {
    request = new RiskRequestDto();
    request.setUserLogin("testUser");
    request.setProjectId(1);
    request.setDataSensitivity(1);

    user = new User();
    user.setLogin("testUser");
    user.setSanctionCleared(true);

    project = new Project();
    project.setId(1);
    project.setAccessLevel(5);
  }

  @ParameterizedTest
  @ValueSource(ints = {}) // TODO: please provide a list of possible values here.
  void shouldThrowExceptionWhenDataSensitivityOutOfRange(Integer dataSensitivity) {
    // TODO: please provide implementation here.
  }

  @Test
  void shouldReturnCorrectRiskScoreWhenValidRequest() {
    // TODO: please provide implementation here.
  }
}
