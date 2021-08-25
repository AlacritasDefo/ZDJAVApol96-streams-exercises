package pl.sda.zadanie2;

import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private double price;
    private int yearOfPublication;
    private List<Author> listOfAuthors;
    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public List<Author> getListOfAuthors() {
        return listOfAuthors;
    }

    public void setListOfAuthors(List<Author> listOfAuthors) {
        this.listOfAuthors = listOfAuthors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title) && Objects.equals(listOfAuthors, book.listOfAuthors) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yearOfPublication, listOfAuthors, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfPublication=" + yearOfPublication +
                ", listOfAuthors=" + listOfAuthors +
                ", genre='" + genre + '\'' +
                '}';
    }

    public Book(String title, double price, int yearOfPublication, List<Author> listOfAuthors, String genre) {
        this.title = title;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.listOfAuthors = listOfAuthors;
        this.genre = genre;


    }
}
