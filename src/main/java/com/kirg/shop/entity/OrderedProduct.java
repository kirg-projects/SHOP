package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Ordered_Product")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class OrderedProduct {
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            optional = false)
    @JoinColumn(name = "Product_id")
    private Product product;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            optional = false)
    @JoinColumn(name = "Order_id")
    private Order order;
    @Column(name = "Product_amount")
    @NotNull
    private int productAmount;
}
