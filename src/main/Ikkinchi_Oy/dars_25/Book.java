package Ikkinchi_Oy.dars_25;

public class Book implements Cloneable {
    private String title;
    private String author;
    private String publisher;
    private Integer publisherYer;
    private Integer pages;

    public Book(String title, String author, String publisher, Integer publisherYer, Integer pages) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publisherYer = publisherYer;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPublisherYer() {
        return publisherYer;
    }

    public void setPublisherYer(Integer publisherYer) {
        this.publisherYer = publisherYer;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publisherYer=" + publisherYer +
                ", pages=" + pages +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
