package lt.code.academy.autobiciuliaiapi.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.util.UUID;
@NoArgsConstructor
@Setter
@Getter
public class CustomerComment {
    private UUID id;
    private String reviewText;
    private ObjectId userId;
    private LocalDate reviewDate;
}
