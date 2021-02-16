package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Wallet")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Wallet {
    @Id
    @Column(name = "id")
    @NotNull
    private long id;
    @OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH },
            optional = false)
    @JoinColumn(name = "User_id")
    private User user;
    @Column(name = "Cash")
    @NotNull
    private double cash;
}
