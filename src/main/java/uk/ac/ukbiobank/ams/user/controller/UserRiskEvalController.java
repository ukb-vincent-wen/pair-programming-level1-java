package uk.ac.ukbiobank.ams.user.controller;

import static org.springframework.http.ResponseEntity.*;

import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.ac.ukbiobank.ams.framework.http.ApiResponseDto;
import uk.ac.ukbiobank.ams.user.dto.RiskRequestDto;
import uk.ac.ukbiobank.ams.user.dto.RiskScoreResponseDto;
import uk.ac.ukbiobank.ams.user.service.RiskService;

/**
 * The endpoint for evaluating risk to access sensitive data by user. Resource: /api/v1/users/eval-risk
 */
// TODO: please provide sth here.
public class UserRiskEvalController {

  // TODO: please inject this service.
  private RiskService riskService;

  /**
   * Constructs the controller with required dependencies.
   */
  public UserRiskEvalController() {
  }

  /**
   * Evaluates risk for data access attempt and returns a normalized score.
   *
   * @param request request payload describing the access context
   * @return API envelope containing the risk score
   */
  // TODO: please provide sth here.
  public ResponseEntity<ApiResponseDto<RiskScoreResponseDto>> evaluate(
      @NonNull @RequestBody final RiskRequestDto request) {
    // TODO: please provide sth here.

    return null;
  }

}
