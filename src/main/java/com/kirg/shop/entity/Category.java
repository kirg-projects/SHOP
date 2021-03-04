package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Category")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long id;

    @Column(name = "Name")
    @NotNull
    private String name;

    @OneToMany(mappedBy = "category",
            cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    private List<Product> products;

}
