package pl.zzpj2020.solid.srp.book.solution;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public class Book {

    private String title;
    private String author;
    private Map<Integer, String> pages;

    public Book(){
        pages = new HashMap<>();
        title = "A Great Book";
        author = "John Doe";
    }
}
