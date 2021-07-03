package com.dongah.stream.optional;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {

        //TO-BE
        Order o = new Order();
        String result = getCityOfMemberFromOrder(o);
        System.out.println("result => " + result);

        //AS-IS
        Optional<Order> optOrder;
        Optional<Member> optMember;
        Optional<Address> optAddress;

    }

    public static String getCityOfMemberFromOrder(Order order) {
        if (order != null) {
            Member member = order.getMember();
            if (member != null) {
                Address address = member.getAddress();
                if (address != null) {
                    String city = address.getCity();
                    if (city != null) {
                        return city;
                    }
                }
            }
        }
        return "Seoul"; // default
    }
}