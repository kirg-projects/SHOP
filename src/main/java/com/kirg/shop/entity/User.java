package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long id;
    @Column(name = "login", length = 25)
    @NotNull
    private String login;
    @Column(name = "password", length = 25)
    @NotNull
    private String password;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, optional = false)
    private Wallet wallet;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, optional = false)
    private UserData userData;
}
