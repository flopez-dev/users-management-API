package entity;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Value;

/**
 * Customer domain object. This objects represents the Customer entity.
 */
@Value
@Builder(toBuilder = true)
public class Customer {

  String username;
  String password;
  String email;
  String name;
  String lastName;
  LocalDate birthDate;
  Address address;
  String role;
  String profilePictureUrl;

}
