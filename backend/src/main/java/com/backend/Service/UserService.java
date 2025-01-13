package com.backend.Service;

import com.backend.DTO.UserDTO;
import com.backend.DTO.UserSaveDTO;
import com.backend.DTO.UserUpdateDTO;

import java.util.List;


public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);


    List<UserDTO> getAllUser();

    String updateUser(UserUpdateDTO userUpdateDTO);

    boolean deleteUser(int id);
}
