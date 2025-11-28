package uk.ac.ukbiobank.ams.framework.http;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.springframework.lang.NonNull;

/**
 * API envelope for data return and error messages.
 *
 * @param <T>
 */
@JsonInclude(NON_NULL)
public class ApiResponseDto<T> {

  /**
   * It contains the retrieved data for the API request.
   */
  @JsonProperty(index = 1)
  private T data;

  /**
   * It contains error messages when processing the API request.
   */
  @JsonProperty(index = 4)
  private List<ResponseMessageDto> errors;

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public void setErrors(@NonNull final List<ResponseMessageDto> errors) {
    if (!errors.isEmpty()) {
      this.errors = errors;
    }
  }
}