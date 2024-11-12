public class Article {
    private int id;
    private String title;
    private String brief;
    private String content;
    private String createDate;
    private boolean isPublished;
    private String lastUpdateDate;
    private String publishDate;
    private String status;
    private Category category;
    private Tag[] tags;

    public Article(int id, String title, String brief, String content, String createDate,
                   boolean isPublished, String lastUpdateDate, String publishDate, String status,
                   Category category, Tag[] tags) {
        this.id = id;
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.createDate = createDate;
        this.isPublished = isPublished;
        this.lastUpdateDate = lastUpdateDate;
        this.publishDate = publishDate;
        this.status = status;
        this.category = category;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getBrief() {
        return brief;
    }
    public String getContent() {
        return content;
    }
    public String getCreateDate() {
        return createDate;
    }
    public boolean isPublished() {
        return isPublished;
    }
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }
    public String getPublishDate() {
        return publishDate;
    }
    public String getStatus() {
        return status;
    }
    public Category getCategory() {
        return category;
    }
    public Tag[] getTags() {
        return tags;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void editArticle(String title, String brief, String content, Category category, Tag[] tags) {
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.category = category;
        this.tags = tags;
        this.lastUpdateDate = "2023-11-06";
    }
}