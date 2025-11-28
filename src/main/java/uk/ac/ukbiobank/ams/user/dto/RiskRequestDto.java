package uk.ac.ukbiobank.ams.user.dto;

/**
 * Represents the request for the User's risk evaluation.
 */
public class RiskRequestDto {

  private String userLogin;

  private Integer projectId;

  private Integer dataSensitivity;

  public String getUserLogin() {
    return userLogin;
  }

  public void setUserLogin(String userLogin) {
    this.userLogin = userLogin;
  }

  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public Integer getDataSensitivity() {
    return dataSensitivity;
  }

  public void setDataSensitivity(Integer dataSensitivity) {
    this.dataSensitivity = dataSensitivity;
  }
}
