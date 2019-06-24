package cn.wolfcode.ssm.service;

import java.math.BigDecimal;

public interface IAccountService {
	void transfer(Long inId, Long outId, BigDecimal amount);
}
