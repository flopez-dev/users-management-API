package persistence.mongo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import persistence.mongo.dao.repository.CustomerMongoDao;
import persistence.mongo.mapper.CustomerMapper;
import persistence.mongo.repository.MongoCustomerRepository;
import ports.output.CustomerRepository;

@Configuration
@ComponentScan("persistence.mongo.mapper")
public class PersistenceConfig {

  @Bean
  CustomerRepository customerRepository(final CustomerMongoDao customerMongoDao,
      final CustomerMapper customerMapper) {
    return new MongoCustomerRepository(customerMongoDao, customerMapper);
  }
}
