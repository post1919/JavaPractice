package com.dongah.stream.optional;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Long id;
    private Date date;
    private Member member;
}
