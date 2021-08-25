package pl.sda.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private List<Book> listOfBooks = new ArrayList<>();

    public void addBook(Book book) {
        listOfBooks.add(book);
    }

    public List<Book> getAllFantasyBook() {
        return listOfBooks.stream().filter(book -> book.getGenre().equals("Fantasy")).collect(Collectors.toList());
    }

    public List<Book> getBooksPublishedBefore1999() {
        return listOfBooks.stream().filter(book -> book.getYearOfPublication() < 1999).collect(Collectors.toList());
    }
}
