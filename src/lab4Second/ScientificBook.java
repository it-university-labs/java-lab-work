package lab4Second;

public class ScientificBook extends Book{
    private int price;
    private String publisher;

    ScientificBook() {

    }

    ScientificBook(String name, String code, int pages, int price, String publisher) {
        super(name, code, pages);
        this.price = price;
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String getBookData() {
        StringBuilder data = new StringBuilder(super.getBookData());
        data.append(price).append(" ").append(publisher);
        return data.toString();
    }
}
