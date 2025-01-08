package com.backend.Service;

import com.backend.DTO.UserDTO;
import com.backend.DTO.UserSaveDTO;

import java.util.List;


public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);


    List<UserDTO> getAllUser();
}
