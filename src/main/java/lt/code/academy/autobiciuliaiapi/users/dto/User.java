package lt.code.academy.autobiciuliaiapi.users.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.autobiciuliaiapi.data.RepairBooking;
import lt.code.academy.autobiciuliaiapi.garages.dto.Garage;
import lt.code.academy.autobiciuliaiapi.data.Address;
import lt.code.academy.autobiciuliaiapi.data.Car;
import lt.code.academy.autobiciuliaiapi.users.document.UserDocument;
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
    private String repeatPassword;
    private String phoneNumber;
    private Address address;
    private Set<Car> cars;
    private Set<Garage> favouriteGarages;
    private Set<RepairBooking> userBookings;

    public User(ObjectId id, String name, String surname, String email, String password, String phoneNumber, Address address, Set<Car> cars, Set<Garage> favouriteGarages, Set<RepairBooking> userBookings) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.cars = cars;
        this.favouriteGarages = favouriteGarages;
        this.userBookings = userBookings;
    }

    public static User convert (UserDocument userDocument){
        return new User(userDocument.getId(),
                userDocument.getName(),
                userDocument.getSurname(),
                userDocument.getEmail(),
                userDocument.getPassword(),
                userDocument.getPhoneNumber(),
                userDocument.getAddress(),
                userDocument.getCars(),
                userDocument.getFavouriteGarages(),
                userDocument.getUserBookings());
    }
}
