package ports.output;

import model.Customer;

/**
 * Customer repository service.
 */
public interface CustomerRepository {

  Customer save(Customer customer);
}
