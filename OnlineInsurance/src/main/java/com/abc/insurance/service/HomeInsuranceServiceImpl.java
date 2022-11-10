package com.abc.insurance.service;

import java.util.List;


import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.insurance.entity.HomeInsurance;
import com.abc.insurance.repository.HomeInsuranceRepository;



@Service
public class HomeInsuranceServiceImpl implements HomeInsuranceService {
	@Autowired
	HomeInsuranceRepository homeInsuranceRepository;

	@Override
	
	public HomeInsurance insertHomeInsurance(HomeInsurance homeInsurance)throws Exception {
		
		HomeInsurance savedHomeInsurance =  homeInsuranceRepository.save(homeInsurance);  // Note :  save() is already implemented by Spring Data JPA
		if(savedHomeInsurance != null)
		{
			return savedHomeInsurance;
		}
		else return null;
	}

	@Override
	public List<HomeInsurance> getAllHomeInsurance() throws Exception {

		List<HomeInsurance> allInsurance =  homeInsuranceRepository.findAll(); // Note : same as save
		return allInsurance;
	}

	@Override
	public HomeInsurance getHomeInsuranceBySumInsured(int sumInsured) throws Exception {
		return ((HomeInsuranceServiceImpl) homeInsuranceRepository).getHomeInsuranceBySumInsured(sumInsured);
	}

	@Override
	public List<HomeInsurance> getHomeInsuranceByPremium(int premium) throws Exception {
		// TODO Auto-generated method stub
		return homeInsuranceRepository.getHomeInsuranceByPremium(premium);
	}

	

}
