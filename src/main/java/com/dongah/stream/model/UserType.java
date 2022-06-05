package com.dongah.stream.model;

import lombok.Getter;

public enum UserType {
    USER("USER", "사용자"),
    MANAGER("MANAGER", "관리자"),
    GUEST("GUEST", "비회원");

    private String name;
    private String value;

    private UserType(String name, String value){
        this.name = name;
        this.value = value;
    }

    public static UserType getByCode(String name) {
        for ( UserType type : values()) {
            if( type.name.equals(name) ) {
                return type;
            }
        }

        throw new IllegalArgumentException( "UserType No Data Found.." );
    }
}
