public class Article {
    private int id;
    private String title;
    private String content;
    private Category category;

    public Article(int id, String title, String content, Category category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public Category getCategory() {
        return category;
    }
}