package lt.code.academy.autobiciuliaiapi.users.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.autobiciuliaiapi.data.RepairBooking;
import lt.code.academy.autobiciuliaiapi.garage.dto.Garage;
import lt.code.academy.autobiciuliaiapi.data.Address;
import lt.code.academy.autobiciuliaiapi.data.Car;
import lt.code.academy.autobiciuliaiapi.users.dto.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Document(collection = "Users")
public class UserDocument {
    private ObjectId id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    private Set <Address> addresses;
    private Set<Car> cars;
    private Set<Garage> favouriteGarages;
    private Set<RepairBooking> userBookings;

    public static UserDocument convert (User user){
        return new UserDocument(user.getId(),
                user.getName(),
                user.getSurname(),
                user.getEmail(),
                user.getPassword(),
                user.getPhoneNumber(),
                user.getAddresses(),
                user.getCars(),
                user.getFavouriteGarages(),
                user.getUserBookings());
    }




}
