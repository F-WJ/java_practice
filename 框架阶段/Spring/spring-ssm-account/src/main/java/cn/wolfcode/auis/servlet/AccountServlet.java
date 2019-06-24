package cn.wolfcode.auis.servlet;

import java.math.BigDecimal;

public interface AccountServlet {
	void transfer(Long inId, Long outId, BigDecimal amount);
}
