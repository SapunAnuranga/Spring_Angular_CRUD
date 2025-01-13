package com.backend.Service;

import com.backend.DTO.UserDTO;
import com.backend.DTO.UserSaveDTO;
import com.backend.DTO.UserUpdateDTO;
import com.backend.Model.User;
import com.backend.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public String addUser(UserSaveDTO userSaveDTO) {
        User user = new User(
                userSaveDTO.getUserName(),
                userSaveDTO.getUserAddress(),
                userSaveDTO.getMobile()
        );
        userRepo.save(user);
        return user.getUserName();
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<User> getUsers = userRepo.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user : getUsers) {
            UserDTO userDTO = new UserDTO(
                    user.getUserId(),
                    user.getUserName(),
                    user.getUserAddress(),
                    user.getMobile()
            );
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }


    @Override
    public String updateUser(UserUpdateDTO userUpdateDTO) {

        if (userRepo.existsById(userUpdateDTO.getUserId())) {

            User user = userRepo.getById(userUpdateDTO.getUserId());

            user.setUserName(userUpdateDTO.getUserName());
            user.setUserAddress(userUpdateDTO.getUserAddress());
            user.setMobile(userUpdateDTO.getMobile());
            userRepo.save(user);

            return "updated successfully.";
        }
        else
        {
            return "Error: User Id not found.";
        }
    }

    @Override
    public boolean deleteUser(int id) {

        if(userRepo.existsById(id))
        {
            userRepo.deleteById(id);
        }
        else
        {
            System.out.println("Error: User Id not found.");
        }

        return true;
    }

}
