package com.dongah.stream.optional;

import java.util.Date;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        //TO-BE
        Order order = new Order();
        order.setDate(new Date());
        //String result = getCityOfMemberFromOrderRefactoring(order);
        //System.out.println("result => " + result);

        Member member = getMemberIfOrderWithin(order, 10);
        System.out.println("member => " + member);

        Optional<Member> memberRefactoring = getMemberIfOrderWithinRefactoring(order, 10);
        System.out.println("memberRefactoring => " + memberRefactoring);

        //AS-IS
        /*Optional<Order> optOrder;
        Optional<Member> optMember;
        Member member = new Member();
        member.setAddress(new Address());
        member.setId(20210703L);
        member.setName("신동아");

        Optional<Address> optAddress;

        String text = "Shin Dong Ah";
        getTextLengthAsIs(text);
        getTextLengthToBe(text);

        System.out.println(Optional.ofNullable(text).map(String::length).orElse(0));*/
    }

    public static Member getMemberIfOrderWithin(Order order, int min){
        if( order != null && order.getDate().getTime() > System.currentTimeMillis() - min * 1000 ){
            return order.getMember();
        }

        return null;
    }

    public static Optional<Member> getMemberIfOrderWithinRefactoring(Order order, int min){
        return Optional.ofNullable(order)
                .filter(o -> o.getDate().getTime() > System.currentTimeMillis() - min * 1000)
                .map(Order::getMember);
    }

    //as-is
    private static void getTextLengthAsIs(String text) {
        Optional<String> nameText = Optional.ofNullable(text);
        int length;
        if(nameText.isPresent()){
            length = nameText.get().length();
        } else {
            length = 0;
        }
    }

    //to-be
    private static void getTextLengthToBe(String text) {
        int length = Optional.ofNullable(text).map(String::length).orElse(0);
        System.out.format("text=> %s, length=> %s\n", text, length);
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

    private static String getCityOfMemberFromOrderRefactoring(Order order){
        String city = Optional.ofNullable(order)
                .map(Order::getMember)
                .map(Member::getAddress)
                .map(Address::getCity)
                .orElse("서울");
        return city;
    }
}