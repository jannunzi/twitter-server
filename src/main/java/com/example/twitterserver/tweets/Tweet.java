package com.example.twitterserver.tweets;

import com.example.twitterserver.users.User;

import java.sql.Timestamp;

public class Tweet {
    private Integer tweetId;
    private String tweet;
    private Timestamp tweetedOn;
    private User tweetedBy;
}
