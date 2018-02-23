package com.dango.Comparison.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "infyretail_user")
public class UserEntity {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_role")
    private Character userRole;
    @Column(name = "user_password")
    private String password;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_mobile_no")
    private String mobileNumber;
    @Column(name = "user_dob")
    private Calendar dateOfBirth;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_address_id", unique = true)
    private AddressEntity address;
    @Column(name = "user_gender")
    private Character gender;
    @Column(name = "user_type")
    private String userType;
    @Column(name = "user_status")
    private Character userStatus;
}
