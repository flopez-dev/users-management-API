import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import dto.CustomerDto;
import dto.CustomerRegistrationDto;
import enums.CustomerStatus;
import java.util.UUID;
import mapper.CustomerMapper;
import mapper.CustomerMapperImpl;
import model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ports.output.CustomerRepository;
import usecases.RegisterCustomerUseCase;

class RegisterCustomerUseCaseTest {

  private CustomerRepository customerRepository;

  private RegisterCustomerUseCase registerCustomerUseCase;

  private final CustomerMapper mapper = new CustomerMapperImpl();


  @BeforeEach
  void setUp() {
    this.customerRepository = mock(CustomerRepository.class);
    this.registerCustomerUseCase = new RegisterCustomerUseCase(customerRepository, this.mapper);
  }

  @Test
  void givenNewCustomerWhenRegistrationThenReturnCustomer() {
    //Given
    CustomerRegistrationDto registrationDto = getRegistrationDto();
    when(this.customerRepository.add(any())).thenReturn(getSavedCustomer());

    //When
    CustomerDto createdCustomer = this.registerCustomerUseCase.execute(registrationDto);

    //Then
    verify(customerRepository, times(1)).add(any());
    assertNotNull(createdCustomer.getCustomerId());
    assertEquals(createdCustomer.getName(), registrationDto.getName());
    assertEquals(createdCustomer.getLastName(), registrationDto.getLastName());
    assertEquals(createdCustomer.getEmail(), registrationDto.getEmail());
  }


  @Test
  void givenExistingCustomerWhenRegistrationThenReturnException() {
    //Given
    when(this.customerRepository.add(any())).thenThrow(
        new IllegalArgumentException("Customer already exists"));

    //When
    assertThrows(IllegalArgumentException.class,
        () -> this.registerCustomerUseCase.execute(getRegistrationDto()).toString());

    //Then
    verify(customerRepository, times(1)).add(any());
  }

  private static CustomerRegistrationDto getRegistrationDto() {
    return CustomerRegistrationDto.builder()
        .name("Francisco")
        .lastName("Lopez")
        .email("francisco@test.com")
        .password("12345Aa")
        .build();
  }

  private static Customer getSavedCustomer() {
    return Customer.builder()
        .customerId(UUID.randomUUID())
        .name("Francisco")
        .lastName("Lopez")
        .email("francisco@test.com")
        .status(CustomerStatus.ACTIVE)
        .build();
  }
}
