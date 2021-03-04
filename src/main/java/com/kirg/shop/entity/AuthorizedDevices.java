package com.kirg.shop.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Authorized_Devices")
@Getter
@Setter
public class AuthorizedDevices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long id;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            optional = false)
    @JoinColumn(name = "User_id")
    private User user;
    @Column(name = "Name")
    @NotNull
    private String name;
    @Column(name = "MAC", nullable = false)
    @NotNull
    private String MAC;
}
