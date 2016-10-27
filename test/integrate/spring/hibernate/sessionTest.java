package integrate.spring.hibernate;



import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class sessionTest {

	private ApplicationContext ac =  new ClassPathXmlApplicationContext("applicationContext.xml");

	@Test
	public void testSessionFactory() throws Exception {
		SessionFactory sf = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sf.openSession());
	}
	
}
