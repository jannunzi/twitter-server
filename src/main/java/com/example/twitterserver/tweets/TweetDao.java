package com.example.twitterserver.tweets;

import com.example.twitterserver.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TweetDao {
    @Autowired
    UserRepository userRepository;
    public List<Tweet> findTweetsByUser(Integer userId) {
        return userRepository.findById(userId).get().getTweets();
    }
}
