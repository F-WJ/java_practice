package cn.wolfcode.auis.mapper;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
	//进账
	void addBalance(@Param("inId")Long inId, @Param("amount")BigDecimal amount);
	//扣钱
	void subractBalance(@Param("outId")Long outId, @Param("amount")BigDecimal amount);
}
