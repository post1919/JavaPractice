package com.dongah.pattern;

import lombok.Getter;

@Getter
public class UserInfo {
    private String userId;
    private String userName;
    private String password;
    private String email;

    public UserInfo(UserInfoBuilder userInfoBuilder) {
        this.userId = userInfoBuilder.userId;
        this.userName = userInfoBuilder.userName;
        this.password = userInfoBuilder.password;
        this.email = userInfoBuilder.email;
    }

    public static UserInfoBuilder builder(){
        return new UserInfoBuilder();
    }

    public static class UserInfoBuilder {
        private String userId;
        private String userName;
        private String password;
        private String email;

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

        public UserInfoBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserInfo build(){
            return new UserInfo(this);
        }
    }
}