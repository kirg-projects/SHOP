package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "User")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long id;
    @DateTimeFormat
    @CreationTimestamp
    @Column(name = "Joined", updatable = false)
    private final Timestamp joined;
    @Column(name = "login", length = 25)
    @NotNull
    private String login;
    @Column(name = "password", length = 25)
    @NotNull
    private String password;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private Wallet wallet;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private UserData userData;
}
