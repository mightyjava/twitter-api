package twitter.api

import grails.gorm.transactions.Transactional
import org.springframework.social.twitter.api.Twitter
import org.springframework.social.twitter.api.impl.TwitterTemplate

@Transactional
class TwitterService {

    def serviceMethod() {

    }

    Twitter getTwitterTemplate() {
        String key = "hjCCckRdpgAsBBXqjqx7OunDv"
        String secret = "Ucg8B893t9afA5srQ9kbvTk6rkB73cu1IuYwKMJZdxDwAS1mLo"
        String accessToken = "418568274-OPz6FvJLKfl493FtV51Q0wCbmWVdiCmX0H5SQLb6"
        String accessTokenSecret = "S23IS7Cd0Xi94qRfSLYq2CMXjUORl5WZzG3xTOVyut1O0"
        return new TwitterTemplate(key, secret, accessToken, accessTokenSecret)
    }

    Query saveQuery(String searchQuery) {
        Query savedQuery = Query.findByQuery(searchQuery)
        if(savedQuery == null) {
            Query query = new Query()
            query.setQuery(searchQuery)
            return query.save()
        }
        return savedQuery
    }

    Query fetchQuery(String searchQuery) {
        return Query.findByQuery(searchQuery)
    }

    List<MyTweet> fetchTweets(Query query) {
        return MyTweet.findAllByQuery(query).asList()
    }

    String saveTweets(Query query, List<MyTweet> myTweets) {
        for (MyTweet myTweet : myTweets) {
            myTweet.setQuery(query)
            myTweet.merge()
        }
        return "Tweets saved successfully"
    }
}
