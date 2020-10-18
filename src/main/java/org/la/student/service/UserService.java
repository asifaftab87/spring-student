package org.la.student.service;

import java.util.List;
import java.util.Optional;

import org.la.student.model.User;
import org.la.student.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public User findById(long id) {
		
		Optional<User> option = userRepository.findById(id);
		
		if(option.isPresent()) {
			return option.get();
		}
		return null;
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User add(User user) {
		return userRepository.save(user);
	}
	
}
