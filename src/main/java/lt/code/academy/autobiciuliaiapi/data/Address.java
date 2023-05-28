package lt.code.academy.autobiciuliaiapi.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.UUID;
@NoArgsConstructor
@Setter
@Getter
public class Address {
    private ObjectId Id;
    private String buildingNumber;
    private String flatNumber;
    private String street;
    private String town;
    private String postCode;

}
