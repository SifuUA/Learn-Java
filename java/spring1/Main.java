package spring1;

	import java.util.Scanner;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Main {
		public static void main(String[] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("spring1/config1.xml");
			
			Company comp = (Company) context.getBean("idCompany");
	        System.out.println(comp);
	        
	        Human hum = (Human) context.getBean("idHuman");
	        System.out.println(hum);
	        
	       /* Car car = (Car)context.getBean("idCar");
	        System.out.println(car);*/
	        
	       
		}
	

}
