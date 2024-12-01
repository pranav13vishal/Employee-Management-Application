//package GUVI.Project.Mini1.Controller;
//
//import GUVI.Project.Mini1.Model.UserDto;
//import GUVI.Project.Mini1.Service.UserService;
//import GUVI.Project.Mini1.exception.Emailpresent;
//import GUVI.Project.Mini1.exception.PhoneNumberPresent;
//import jakarta.validation.Valid;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@AllArgsConstructor
//@Controller
//public class UserController {
//
//    private UserService userService;
//    @GetMapping("/")
//    public String getAll(Model model) {
//        List<UserDto> upUsers = userService.getAllUsers();
//        model.addAttribute("upUsers", upUsers);
//        return "user";
//    }
//    //  View all users
//    @GetMapping("/user")
//    public String getAllUsers(Model model) {
//        List<UserDto> upUsers = userService.getAllUsers();
//        model.addAttribute("upUsers", upUsers);
//        return "user";
//    }
//
//    // Show form to create a new user
//    @GetMapping("/user-form")
//    public String showCreateUserForm(Model model) {
//        UserDto userDto = new UserDto();
//        model.addAttribute("userDto", userDto);
//        return "user-form";
//    }
//
//    // Save new user
//    @PostMapping("/create")
//    public String createUser(@ModelAttribute @Valid UserDto userDto, BindingResult bindingResult, Model model) {
//        if (bindingResult.hasErrors()) {
//            return "user-form"; // Return to the form page if validation errors exist
//        }
//        try {
//            userService.saveUser(userDto);
//            return "redirect:/user";
//        } catch (Emailpresent ex) {
//            model.addAttribute("errorMessage", "Email Already Present");
//            return "user-form";
//        } catch (PhoneNumberPresent ex) {
//            model.addAttribute("errorMessage", "Phone Number Already Present");
//            return "user-form";
//        }
//    }
//
//    // View user details
//    @GetMapping("/user/{id}")
//    public String getUserDetails(@PathVariable("id") Long id, Model model) {
//        UserDto user = userService.getUserById(id);
//        model.addAttribute("user", user);
//        return "user-view"; // Create a page to view details if necessary
//    }
//
//    // Show form to edit user
//    @GetMapping("/user-edit/{id}")
//    public String showEditUserForm(@PathVariable("id") Long id, Model model) {
//        UserDto user = userService.getUserById(id);
//        model.addAttribute("user", user);
//        return "user-update"; // This page will be for editing a user
//    }
//
//    // Update user
//    @PostMapping("/user-update/{id}")
//    public String updateUser(@PathVariable("id") Long id, @ModelAttribute("user") @Valid UserDto user,  Model model) {
//        try {
//            userService.updateUser(user, id);
//            return "redirect:/user";
//        } catch (Emailpresent ex) {
//            model.addAttribute("errorMessage", "Email Already Present");
//            return "/user-update";
//        } catch (PhoneNumberPresent ex) {
//            model.addAttribute("errorMessage", "Phone Number Already Present");
//            return "/user-update";
//        }
//    }
//
//    // Delete user
//    @GetMapping("/delete/{id}")
//    public String deleteUser(@PathVariable("id") Long id) {
//        userService.deleteUser(id);
//        return "redirect:/user";
//    }
//}
