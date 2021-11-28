package com.example.twitterserver.users;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Timestamp joined;
}
