package com.dongah.stream.tomap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapTest2 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));

        Map<String, String> result = listToMap(bookList);
        Iterator<String> it = result.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = result.get(key);
            System.out.format("key=> %s, val=> %s\n", key, value);
        }
    }

    private static Map<String, String> listToMap(List<Book> books) {
        Map<String, String> result = books.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
        return result;
    }
}
