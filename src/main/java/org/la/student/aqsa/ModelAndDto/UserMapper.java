package org.la.student.aqsa.ModelAndDto;

import org.dozer.DozerBeanMapper;
import org.la.student.aqsa.ModelAndDto.UserDto;

public class UserMapper {
	DozerBeanMapper mapper = new DozerBeanMapper();
	
public static void main(String[] args) {
	User user = new User();
	user.setId(67);
	user.setName("khan");
	user.setDob("9.1.1999");
	user.setEmail("khan@gmail.com");
	
	UserMapper usermain = new UserMapper();
	UserDto dto = usermain.userToUserDto(user);
	System.out.println(dto);
	
	}
	
	
	
	public UserDto userToUserDto(User user){
		
		UserDto dto = mapper.map(user, UserDto.class);
		
		return dto;
		
	}


}
