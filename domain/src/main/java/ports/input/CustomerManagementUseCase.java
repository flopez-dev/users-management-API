package ports.input;

import model.Customer;

/**
 * Customer repository service.
 */
public interface CustomerManagementUseCase {

  Customer add(Customer customer);
}
