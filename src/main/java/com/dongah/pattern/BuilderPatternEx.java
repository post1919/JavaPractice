package com.dongah.pattern;

public class BuilderPatternEx {
    public static void main(String[] args) {
        BuilderPatternModel model = BuilderPatternModel.builder().userId("1").userName("2").password("3").email("4").build();
        System.out.println(model.getUserId());
        System.out.println(model.getUserName());
        System.out.println(model.getPassword());
        System.out.println(model.getEmail());
    }
}
