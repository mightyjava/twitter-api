package twitter.api

class Query {
    Integer id
    String query

    static constraints = {
        query nullable: false
    }
}
