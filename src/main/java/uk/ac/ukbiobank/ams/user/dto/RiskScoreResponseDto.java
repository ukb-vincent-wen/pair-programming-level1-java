package uk.ac.ukbiobank.ams.user.dto;


/**
 * Risk evaluation result.
 *
 * @param sanctionClearedScore      numeric risk score for sanction
 * @param dataSensitivityLevelScore numeric risk score for data sensitivity
 * @param riskScore                 final score for accessing the data
 */
public record RiskScoreResponseDto(double sanctionClearedScore, double dataSensitivityLevelScore, int riskScore) {

}
