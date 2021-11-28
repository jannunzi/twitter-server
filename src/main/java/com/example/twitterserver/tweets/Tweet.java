package com.example.twitterserver.tweets;

import com.example.twitterserver.users.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tweets")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tweetId;
    private String tweet;
    private Timestamp tweetedOn;
    @ManyToOne
    private User tweetedBy;
}
