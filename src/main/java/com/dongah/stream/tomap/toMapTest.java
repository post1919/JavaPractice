package com.dongah.stream.tomap;

import java.util.*;
import java.util.stream.Collectors;

public class toMapTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));

        Map<String, String> result = listToMap(bookList);
        Iterator<String> it = result.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.format("key = %s, value = %s\n", key, result.get(key));
        }
    }

    public static Map<String, String> listToMap(List<Book> books) {
        /*return books.stream()
                .collect(
                    Collectors.toMap(Book::getIsbn, Book::getName)
                );*/

//        return books.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));

        Map<String, String> result = books.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));

        return result;
    }
}
