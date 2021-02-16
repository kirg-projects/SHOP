package com.kirg.shop.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ConfirmedAccounts")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class ConfirmedAccounts {
    @OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "User_id")
    private User user;
}
