package com.backend.DTO;

public class UserUpdateDTO {

    private int userId;
    private String userName;
    private String userAddress;
    private int mobile;

    public UserUpdateDTO(int userId, String userName, String userAddress, int mobile) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.mobile = mobile;
    }

    public UserUpdateDTO() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
