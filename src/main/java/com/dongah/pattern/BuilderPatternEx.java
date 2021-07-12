package com.dongah.pattern;

public class BuilderPatternEx {
    public static void main(String[] args) {
        UserInfo2 userInfo = UserInfo2.builder()
                .userId("1")
                .userName("2")
                .password("3")
                .nickname("4")
                .build();

        System.out.println(userInfo.getUserId());
        System.out.println(userInfo.getUserName());
        System.out.println(userInfo.getPassword());
        System.out.println(userInfo.getNickname());
    }
}
