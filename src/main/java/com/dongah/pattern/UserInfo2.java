package com.dongah.pattern;

import lombok.Getter;

@Getter
public class UserInfo2 {
    private String userId;
    private String userName;
    private String password;
    private String nickname;

    private UserInfo2(UserInfoBuilder builder){
        userId = builder.userId;
        userName = builder.userName;
        password = builder.password;
        nickname = builder.nickname;
    }

    public static UserInfoBuilder builder(){
        return new UserInfoBuilder();
    }

    public static class UserInfoBuilder {
        private String userId;
        private String userName;
        private String password;
        private String nickname;

        public UserInfoBuilder userId(String userId){
            this.userId = userId;
            return this;
        }

        public UserInfoBuilder userName(String userName){
            this.userName = userName;
            return this;
        }

        public UserInfoBuilder password(String password){
            this.password = password;
            return this;
        }

        public UserInfoBuilder nickname(String nickname){
            this.nickname = nickname;
            return this;
        }

        public UserInfo2 build(){
            return new UserInfo2(this);
        }
    }
}
