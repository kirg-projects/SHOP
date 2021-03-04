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
    @Column(name = "id", updatable = false)
    private long id;
    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "User_id")
    private User user;
}
