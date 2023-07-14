package persistence.mongo.dao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import persistence.mongo.dao.entity.CustomerEntity;

/**
 * This interface serves as a repository for managing CustomerEntity objects in MongoDB. It provides
 * CRUD (Create, Read, Update, Delete) operations for CustomerEntity instances.
 *
 * <p>The CustomerMongoDao interface extends the MongoRepository interface,
 * which provides generic methods for common database operations such as saving, deleting, and
 * finding entities based on their identifiers.
 *
 * <p>Note that this interface is annotated with the @Repository annotation, indicating
 * that it is a Spring Data repository and will be eligible for Spring's component scanning.
 *
 * @see org.springframework.data.mongodb.repository.MongoRepository
 */
@Repository
public interface CustomerMongoDao extends MongoRepository<CustomerEntity, String> {

}
