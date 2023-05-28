package lt.code.academy.autobiciuliaiapi.users.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bson.types.ObjectId;

@Getter
@AllArgsConstructor
public class UserDoesNotExistRunTimeException extends RuntimeException {
    private final ObjectId id;
}
