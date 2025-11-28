package uk.ac.ukbiobank.ams.user.entity;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a user.
 */
@Entity
@Table(name = "auth_user")
public class User {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Integer id;

  @Column(name = "name", length = 200)
  private String name;

  @Column(name = "login", length = 100)
  private String login;

  @Column(name = "sanction_cleared")
  private boolean sanctionCleared;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public boolean isSanctionCleared() {
    return sanctionCleared;
  }

  public void setSanctionCleared(boolean sanctionCleared) {
    this.sanctionCleared = sanctionCleared;
  }
}
