package di.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("player")
public class Player implements AbstracPlayer{
	@Autowired
	@Qualifier("mydice2")
	AbstractDice d;
		
	public Player() {
		
	}
	public Player(Dice d) {
		super();
		this.d = d;
	}
	
	
	int totalValue=0;
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}
