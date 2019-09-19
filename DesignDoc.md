# Domain design:
User {
    UUID userId (Primary key),
    varchar name,
    varchar password
}

UserArticles {
    UUID userId (Primary key),
    list<Article> articles
}

Article {
    UUID articleId (Primary key),
    timestamp dateCreated,
    User author,
    varchar title,
    varchar content
}

ArticleComments {
    UUID articleId (Primay key),
    list<Comment> comments
}

Comment {
    UUID commentId (Primary key),
    User commentor,
    timestamp dateCommented,
    varchar content
}

# API design:

## authentication:
login

## Use cases:
createUser(Register)
createBook
createComment

findUser

listBooks
listComments

updateBook
updateComment

deleteBook
deleteComment