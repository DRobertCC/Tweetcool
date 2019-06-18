package com.codecool.web.service;

import com.codecool.web.model.Tweet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TweetService {

    private static TweetService ourInstance = new TweetService();

    private List<Tweet> tweets = null;

    private static int nextId = 0;

    private TweetService() {
        tweets = new ArrayList<>();
    }

    public static TweetService getInstance() {
        return ourInstance;
    }

    public void addTweet(String name, String content, Date timeStamp) {
        tweets.add(new Tweet(++nextId, name, content, timeStamp));
    }

    public List<Tweet> getTweets() {
        return tweets;
    }
}
