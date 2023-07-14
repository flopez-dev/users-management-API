package persistence.mongo.repository;

import lombok.AllArgsConstructor;
import model.Customer;
import persistence.mongo.dao.repository.CustomerMongoDao;
import persistence.mongo.mapper.CustomerMapper;
import ports.output.CustomerRepository;

@AllArgsConstructor
public class MongoCustomerRepository implements CustomerRepository {

  private CustomerMongoDao mongoRepository;
  private CustomerMapper customerMapper;

  @Override
  public Customer add(Customer customer) {
    mongoRepository.save(customerMapper.toEntity(customer));
    return null;
  }
}
