package spring2;

import org.springframework.stereotype.Component;

@Component("app")
class App1 implements Startable {
	
	@Override
	public void start() {
		System.out.println("App1.start");
		
	}
}
