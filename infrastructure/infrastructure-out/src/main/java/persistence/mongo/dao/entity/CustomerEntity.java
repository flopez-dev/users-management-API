package persistence.mongo.dao.entity;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Value
@Builder(toBuilder = true)
@Document("customers")
public class CustomerEntity {

  @Id
  UUID id;

  String email;
  String name;
  String lastName;
  String password;

}
