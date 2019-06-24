package cn.wolfcode.auis;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wolfcode.auis.mapper.AccountMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountMapperTest {

	@Autowired
	private AccountMapper am;
	@Test
	public void test() {
		System.out.println(am);
		am.addBalance(1L, new BigDecimal("1000"));
		am.subractBalance(2L, new BigDecimal("1000"));
	}

}
