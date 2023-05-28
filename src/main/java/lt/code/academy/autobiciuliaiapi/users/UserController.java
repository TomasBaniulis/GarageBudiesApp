package lt.code.academy.autobiciuliaiapi.users;

import lombok.AllArgsConstructor;
import static lt.code.academy.autobiciuliaiapi.EndPoint.*;

import lt.code.academy.autobiciuliaiapi.users.dto.User;
import lt.code.academy.autobiciuliaiapi.users.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(USERS)
public class UserController {

    private final UserService userService;
    @GetMapping(value = USER, produces = MediaType.APPLICATION_JSON_VALUE)
    public User ShowUser (@PathVariable(userId) ObjectId id){
        return userService.showUserById(id);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> showAllUsers(){
        return userService.showAllUsers();
    }



}
