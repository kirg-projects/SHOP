package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.type.StringNVarcharType;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="User_Data")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)

public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name ="id")
    private long id;
    @NotNull
    @Column(name = "firstName" , length = 20)
    private String firstName;
    @NotNull
    @Column(name = "lastName", length = 20)
    private String lastName;

    @NotNull
    @Column(name = "brirthDate")
    private Date brirthDate;
    @NotNull
    @Column(name = "email")
    private String email;
    @NotNull
    @Column(name = "phoneNumber", length = 9)
    private String phoneNumber;
    @NotNull
    @Column(name = "city", length = 20 )
    private  String city;
    @NotNull
    @Column(name = "country", length = 20)
    private String country;
    @NotNull
    @Column(name = "postalCode" , length = 10 )
    private String postalCode;
    @NotNull
    @Column (name = "street", length = 20)
    private String street;
    @Column (name = "apartmentNumber", length = 3)
    private String apartmentNumber;

    @Column (name = "desription" , length = 100 )
    private  String desription;


    // komentarz w sprawie encji danej w innym pliku
    @NotNull
    @Column (name = "userID")
    private long userID;
    @NotNull
    @Column (name = "isSeller")
    private boolean isSeller;

}
