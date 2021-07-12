package com.dongah.pattern;

import lombok.Getter;

@Getter
public class BuilderPatternModel {
    private String userId;
    private String userName;
    private String password;
    private String email;

    private BuilderPatternModel(BuilderPatternModelBuilder builder){
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.password = builder.password;
        this.email = builder.email;
    }

    public static BuilderPatternModelBuilder builder(){
        return new BuilderPatternModelBuilder();
    }

    public static class BuilderPatternModelBuilder {
        private String userId;
        private String userName;
        private String password;
        private String email;

        public BuilderPatternModelBuilder userId(String userId){
            this.userId = userId;
            return this;
        }

        public BuilderPatternModelBuilder userName(String userName){
            this.userName = userName;
            return this;
        }

        public BuilderPatternModelBuilder password(String password){
            this.password = password;
            return this;
        }

        public BuilderPatternModelBuilder email(String email){
            this.email = email;
            return this;
        }

        public BuilderPatternModel build(){
            return new BuilderPatternModel(this);
        }
    }
}
