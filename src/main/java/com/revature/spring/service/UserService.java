package com.revature.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.spring.model.User;
import com.revature.spring.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User findByUserNameAndPassword(String userName, String password) {
		return userRepository.findByUserNameAndPassword(userName, password, 'A');
	}
	
	public User findByUserName(String userName){
		return userRepository.findByUserName(userName);
	}

	public User register(User user){
		return userRepository.save(user);
	}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findOne(int id) {
		return userRepository.findOne(id);
	}

	public User updatePassword(String newPassword, String username) {
		return userRepository.updatePassword(newPassword, username, 'A');
		
	}

}
