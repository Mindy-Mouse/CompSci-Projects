/*Name: Mindy Altschul
Class: Comp Sci 2
Date: March 16, 2018
Purpose: test our dice class*/

public class TestDice {
	
	public static void delay(int time)
	{                                 
		try {                         
    	 	   Thread.currentThread().sleep(time);
    	    } catch (InterruptedException e){} 
	}
	public static void main(String[] args) {
		Dice player = new Dice();
		Dice computer = new Dice();
		
		player.Dice1();
		System.out.println();
		delay(1000);
		computer.Dice1();
		System.out.println();
		delay(1000);
		player.Dice2();
		System.out.println();
		computer.Dice2();
		System.out.println();
		
	/*		
		if (player.findTotal() > computer.findTotal()){
			System.out.println("Winner!");
		}
		
		System.out.println("total = "+ players[i].showSum());
		System.out.println("Sum = 7? "+ players[i].roll7());
		System.out.println("Sum = 11? "+ players[i].roll11());
		System.out.println();
		
		
		Dice greenDice = new Dice(2, 5);
		System.out.println(greenDice.showSum());
		System.out.println(greenDice.roll7());
		System.out.println(greenDice.roll11());
		
		if (greenDice.roll7()){
			System.out.println("Winner!");
		}
		else if (greenDice.roll11()){
			System.out.println("Loser!");
		}
		else {
			System.out.println("Roll again!");
		}*/

	}

}
