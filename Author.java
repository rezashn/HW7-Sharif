public class Author {
    private int id;
    private String username;
    private String nationalCode;
    private String birthday;
    private String password;
    private Article[] articles;
    private int articleCount;

    public Author(int id, String username, String nationalCode, String birthday, String password, int maxArticles) {
        this.id = id;
        this.username = username;
        this.nationalCode = nationalCode;
        this.birthday = birthday;
        this.password = password;
        this.articles = new Article[maxArticles];
        this.articleCount = 0;
    }

    public String getUsername() {
        return username;
    }
    public String getNationalCode() {
        return nationalCode;
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
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
}