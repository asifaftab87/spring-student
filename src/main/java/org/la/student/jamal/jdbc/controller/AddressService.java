package org.la.student.jamal.jdbc.controller;



import java.util.List;

public class AddressService {
	public List<Address> findByUserId(int userId)  throws Exception {
        return AddressRepository.findByUserId(userId);
    }

    public Address findById(int id)  throws Exception {
        return AddressRepository.findById(id);
    }
    
}
