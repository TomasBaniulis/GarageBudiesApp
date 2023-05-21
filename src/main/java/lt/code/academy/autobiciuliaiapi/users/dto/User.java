package lt.code.academy.autobiciuliaiapi.users.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.autobiciuliaiapi.carServices.dto.Garage;
import lt.code.academy.autobiciuliaiapi.data.Address;
import lt.code.academy.autobiciuliaiapi.data.Car;
import org.bson.types.ObjectId;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    private ObjectId id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    private Set<Address> addresses;
    private Set<Car> cars;
    private Set<Garage> favouriteGarages;



}
