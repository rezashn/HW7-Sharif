public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Article[] articles;
    private int articleCount;

    public Author(int id, String firstName, String lastName, String username, String password, int maxArticles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.articles = new Article[maxArticles];
        this.articleCount = 0;
    }
    public String getUsername() {
        return username;
    }
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
    public void addArticle(Article article) {
        if (articleCount < articles.length) {
            articles[articleCount++] = article;
        }
    }
    public Article[] getArticles() {
        return articles;
    }
}