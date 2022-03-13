package com.ksiazka.ksiazka12.enties;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "usser")
public class Usser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;

    @Column(name = "name")
    private String name;

    @Column(name = "surrname")
    private String surrname;

    @Column(name = "phone")
    private int phone;
}
