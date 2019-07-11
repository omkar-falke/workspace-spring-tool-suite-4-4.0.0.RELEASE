package com.cjc.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class MyUserDetails implements UserDetailsService {
	@Autowired
	UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Student st=ur.findByUsername(username);
		
		if(st==null)
		{
			throw new  UsernameNotFoundException("user 4014");
		}
		return new UserPrinciple(st);
	}

}