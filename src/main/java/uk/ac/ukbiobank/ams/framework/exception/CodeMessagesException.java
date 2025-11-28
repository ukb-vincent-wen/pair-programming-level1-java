package uk.ac.ukbiobank.ams.framework.exception;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import uk.ac.ukbiobank.ams.framework.validation.CodeMessageDto;

/**
 * Exception with error code and message.
 */
public class CodeMessagesException extends RuntimeException {

  private final CodeMessageDto codeMessage;

  public CodeMessagesException(@NonNull final CodeMessageDto codeMessage) {
    this(codeMessage, null);
  }

  public CodeMessagesException(@NonNull final CodeMessageDto codeMessage, @Nullable final Throwable cause) {
    super(cause);
    this.codeMessage = codeMessage;
  }

  public CodeMessageDto getCodeMessage() {
    return codeMessage;
  }
}
