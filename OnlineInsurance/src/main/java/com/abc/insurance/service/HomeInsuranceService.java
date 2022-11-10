package com.abc.insurance.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.abc.insurance.entity.HomeInsurance;

@Service
public interface HomeInsuranceService {
public HomeInsurance insertHomeInsurance(HomeInsurance homeInsurance)throws Exception;

public List<HomeInsurance> getAllHomeInsurance()throws Exception;
public HomeInsurance getHomeInsuranceBySumInsured(int sumInsured) throws Exception;

public List<HomeInsurance> getHomeInsuranceByPremium(int premium) throws Exception;

}
