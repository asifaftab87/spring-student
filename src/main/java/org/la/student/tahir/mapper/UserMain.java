package org.la.student.tahir.mapper;

import org.dozer.DozerBeanMapper;
import org.la.student.tahir.dto.UserDto;
import org.la.student.tahir.model.User;

public class UserMain {

	DozerBeanMapper mapper = new DozerBeanMapper();
			
	public static void main(String[] args) {
	
		User user = new User();
		
		user.setname("Isa");
		user.setId(99);
		user.setDob("09-02-2012");
		user.setEmail("isal@mail.com");
		
		
		UserMain main = new UserMain();
		
		System.out.println(main.UserToUserDto(user));
		System.out.println(main.UserToUserDtoMapper(user));
		

	}
	
public UserDto UserToUserDto(User user) {
		
		UserDto dto = new UserDto();
		
		dto.setname(user.getName());
		dto.setId(user.getId());
		dto.setDob(user.getDob());
		dto.setEmail(user.getEmail());
		
		return dto;
		
	}

public UserDto UserToUserDtoMapper(User user) {
	
	UserDto dto = mapper.map(user, UserDto.class);
			
			return dto;
	}

}
	
	


