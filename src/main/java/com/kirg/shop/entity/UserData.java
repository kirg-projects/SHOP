package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "User_Data")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "id", updatable = false)
    private long id;
    @NotNull
    @Column(name = "firstName", length = 20)
    private String firstName;
    @NotNull
    @Column(name = "lastName", length = 20)
    private String lastName;
    @Column(name = "brirthDate")
    private Date brirthDate;
    @NotNull
    @Column(name = "email")
    private String email;
    @Column(name = "phoneNumber", length = 9)
    private int phoneNumber;
    @Column(name = "city", length = 20)
    private String city;
    @Column(name = "country", length = 20)
    private String country;
    @Column(name = "postalCode", length = 10)
    private String postalCode;
    @Column(name = "street", length = 20)
    private String street;
    @Column(name = "apartmentNumber", length = 3)
    private String apartmentNumber;
    @Column(name = "desription", length = 100)
    private String desription;
    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            optional = false)
    @JoinColumn(name = "User_id")
    private User user;
    @NotNull
    @Column(name = "isSeller")
    private boolean isSeller;
}
