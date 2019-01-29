
public class Dice {
	
	//creating variables - data members
	int die1, die2, die3, sum, turn, total;
	int [] keepBig = new int [3];
	
	//constructors
	public Dice(int newdie1, int newdie2, int newdie3 ){
		die1 = newdie1;
		die2 = newdie2;
		die3 = newdie3;
		
	}
	
	public Dice(){
		
	}
	
	//methods
	
	public void rollDice1(){
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		die3 = (int)(Math.random()*6)+1;
		
		System.out.println("Dice " + die1 +" "+ die2 +" "+ die3);
	}
	public void rollDice2(){
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		
		System.out.println("Dice " + die1 +" "+ die2);
	}
	public void rollDice3(){
		die1 = (int)(Math.random()*6)+1;
		
		System.out.println("Die " + die1);
	}
	
	public void findBiggest1(){
		keepBig[0] = die1;
		if (keepBig[0]< die2){
			keepBig[0] = die2;
		}
		if (keepBig[0]< die3){
			keepBig[0] = die3;
		}
		System.out.println("Keep: " + keepBig[0]);
	}
	
	public void findBiggest2(){
		keepBig[1] = die1;
		if (keepBig[1]< die2){
			keepBig[1] = die2;
		}
		System.out.println("Keep: " + keepBig[1]);
	}
	
	public void findBiggest3(){
		keepBig[2] = die1;
		System.out.println("Keep: " + keepBig[2]);
	}
	
	public int bostonFindTotal(){
		for(int index = 0; index < 3; index++){
			sum = sum + keepBig[index];
		}
		return sum;
	}
	
	public void pigTurnTotal(){
		if (die1 == 1){
			turn = 0;
		}
		else {
			turn = turn + die1;
		}
		
		System.out.println("Turn Total: " + turn);
	}
	
	public int pigTotal(){
		total = total + turn;
		
		return total;
	}
	public void Dice1(){
		rollDice1();
		findBiggest1();
		System.out.println();
	}
	
	public void Dice2(){
		rollDice2();
		findBiggest2();
		rollDice3();
		findBiggest3();
		System.out.println("Total: " + bostonFindTotal());
		System.out.println();
	}

}
