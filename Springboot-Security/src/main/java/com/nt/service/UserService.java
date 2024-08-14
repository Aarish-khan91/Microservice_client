package com.nt.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.nt.model.User;

@Service
public class UserService {

	public List<User> getAllUsers() {

		User u1 = new User("aarish-khan", String.valueOf(new Random().nextInt(100000)), 25);
		User u2 = new User("Danish-sheikh", String.valueOf(new Random().nextInt(100000)), 24);
		User u3 = new User("Md-Huzefa", String.valueOf(new Random().nextInt(100000)), 19);


		return new ArrayList<>(Arrays.asList(u1, u2,u3));

	}
}
