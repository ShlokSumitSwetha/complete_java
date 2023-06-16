package entity;

public class Book {
    private String name;
    private int releaseYear;

    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public Book(String name, int i, String isbn) {
        this.name= name;
        this.isbn =isbn;
        this.releaseYear =i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }




}
