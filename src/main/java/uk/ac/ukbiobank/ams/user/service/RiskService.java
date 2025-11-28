package uk.ac.ukbiobank.ams.user.service;


import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RequestBody;
import uk.ac.ukbiobank.ams.user.dto.RiskRequestDto;
import uk.ac.ukbiobank.ams.user.dto.RiskScoreResponseDto;

/**
 * Contract for evaluating file access risk.
 */
public interface RiskService {

  /**
   * Computes a risk score and level for a given access attempt.
   *
   * @param request request payload describing the access context
   * @return resulting score
   */
  @NonNull
  RiskScoreResponseDto evaluate(@NonNull @RequestBody final RiskRequestDto request);
}
