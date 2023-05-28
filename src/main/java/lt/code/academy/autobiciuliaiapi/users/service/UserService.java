package lt.code.academy.autobiciuliaiapi.users.service;

import lombok.AllArgsConstructor;
import lt.code.academy.autobiciuliaiapi.users.document.UserDocument;
import lt.code.academy.autobiciuliaiapi.users.dto.User;
import lt.code.academy.autobiciuliaiapi.users.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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
