package model;

import enums.CustomerStatus;
import java.time.LocalDate;
import java.util.UUID;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

/**
 * Customer domain object. This objects represents the Customer entity.
 */
@Value
@Builder(toBuilder = true)
public class Customer {

  @NonNull
  String email;
  @NonNull
  String name;
  @NonNull
  String lastName;
  String password;

  UUID customerId;
  String username;
  LocalDate birthDate;
  String role;
  String profilePictureUrl;

  CustomerStatus status;
  Address address;
}
