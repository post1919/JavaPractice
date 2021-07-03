package com.dongah.stream.tomap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Book {
    private String name;
    private int releaseYear;
    private String isbn;
}
