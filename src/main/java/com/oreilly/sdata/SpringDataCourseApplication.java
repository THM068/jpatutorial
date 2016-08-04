package com.oreilly.sdata;

import com.oreilly.sdata.domains.*;
import com.oreilly.sdata.repositories.AccountOwnerRepository;
import com.oreilly.sdata.repositories.CompanyRepository;
import com.oreilly.sdata.repositories.EmployeeRepository;
import com.oreilly.sdata.repositories.UserRepository;
import com.oreilly.sdata.services.AccountBandService;
import com.oreilly.sdata.services.RoleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan(value = "com.oreilly.sdata")
public class SpringDataCourseApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDataCourseApplication.class, args);
		RoleService roleService = ctx.getBean(RoleService.class);
		AccountBandService accountBandService = ctx.getBean(AccountBandService.class);
		CompanyRepository companyRepository = ctx.getBean(CompanyRepository.class);
		AccountOwnerRepository accountOwnerRepository = ctx.getBean(AccountOwnerRepository.class);
		EmployeeRepository employeeRepository = ctx.getBean(EmployeeRepository.class);
		UserRepository userRepository = ctx.getBean(UserRepository.class);

		String [] roles = { "ROLE_MASTER", "ROLE_BOSS", "ROLE_PARENT"};

		for(String role: roles) {
			Role r = roleService.findByAuthority(role);

			if(null == r) {
				Role nRole = new Role();
				nRole.setAuthority(role);
				nRole.setVersion(1L);
				roleService.save(nRole);
			}
		}

		roleService.findAll().forEach((Role role) ->{
			System.out.println(role.getAuthority());
		});

		List<String> list = new ArrayList<String>(){
			{
				add("Kerrie");
				add("Lorraine");
				add("Mary");
			}
		};

		accountBandService.findAll().forEach((AccountBand ab)->{
			System.out.println(ab.toString());
		});

		companyRepository.findAll().forEach((Company c)->{
			System.out.println(c.getName());
		});

		System.out.println("The account owner list");
		accountOwnerRepository.findAll().forEach((AccountOwner owner)->{
			System.out.println(owner.getCompany());
		});

		System.out.println("Employee list");
		employeeRepository.findAll().forEach((Employee emp)->{
			System.out.println(emp.getName());
		});

		userRepository.findAll().forEach((User user)->{
			System.out.println(user.getUsername());
		});

	}
}
