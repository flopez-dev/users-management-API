package dto;

import enums.CustomerStatus;
import java.util.UUID;
import lombok.Builder;
import lombok.Value;

/**
 * DTO object with the required data to register a new customer.
 */
@Value
@Builder(toBuilder = true)
public class CustomerDto {

  UUID customerId;
  String email;
  String name;
  String lastName;
  CustomerStatus status;
}
