public class Admin {
    private int id;
    private String username;
    private String password;

    public Admin(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public boolean checkPassword(String password) { return this.password.equals(password); }

    public void approveArticle(Article article) {
        article.setPublished(true);
        article.setStatus("approve");
        article.publishDate = "2023-11-06";
    }

    public void rejectArticle(Article article) {
        article.setPublished(false);
        article.setStatus("Article has been rejected!!")    ;
    }
}