package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Order")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long id;
    @DateTimeFormat
    @CreationTimestamp
    @Column(name = "started", updatable = false)
    private final Timestamp started;
    @Enumerated(EnumType.STRING)
    @Column(name = "Status")
    @NotNull
    private Status status;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            optional = false)
    @JoinColumn(name = "Buyer")
    private User buyer;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            optional = false)
    @JoinColumn(name = "Seller")
    private User seller;
}
