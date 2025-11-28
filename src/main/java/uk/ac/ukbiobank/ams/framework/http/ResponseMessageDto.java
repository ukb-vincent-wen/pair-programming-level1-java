package uk.ac.ukbiobank.ams.framework.http;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.lang.NonNull;
import uk.ac.ukbiobank.ams.framework.validation.CodeMessageDto;

/**
 * The message in response as error or warning delivering to the caller.
 */
@JsonInclude(NON_NULL)
public class ResponseMessageDto {

  private String code;

  private String message;

  private String[] messageArgs;

  public ResponseMessageDto(@NonNull final CodeMessageDto codeMessage) {
    this.code = codeMessage.getCode();
    this.message = codeMessage.getMessage();
  }

  public ResponseMessageDto(@NonNull final String code, @NonNull final String message) {
    this.code = code;
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String[] getMessageArgs() {
    return messageArgs;
  }

  public void setMessageArgs(String[] messageArgs) {
    this.messageArgs = messageArgs;
  }

  @Override
  public String toString() {
    return "ResponseDetailObjectDto{" +
        "code='" + code + '\'' +
        ", message='" + message + '\'' +
        '}';
  }
}
