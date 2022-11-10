package com.abc.insurance.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.abc.insurance.entity.HomeInsurance;

@Repository
public interface IHomeInsuranceCustomRepository {
	public List<HomeInsurance> getHomeInsuranceByPremium(int premium)throws Exception;
}
