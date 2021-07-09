package com.dongah.pattern;

public class BuilderPatternEx {
    public static void main(String[] args) {
        UserInfo userInfo = UserInfo.builder()
                .userId("1")
                .userName("2")
                .password("3")
                .email("4")
                .build();

        System.out.println(userInfo.getUserId());
        System.out.println(userInfo.getUserName());
        System.out.println(userInfo.getPassword());
        System.out.println(userInfo.getEmail());
    }
}
