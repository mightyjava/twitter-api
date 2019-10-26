package twitter.api

class MyTweet {
    String profileImageUrl
    String userName
    String unmodifiedText
    Integer retweetCount
    String location
    Date createdAt

    static belongsTo = [query: Query]

    static constraints = {
        profileImageUrl nullable: false
        userName nullable: false
        unmodifiedText nullable: false
        retweetCount nullable:false
        location nullable: false
        createdAt nullable: false
    }
}
