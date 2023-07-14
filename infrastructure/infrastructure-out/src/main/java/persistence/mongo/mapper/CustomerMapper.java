package persistence.mongo.mapper;


import model.Customer;
import org.mapstruct.Mapper;
import persistence.mongo.dao.entity.CustomerEntity;

/**
 * Mapper interface for converting between Customer and its related DTOs.
 */
@Mapper
public interface CustomerMapper {

  CustomerEntity toEntity(Customer customer);

  Customer toDomain(CustomerEntity customerEntity);
}
