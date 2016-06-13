package di.anno;

import java.util.Random;

import org.springframework.stereotype.Service;
@Service("mydice2")
public class Dice2 extends Random implements AbstractDice{
	
	public Dice2(){
		
	}
	
	public int getDiceValue(){
		System.out.println("dice2");
		return nextInt(6)+1;
	}
}
