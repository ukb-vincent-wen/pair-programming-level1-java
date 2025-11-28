package uk.ac.ukbiobank.ams.framework.exception;

import static org.slf4j.LoggerFactory.getLogger;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import uk.ac.ukbiobank.ams.framework.http.ApiResponseDto;
import uk.ac.ukbiobank.ams.framework.http.ResponseMessageDto;

/**
 * Handler to prepare proper API response for different exceptions.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

  private final Logger logger = getLogger(GlobalExceptionHandler.class);

  /**
   * Prepared API response for code message exception.
   */
  @ExceptionHandler(CodeMessagesException.class)
  public @NonNull ResponseEntity<Object> handleAmsCodeMessageException(@NonNull final CodeMessagesException ex) {
    // TODO: please return ApiResponseDto with errors of ResponseMessageDto with CodeMessage from exception
    return null;
  }

  /**
   * General handling for all errors.
   */
  @ExceptionHandler(Exception.class)
  public ResponseEntity<Object> handleDefaultException
  (Exception ex, WebRequest request) {
    logger.error("Internal Server Error.", ex);

    List<ResponseMessageDto> errorMessages = new ArrayList<>();
    errorMessages.add(new ResponseMessageDto("500", "Internal Server Error."));

    ApiResponseDto<?> apiResponseDto = new ApiResponseDto<>();
    apiResponseDto.setErrors(errorMessages);

    return new ResponseEntity<>(apiResponseDto, new HttpHeaders(), INTERNAL_SERVER_ERROR);
  }

}
