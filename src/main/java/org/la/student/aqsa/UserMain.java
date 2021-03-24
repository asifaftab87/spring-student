package org.la.student.aqsa;

public class UserMain {
	
	
	public static void main(String[] args) {
	  
	User user = new User();
	user.setId(67);
	user.setName("khan");
	user.setDob("9.1.1999");
	user.setEmail("khan@gmail.com");
		
	UserMain usermain = new UserMain();
	UserDto dto = usermain.userToUserDto(user);
	System.out.println(dto);
	
	}
	
	
	
	public UserDto userToUserDto(User user){
		
		UserDto dto = new UserDto();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setDob(user.getDob());
		dto.setEmail(user.getEmail());
		
		return dto;
		
	}

}
