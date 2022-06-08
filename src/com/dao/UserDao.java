package com.dao;

import java.util.ArrayList;

import com.bean.UserBean;

public class UserDao {

	private static ArrayList<UserBean> users = new ArrayList<UserBean>();

	/*
	 * Instead of static block if we create a constructor so, every time constructor
	 * called and initialize the memory..so we used static block so one copy is
	 * generated.
	 */
	static {
		UserBean user = new UserBean();
		user.setFirstName("Admin");
		user.setEmail("admin@ecom.com");
		user.setPassword("admin");
		user.setRole("admin");
		user.setGender("female");

		UserBean user1 = new UserBean();
		user1.setFirstName("Rutvi");
		user1.setEmail("rutvi@ecom.com");
		user1.setPassword("rutvi2002");
		user1.setRole("customer");
		user1.setGender("female");

		users.add(user);
		users.add(user1);
	}

	public void addUser(UserBean user) {
		this.users.add(user);
	}

	public ArrayList<UserBean> getAllUsers() {
		return this.users;
	}

	public UserBean authenticate(String email, String password) {
		for (UserBean user : this.users) {
			if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
}
