package com.backend.Controller;

import com.backend.DTO.UserDTO;
import com.backend.DTO.UserSaveDTO;
import com.backend.DTO.UserUpdateDTO;
import com.backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String SaveUser(@RequestBody UserSaveDTO userSaveDTO)
    {
        String id = userService.addUser(userSaveDTO);
        return id;
    }


    @GetMapping(path = "/getAllUser")
    public List<UserDTO> getAllUser()
    {
        List<UserDTO>allUsers = userService.getAllUser();
        return allUsers;
    }


    @PostMapping(path = "/update")
    public String updateUser(@RequestBody UserUpdateDTO userUpdateDTO)
    {
        return userService.updateUser(userUpdateDTO);
    }


    @DeleteMapping(path = "/deleteUser/{id}")
    public String deleteUser(@PathVariable(value = "id")int id)
    {
       boolean deleteuser = userService.deleteUser(id);
       return "Deleted successfully";
    }

}
