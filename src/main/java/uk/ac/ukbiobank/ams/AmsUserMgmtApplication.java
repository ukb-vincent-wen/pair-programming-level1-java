package uk.ac.ukbiobank.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableTransactionManagement
@EnableWebMvc
@EnableJpaRepositories(basePackages = "uk.ac.ukbiobank.ams")
@SpringBootApplication(scanBasePackages = "uk.ac.ukbiobank.ams")
public class AmsUserMgmtApplication {

  public static void main(String[] args) {
    SpringApplication.run(AmsUserMgmtApplication.class, args);
  }

}
