package GUVI.Project.Mini1.Service;

import GUVI.Project.Mini1.Model.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Userserv {
    List<UserDto> getAllUsers();
    UserDto getUserById(Long id);
    UserDto saveUser(UserDto userDto);
    UserDto updateUser(UserDto userDto,Long id);
    void deleteUser(Long id);
}
