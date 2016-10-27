package integrate.spring.hibernate;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.usernotes.test.TestService;



public class transactionTest {

	private ApplicationContext ac =  new ClassPathXmlApplicationContext("applicationContext.xml");
	
		@Test
		public void testTx() throws Exception {
			TestService service = (TestService) ac.getBean("testService");
			service.saveTwoUsers();
		}

}
