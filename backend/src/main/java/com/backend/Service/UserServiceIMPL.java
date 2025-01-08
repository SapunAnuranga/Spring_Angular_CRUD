package com.backend.Service;

import com.backend.DTO.UserDTO;
import com.backend.DTO.UserSaveDTO;
import com.backend.Model.User;
import com.backend.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
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
}
