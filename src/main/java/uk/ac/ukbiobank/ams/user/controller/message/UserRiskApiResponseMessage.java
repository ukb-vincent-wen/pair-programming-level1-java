package uk.ac.ukbiobank.ams.user.controller.message;

import uk.ac.ukbiobank.ams.framework.validation.CodeMessageDto;

/**
 * Error messages for User Risk API Controller.
 */
public enum UserRiskApiResponseMessage implements CodeMessageDto {

  DATA_SENSITIVITY_MISSING("001", "Missing Data Sensitivity."),
  DATA_SENSITIVITY_NOT_IN_RANGE("002", "Data Sensitivity must be between 1 and 9."),
  DATA_SENSITIVITY_LOWER_THAN_PROJECT_ACCESS_LEVEL("003", "Data Sensitivity is lower than Project's Access Level."),
  COLLABORATOR_NOT_IN_REQUESTED_PROJECT("004", "Collaborator is not in requested Project."),
  ;

  private String code;

  private String message;

  UserRiskApiResponseMessage(String code, String message) {
    this.code = code;
    this.message = message;
  }

  @Override
  public String getCode() {
    return code;
  }

  @Override
  public String getMessage() {
    return message;
  }

}
