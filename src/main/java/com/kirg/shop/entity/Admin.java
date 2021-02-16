package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Admin {
    @Id
    @NotNull
    @Column(name = "id")
    private long id;
    @OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "User_id")
    private User user;
}
