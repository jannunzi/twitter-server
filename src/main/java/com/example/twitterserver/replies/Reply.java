package com.example.twitterserver.replies;

import com.example.twitterserver.tweets.Tweet;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "replies")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer replyId;
    @ManyToOne
    @JsonIgnore
    private Tweet reply;
    @ManyToOne
    @JsonIgnore
    private Tweet repliedTo;

    @Transient
    public Tweet getTweetReply() {
        Tweet summary = new Tweet();
        summary.setTweetId(reply.getTweetId());
        summary.setTweet(reply.getTweet());
        summary.setTweetedOn(reply.getTweetedOn());
        summary.setTweetedBy(reply.getTweetedBy());
        summary.setLikes(reply.getLikes());
        return summary;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Tweet getReply() {
        return reply;
    }

    public void setReply(Tweet reply) {
        this.reply = reply;
    }

    public Tweet getRepliedTo() {
        return repliedTo;
    }

    public void setRepliedTo(Tweet repliedTo) {
        this.repliedTo = repliedTo;
    }
}
