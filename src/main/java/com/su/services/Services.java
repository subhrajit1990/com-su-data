package com.su.services;

import java.util.ArrayList;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.glassfish.jersey.internal.guava.Lists;
import org.springframework.stereotype.Service;

import com.su.entities.User;
import com.su.repositories.UserRepository;

@Service
public class Services {
	private Logger logger = Logger.getLogger(Services.class);

	@Inject
	UserRepository userRepository;

	public ArrayList<User> viewUsers() {
		ArrayList<User> users = Lists.newArrayList(userRepository.findAll());
		logger.info("DATA " + users.toString());
		return users;
	}
}
