package di.anno;

import java.util.Random;

import org.springframework.stereotype.Service;
@Service("mydice1")
public class Dice extends Random implements AbstractDice{
	
	public Dice(){
		
	}
	
	public int getDiceValue(){
		return nextInt(6)+1;
	}
}
