package entity;

import lombok.Builder;
import lombok.Value;

/**
 * Address domain object.
 */
@Value
@Builder(toBuilder = true)
public class Address {

  String street;
  String city;
  String state;
  String zipCode;
  String country;
}
