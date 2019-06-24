package cn.wolfcode.ssm.service.impl;

import java.math.BigDecimal;

import cn.wolfcode.ssm.mapper.AccountMapper;
import cn.wolfcode.ssm.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
	private AccountMapper accountmapper;
	

	public void setAccountmapper(AccountMapper accountmapper) {
		this.accountmapper = accountmapper;
	}


	@Override
	public void transfer(Long inId, Long outId, BigDecimal amount) {
		accountmapper.addBalance(inId, amount);
		accountmapper.subractBalance(outId, amount);
		

	}

}
