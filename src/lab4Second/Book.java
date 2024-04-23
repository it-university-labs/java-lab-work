package lab4Second;

public class Book {
    protected String name;
    protected String code;
    protected int pages;

    Book() {}
    Book(String name, String code, int pages) {
        this.name = name;
        this.code = code;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getBookData() {
        return name + " " + code + " " + pages;
    }
}
