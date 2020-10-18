package org.la.student.rest.controller;

import java.util.List;

import org.la.student.model.CreditCard;
import org.la.student.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/creditcard")
public class CreditCardRestController {
	
	@Autowired
	private CreditCardService creditcardService;
	
	@PostMapping("/save")
	public CreditCard add(@RequestBody CreditCard creditcard) {
		return creditcardService.add(creditcard);
	}
	
	
	@GetMapping("/findAllCreditCard")
	public List<CreditCard> findAll() {

		List<CreditCard> creditcardList = creditcardService.findAll();

		return creditcardList;
	}
	
	@GetMapping("/findCreditCardByCc_Id/{creditcardcc_Id}")
	public CreditCard findByCc_Id(@PathVariable long creditcardcc_Id) {
		return creditcardService.findByCc_Id(creditcardcc_Id);
	}
	

	
//	@DeleteMapping("/deleteCreditCardByCc_Id/{creditcardcc_Id}")
//	public CreditCard deleteByCc_Id(@PathVariable long creditcardcc_Id) {
//		return creditcardService.findByCc_Id(creditcardcc_Id);
//	}
	
}
