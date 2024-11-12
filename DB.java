public class DB {
    private Author[] authors;
    private int authorCount;
    private Category[] categories;

    public DB(int maxAuthors) {
        authors = new Author[maxAuthors];
        authorCount = 0;
        categories = createDefaultCategories();
    }

    private Category[] createDefaultCategories() {
        return new Category[] {
                new Category(1, "Tech"),
                new Category(2, "Sport"),
                new Category(3, "Science")
        };
    }

    public void registerAuthor(Author author) {
        if (authorCount < authors.length) {
            authors[authorCount++] = author;
        }
    }


    public Author login(String username, String password) {
        for (Author author : authors) {
            if (author != null && author.getUsername().equals(username) && author.checkPassword(password)) {
                return author;
            }
        }
        return null;
    }
    public Category[] getCategories() {
        return categories;
    }
}