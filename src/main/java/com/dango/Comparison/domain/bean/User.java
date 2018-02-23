package com.dango.Comparison.domain.bean;

import lombok.*;

import java.util.Calendar;


@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Getter
    @Setter
	private String userId;
    @Getter
    @Setter
	private String userName;
	private UserRole userRole;
    @Getter
    @Setter
	private String password;
    @Getter
    @Setter
	private String email;
    @Getter
    @Setter
	private String mobileNumber;
    @Getter
    @Setter
	private Calendar dateOfBirth;
    @Getter
    @Setter
	private Address address;

	private Gender gender;
	private UserType userType;
    @Getter
    @Setter
	private Character userStatus;

    @Getter
    @Setter
	private String choice;
    @Getter
    @Setter
	private String message;
    @Getter
    @Setter
	private Boolean isClicked;


	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		switch (userRole.charAt(0)) {
		case 'A':
			this.userRole = UserRole.ADMIN;
			break;
		case 'S':
			this.userRole = UserRole.SUPPLIER;
			break;
		case 'C':
			this.userRole = UserRole.CUSTOMER;
			break;
		}
	}


	public Gender getGender() {
		return gender;
	}

	public void setGender(String gender) {
		switch (gender.charAt(0)) {
		case 'F':
			this.gender = Gender.FEMALE;

			break;

		case 'M':
			this.gender = Gender.MALE;
			break;
		}
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		switch (userType.charAt(0)) {
		case 'G':
			this.userType = UserType.GOLD;
			break;
		case 'S':
			this.userType = UserType.SILVER;
			break;
		case 'P':
			this.userType = UserType.PLATINUM;
			break;
		}
	}


}
