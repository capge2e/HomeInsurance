package com.abc.insurance.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.insurance.entity.HomeInsurance;
import com.abc.insurance.service.HomeInsuranceService;



@RestController
@RequestMapping("/homeinsurance")
public class HomeInsuranceWebController {
	@Autowired
	HomeInsuranceService homeInsuranceService;
	public  HomeInsuranceWebController() {
		System.out.println("\n\n\n====>> Inside Constructor "+this);
	}
	@GetMapping("/welcome")
	public String welcome()
	{
		
		return "Welcome to Home Insurance";
		
	}
	
	
		
	@PostMapping("/add")
	public ResponseEntity<String> addHomeInsurance(@RequestBody HomeInsurance homeInsurance) 
	{
		
		try {
			HomeInsurance savedInsurance =   homeInsuranceService.insertHomeInsurance(homeInsurance);
			String responseMsg = savedInsurance.getHouseRegisteredPersonName()+" save with house No "+savedInsurance.getHouseNo();
			return new ResponseEntity<String>(responseMsg,HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg =  "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
			return new ResponseEntity<String>(errorMsg,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/insurance")
	public List<HomeInsurance> getAllInsurance()
	{
		// write some code to extract users
		try {
			List<HomeInsurance>  allExtractedUsers = homeInsuranceService.getAllHomeInsurance();
			
			return allExtractedUsers;
			
		} catch (Exception e) {
			// code missing for expection handling 
			System.out.println(e);
			
		}
		
		return null;
	}
	@GetMapping("/sumInsured/{sumInsured}")
	public HomeInsurance getHomeInsuranceBySumInsured(int sumInsured)throws Exception
	{
		
		return homeInsuranceService.getHomeInsuranceBySumInsured(sumInsured);
		
	}
	
	@GetMapping("/premium/{premium}")
	public List< HomeInsurance> getHomeInsuranceByPremiumHomeInsurances(int premium) throws Exception
	{
		
		return  homeInsuranceService.getHomeInsuranceByPremium(premium);
		
	}
	}

