package com.kirg.shop.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Category {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "Name")
    private String name;
}
