package org.la.student.service;

import java.util.List;
import java.util.Optional;

import org.la.student.model.CreditCard;
import org.la.student.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCardService {

	@Autowired
	private CreditCardRepository creditcardRepository;
	
	public CreditCard findByCc_Id(long creditcardcc_Id) {
		
		Optional<CreditCard> option = creditcardRepository.findById(creditcardcc_Id);
		
		if(option.isPresent()) {
			return option.get();
		}
		return null;
	}
	
	public List<CreditCard>findAll(){
		return creditcardRepository.findAll();
	}
		
	public CreditCard add(CreditCard creditCard) {
		return creditcardRepository.save(creditCard);
	}

}



		