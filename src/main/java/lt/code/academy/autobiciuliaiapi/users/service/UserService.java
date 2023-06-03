package lt.code.academy.autobiciuliaiapi.users.service;

import lombok.AllArgsConstructor;
import lt.code.academy.autobiciuliaiapi.data.Car;
import lt.code.academy.autobiciuliaiapi.data.RepairBooking;
import lt.code.academy.autobiciuliaiapi.garages.dto.Garage;
import lt.code.academy.autobiciuliaiapi.users.document.UserDocument;
import lt.code.academy.autobiciuliaiapi.users.dto.User;
import lt.code.academy.autobiciuliaiapi.users.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public User showUserById (ObjectId id){
        return User.convert(Objects.requireNonNull(userRepository.findById(id).orElse(null)));

    }

    public List<User> showAllUsers (){
        return userRepository.findAll()
                .stream()
                .map(User::convert)
                .toList();
    }

    public void createUser (User user){
        Set<Car> cars = new HashSet<>();
        Set<Garage> garages = new HashSet<>();
        Set < RepairBooking> bookings = new HashSet<>();
        user.setCars(cars);
        user.setFavouriteGarages(garages);
        user.setUserBookings(bookings);
        userRepository.save(UserDocument.convert(user));
    }

    public void deleteUser (ObjectId id){
        userRepository.deleteById(id);
    }

    public void updateUser (User user){
        showUserById(user.getId());
        userRepository.save(UserDocument.convert(user));


    }
}
