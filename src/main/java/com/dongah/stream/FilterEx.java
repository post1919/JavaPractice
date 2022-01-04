package com.dongah.stream;

import com.dongah.stream.model.UserDto;
import com.dongah.stream.model.UserType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEx {
    public static void main(String[] args) {
        UserDto user1 = UserDto.builder()
                .upk(1)
                .uid("albatross")
                .uname("캐스팅엔")
                .uemail("dashin@castingn.com")
                .build();

        UserDto user2 = UserDto.builder()
                .upk(2)
                .uid("tspark")
                .uname("박태석")
                .uemail("tspark@castingn.com")
                .userType(UserType.USER)
                .build();

        UserDto user3 = UserDto.builder()
                .upk(3)
                .uid("lhk")
                .uname("이형국")
                .uemail("lhk@castingn.com")
                .userType(UserType.MANAGER)
                .build();

        UserDto user4 = UserDto.builder()
                .upk(4)
                .uid("kbs")
                .uname("강보성")
                .uemail("kbs@castingn.com")
                .userType(UserType.GUEST)
                .build();

        List<UserDto> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        List<UserDto> filterList = list.stream().filter(user -> UserType.getByCode("GUEST") == user.getUserType()).collect(Collectors.toList());

        filterList.forEach(System.out::println);
    }
}
