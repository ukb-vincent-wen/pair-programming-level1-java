package uk.ac.ukbiobank.ams.user.service.impl;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import uk.ac.ukbiobank.ams.proj.repository.ProjectRepository;
import uk.ac.ukbiobank.ams.user.dto.RiskRequestDto;
import uk.ac.ukbiobank.ams.user.dto.RiskScoreResponseDto;
import uk.ac.ukbiobank.ams.user.repository.UserRepository;
import uk.ac.ukbiobank.ams.user.service.RiskService;

@Service
public class RiskServiceImpl implements RiskService {

  private static final double WEIGHT_SANCTION = 0.5;
  private static final double WEIGHT_DATA_SENSITIVITY_LV = 0.1;

  // TODO: please inject this service.
  private UserRepository userRepository;

  // TODO: please inject this service.
  private ProjectRepository projectRepository;

  public RiskServiceImpl() {
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public @NonNull RiskScoreResponseDto evaluate(@NonNull @RequestBody final RiskRequestDto request) {
    // TODO: check data sensitivity must be in request

    // TODO: check if data sensitivity must be between 1 and 9 inclusively

    // TODO: check user is a member of the requested project

    // TODO: check project's access level must be higher than request's data sensitivity

    double riskScore = 0.0;

    // TODO: if user's sanction cleared is true, sanctionClearedScore = WEIGHT_SANCTION

    // TODO: dataSensitivityLevelScore = (project.getAccessLevel() - request.getDataSensitivity()) * WEIGHT_DATA_SENSITIVITY_LV

    // TODO: riskScore = (sanctionClearedScore + dataSensitivityLevelScore) * 100;

    return null;
  }

}