package di.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

	public static void main(String[] args) {
		//Player p = new Player();
		
		ApplicationContext contanier = 
				new ClassPathXmlApplicationContext("config/bean.xml");
		AbstracPlayer p =(AbstracPlayer)contanier.getBean("player");
		
		p.play();
		System.out.println("세번 굴린 주사위의 합:"+p.getTotalValue());
	}

}
