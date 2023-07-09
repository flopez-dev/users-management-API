package mapper;

import dto.CustomerDto;
import dto.CustomerRegistrationDto;
import model.Customer;
import org.mapstruct.Mapper;

/**
 * Mapper interface for converting between Customer and its related DTOs.
 */
@Mapper
public interface CustomerMapper {

  Customer registrationDtoToCustomer(CustomerRegistrationDto registrationDto);

  CustomerDto customerToDto(Customer registrationDto);
}
