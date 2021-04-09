package org.la.student.aqsa.ModelAndDto;

import org.dozer.DozerBeanMapper;

public class StateMain {
	
	DozerBeanMapper mapper =new DozerBeanMapper();
	
public static void main(String[] args) {
	State s = new State();
	s.setCountryId(999);
	s.setName("india");
	s.setStateCode(99);
	s.setStateId(912);
	
	StateMain statemain = new StateMain();
	StateDto dto = statemain.stateToStateDto(s);
	System.out.println(dto);
	
	StateDto dtoMapper = statemain.stateToStateDtoMapper(s);
	System.out.println(dtoMapper+" Mapper");
	
}

public StateDto stateToStateDtoMapper(State s) {
	
	StateDto dtoMapper = mapper.map(s, StateDto.class);
	return dtoMapper;
}

private StateDto stateToStateDto(State s) {
	
	StateDto dto = new StateDto();
	dto.setCountryId(s.getCountryId());
	dto.setName(s.getName());
	dto.setStateCode(s.getStateCode());
	dto.setStateId(s.getStateId());
	return dto;
}
}
