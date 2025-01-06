package com.backend.DTO;

public class UserSaveDTO   {
    private int userId;
    private String userName;
    private String userAddress;
    private int mobile;

    public UserSaveDTO(String userName, String userAddress, int mobile) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.mobile = mobile;
    }

    public UserSaveDTO() {
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
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
