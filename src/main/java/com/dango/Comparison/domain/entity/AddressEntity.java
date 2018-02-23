package com.dango.Comparison.domain.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "INFYRETAIL_USER_ADDRESS")
@SequenceGenerator(name = "AddressPkey", sequenceName = "DB_AddressPkey", allocationSize = 1)
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AddressPkey")
    @Column(name = "address_id")
    private Integer addressId;
    @Column(name = "door_no")
    private String doorNo;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "pin")
    private Integer pin;
}
