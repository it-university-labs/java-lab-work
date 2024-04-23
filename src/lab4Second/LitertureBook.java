package lab4Second;

public class LitertureBook extends Book{
    private String author;
    private int publishedYear;

    LitertureBook(){

    }
    LitertureBook(String name, String code, int pages, String author, int publishedYear) {
        super(name,code,pages);
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String getBookData() {
        StringBuilder data = new StringBuilder(super.getBookData());
        data.append(author).append(" ").append(publishedYear);
        return data.toString();
    }
}
