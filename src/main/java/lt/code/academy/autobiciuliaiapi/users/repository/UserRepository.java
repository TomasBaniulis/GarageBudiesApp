package lt.code.academy.autobiciuliaiapi.users.repository;

import lt.code.academy.autobiciuliaiapi.users.document.UserDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDocument, ObjectId> {


}
