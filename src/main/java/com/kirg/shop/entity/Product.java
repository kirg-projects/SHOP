package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "Product")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long id;

    @NotNull
    @Column(name = "Name")
    private String name;

    @NotNull
    @NumberFormat
    @Column(name = "Price", precision = 4, scale = 2)
    private BigDecimal price;

    @DateTimeFormat
    @CreationTimestamp
    @Column(name = "Added", updatable = false)
    private final Timestamp added;

    @NotNull
    @Column(name = "Amount")
    private Integer amount;

    //Description is nullable
    @Column(name = "Description")
    private String description;

    @Lob
    @Column(name = "Photo", length = 1000)
    private byte[] photo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Seller")
    private User seller;

}
