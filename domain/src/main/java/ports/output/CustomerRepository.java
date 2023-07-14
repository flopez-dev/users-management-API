package ports.output;

import model.Customer;

/**
 * Customer repository service.
 */
public interface CustomerRepository {

  Customer add(Customer customer);
}
