package twitter.api

import grails.converters.JSON
import org.grails.web.json.JSONObject
import org.springframework.social.twitter.api.Tweet

class TwitterController {

    def twitterService

    def myTweetList = new ArrayList<MyTweet>()

    def index() {

    }

    def searchTweets = {
        def query = params.query
        def queryObj = twitterService.fetchQuery(query)
        if(queryObj != null) {
            myTweetList = twitterService.fetchTweets(queryObj)
        } else {
            myTweetList = new ArrayList<MyTweet>()
            List<Tweet> tweets = twitterService.getTwitterTemplate().searchOperations().search(query).getTweets()
            for (Tweet tweet:tweets) {
                MyTweet myTweet = new MyTweet()
                myTweet.setUserName(tweet.getUser().getName())
                myTweet.setProfileImageUrl(tweet.getProfileImageUrl())
                myTweet.setUnmodifiedText(tweet.getUnmodifiedText())
                myTweet.setRetweetCount(tweet.getRetweetCount())
                myTweet.setLocation(tweet.getUser().getLocation())
                myTweet.setCreatedAt(tweet.getCreatedAt())
                myTweetList.add(myTweet)
            }
        }
        [
            tweets: myTweetList
        ]
    }

    def saveTweets = {
        JSONObject jsonObject = new JSONObject()
        jsonObject.put("message", twitterService.saveTweets(twitterService.saveQuery(params.query), myTweetList))
        render jsonObject as JSON
    }
}
