package cn.wolfcode.auis.servlet.impl;

import java.math.BigDecimal;

import cn.wolfcode.auis.mapper.AccountMapper;

import cn.wolfcode.auis.servlet.AccountServlet;


public class AccountServletImpl implements AccountServlet {
	
	private AccountMapper accountMapper;
	
	public void setAccountMapper(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
	}

	@Override
	public void transfer(Long inId, Long outId, BigDecimal amount) {
		//进账
		accountMapper.addBalance(inId, amount);
		int i = 1/0;
		//扣钱
		accountMapper.subractBalance(outId, amount);
		

	}

}
