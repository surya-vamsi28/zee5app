package com.zee.zee5app;

import java.math.BigDecimal;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.zee.zee5app.config.Config;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.exception.InvalidEmailException;
import com.zee.zee5app.exception.InvalidIdLengthException;
import com.zee.zee5app.exception.InvalidNameException;
import com.zee.zee5app.exception.InvalidPasswordException;
import com.zee.zee5app.repository.UserRepository;

public class MainSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		UserRepository userRepository = applicationContext.getBean(UserRepository.class);
		System.out.println(userRepository);
		UserRepository userRepository2 = applicationContext.getBean(UserRepository.class);
		System.out.println(userRepository2);
		
		System.out.println(userRepository.hashCode());
		System.out.println(userRepository2.hashCode());
		System.out.println(userRepository.equals(userRepository2));
		
		DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
		
		System.out.println(dataSource!=null);
		
		Register register = null;
		
			try {
				register = new Register("ZEE0000012", "Ramesh123", "Mahendran", "ramesh6@gmail.com","suryasurya", new BigDecimal("9441612222"));
			} catch (InvalidNameException | InvalidIdLengthException | InvalidEmailException
					| InvalidPasswordException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(userRepository.addUser(register));

		
		applicationContext.close();

	}

}
