package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.CurrencyMst;
import com.example.demo.entity.domain.CurrencyMstExample;
import com.example.demo.repository.CurrencyMstMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CurrencyService {

	private final CurrencyMstMapper currencyMstMapper;

	public boolean existCurrency(String currency) {

		CurrencyMstExample currencyMstExample = new CurrencyMstExample();
		currencyMstExample.createCriteria().andCurrencyEqualTo(currency);

		return (currencyMstMapper.selectByExample(currencyMstExample).size()>0) ? true:false;

	}

	public List<CurrencyMst> getCurrency() {
		// Selects all rows.
		return currencyMstMapper.selectByExample(null);
	}

}
