package com.exam;

import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.exam.helper.UserFoundException;
import com.exam.models.Role;
import com.exam.models.User;
import com.exam.models.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
	
	
	@Autowired
	//private UserService userService;
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		try
		{
			
		
		
		System.out.println("starting code");
		
		/*
		User user = new User();
		
		user.setFirstName("Siddhu");
		user.setLastName("Swami");
		user.setUsername("siddhuswami1498");
		user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
		user.setEmail("siddhuswami1498@gamil.com");
		user.setProfile("defualt.png");
		
		
		Role role1 = new Role();
		role1.setRoleId(44L);
		role1.setRoleName("ADMIN");
		
		
		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		
		User user1 = this.userService.createUser(user, userRoleSet);
		System.out.println(user1.getUsername());
		*/
		
		
		User user = new User();
		
		user.setFirstName("Jagdhish");
		user.setLastName("Jadhav");
		user.setUsername("jadhav@1");
		user.setPassword(this.bCryptPasswordEncoder.encode("Pass@123"));
		user.setEmail("aanantpawar15@gmail.com");
		user.setProfile("defualt.png");
		
		
		Role role1 = new Role();
		role1.setRoleId(44L);
		role1.setRoleName("ADMIN");
		
		
		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		
		User user1 = this.userService.createUser(user, userRoleSet);
		System.out.println(user1.getUsername());
		
		
		
		}catch(UserFoundException e)
		{
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
	}
	

}

