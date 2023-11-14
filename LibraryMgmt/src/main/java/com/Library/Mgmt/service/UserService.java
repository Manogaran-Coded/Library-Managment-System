package com.Library.Mgmt.service;
import org.springframework.stereotype.Service;
import com.Library.Mgmt.entity.User;
import com.Library.Mgmt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {
	  @Autowired
	    private UserRepository userRepository;

	    public List<User> findAll() {
	        return userRepository.findAll();
	    }

	    public User save(User user) {
	        return userRepository.save(user);
	    }
}
