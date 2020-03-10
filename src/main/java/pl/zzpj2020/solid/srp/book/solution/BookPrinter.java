package pl.zzpj2020.solid.srp.book.solution;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor
public class BookPrinter {

    private Book book;
    private int currentPage = 0;
    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;

    public String getCurrentPageContents() {
        return book.getPages().get(currentPage);
    }

    public void turnPage() {
        currentPage ++;
    }

    /**
     * Prints the current page.
     */
    public void printCurrentPage() {
        System.out.println(book.getPages().get(currentPage));
    }
    /**
     * Prints all pages
     * @return
     */
    public String printAllPages() {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
