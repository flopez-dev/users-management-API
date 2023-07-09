package dto;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

/**
 * DTO object with the required data to register a new customer.
 */
@Value
@Builder(toBuilder = true)
public class CustomerRegistrationDto {

  @NonNull
  String email;
  @NonNull
  String password;
  @NonNull
  String name;
  @NonNull
  String lastName;
}
