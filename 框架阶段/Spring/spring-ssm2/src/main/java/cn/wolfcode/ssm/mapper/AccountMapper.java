package cn.wolfcode.ssm.mapper;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
	void addBalance(@Param("inId")Long inId, @Param("amount")BigDecimal amount);
	void subractBalance(@Param("outId")Long outId, @Param("amount")BigDecimal amount);
}
