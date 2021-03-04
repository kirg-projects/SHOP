package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Bucket")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Bucket {
    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            optional = false)
    @JoinColumn(name = "User_id")
    private User user;
    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            optional = false)
    @JoinColumn(name = "Product_id")
    private Product product;
    @Column(name = "Product_amount")
    @NotNull
    private int productAmount;
}
