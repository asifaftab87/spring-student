package org.la.student.aqsa.ModelAndDto;

import org.dozer.DozerBeanMapper;

public class CarMain {
	
	DozerBeanMapper mapper = new DozerBeanMapper();
	
	public static void main(String[] args) {
		Car c = new Car();
		c.setCarId(88);
		c.setModel("Audi");
		c.setType("Electric");
		c.setEngine("good");
		c.setCompany("Whatever");
		c.setColor("Blue");
	CarMain carmain = new CarMain();
	CarDto dto = carmain.carToCarDto(c);
	System.out.println(dto);
	
	CarDto dtoMapper = carmain.carToCarDtoMapper(c);
	System.out.println(dtoMapper+"  Mapper");
	
	}

	private CarDto carToCarDtoMapper(Car c) {
		CarDto dtoMapper = mapper.map(c, CarDto.class);
		return dtoMapper;
	}

	public CarDto carToCarDto(Car c) {
		CarDto dto = new CarDto();
		dto.setCarId(c.getCarId());
		dto.setColor(c.getColor());
		dto.setCompany(c.getCompany());
		dto.setEngine(c.getEngine());
		dto.setModel(c.getModel());
		dto.setType(c.getType());
		return dto;
	}

}
