package usecases;

import dto.CustomerDto;
import dto.CustomerRegistrationDto;
import lombok.AllArgsConstructor;
import mapper.CustomerMapper;
import model.Customer;
import ports.output.CustomerRepository;

/**
 * Usecase to register customers into the system.
 */
@AllArgsConstructor
public class RegisterCustomerUseCase {

  private CustomerRepository customerRepository;

  private CustomerMapper mapper;

  /**
   * Executes the registration process for a customer.
   *
   * @param customerRegistrationDto The CustomerRegistrationDto containing the customer's
   *                                registration information.
   * @return The CustomerDto representing the registered customer.
   */
  public CustomerDto execute(CustomerRegistrationDto customerRegistrationDto) {
    final Customer savedCustomer = customerRepository.add(
        mapper.registrationDtoToCustomer(customerRegistrationDto));

    return mapper.customerToDto(savedCustomer);
  }
}
