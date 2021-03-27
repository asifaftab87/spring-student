package org.la.student.tahir.mapper;

import org.dozer.DozerBeanMapper;
import org.la.student.tahir.dto.StateDto;
import org.la.student.tahir.model.State;

public class StateMain {

	
	DozerBeanMapper mapper = new DozerBeanMapper();
	
	public static void main(String[] args) {
		
		State state = new State();
		
		state.setName("Borno");
		state.setCountryId(234);
		state.setStateCode(698);
		state.setStateId(725);
		
		StateMain main = new StateMain();
		System.out.println(main.StateToStateDto(state));
		System.out.println(main.StateToStateDtoMapper(state));
	
	}
	
	public StateDto StateToStateDto(State state) {
		
		StateDto dto = new StateDto();
		dto.setName(state.getName());
		dto.setCountryId(state.getCountryId());
		dto.setStateCode(state.getStateCode());
		dto.setStateId(state.getStateId());
		
		return dto;
		
		
	}
	

	public StateDto StateToStateDtoMapper(State state) {
		
		StateDto dto = mapper.map(state, StateDto.class);
		return dto;
		}

}
