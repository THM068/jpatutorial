package com.oreilly.sdata;

import com.oreilly.sdata.domains.Role;
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

	}
}
