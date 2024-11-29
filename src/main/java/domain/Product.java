package domain;

public class Product {

    private int id;
    private String title;
    private String description;
    private String author;
    private int pages;
    private int price;

    public Product(String title, String description, String author, int pages, int price) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public Product(int id, String title, String description, String author, int pages, int price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id + '\''+
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}
