package cn.onedull.spring.service;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentSerivceTest {
	
	@Autowired
	private IStudentService st;
	
	@Test
	public void testSave() {
		st.save("yy", "123");
	}

}
