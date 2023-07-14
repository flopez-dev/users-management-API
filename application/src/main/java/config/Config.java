package config;

import mapper.CustomerMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ports.output.CustomerRepository;
import usecases.RegisterCustomerUseCase;

@Configuration
@ComponentScan("mapper")
public class Config {

  @Bean
  RegisterCustomerUseCase registerCustomerUseCase(final CustomerRepository repository,
      final CustomerMapper customerMapper) {
    return new RegisterCustomerUseCase(repository, customerMapper);
  }
}
