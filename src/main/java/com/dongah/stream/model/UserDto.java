package com.dongah.stream.model;

import lombok.Builder;
import lombok.Data;

@Data
public class UserDto {
    private Integer upk;
    private String uid;
    private String uname;
    private String uemail;
    private String udept;
    private UserType userType;

    @Builder
    public UserDto(Integer upk, String uid, String uname, String uemail, String udept, UserType userType){
        this.upk = upk;
        this.uid = uid;
        this.uname = uname;
        this.uemail = uemail;
        this.udept = udept;
        this.userType = userType;
    }
}
