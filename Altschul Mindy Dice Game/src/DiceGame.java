/*Name: Mindy Altschul
Class: Comp Sci 2
Date: March 21, 2018
Purpose: make a dice game*/
import cs1.Keyboard;
public class DiceGame {
	static int BETMAX = 75;
	static int START = 500;
		
	public static void mainMenu(){
		System.out.println("\n\t\t Welcome to Mindy's Dice House \n");
		System.out.println("\t [P]ig");
		System.out.println("\t [G]oing Boston");
		System.out.println("\n\t E[X]it\n");	
	}
	
	public static char getChoice(){
		System.out.print("\t Enter your choice: ");
		char selection = Keyboard.readChar();
		selection = Character.toUpperCase(selection);
		return selection;
	}
	
	public static void runMainMenu(char ch, char answer, int bank, int bet){
		switch (ch){
		case 'P':
			do{
				pigMenu();
				ch = getChoice();
				runPigMenu(ch);
			}while (ch != 'X'); 
		break;
		case 'G': 
			do {
				bostonMenu();
				ch = getChoice();
				runBostonMenu(ch, answer, bank, bet);
			}while (ch != 'X'); 
		break;
		case 'X':System.out.println("You selected exit.\n\n");
		break;
		default: 
		} 
	}
	
	public static void bostonMenu(){
		System.out.println("\n\t\t Going Boston \n");
		System.out.println("\t [R]ules");
		System.out.println("\t [P]lay game");
		System.out.println("\n\t E[X]it to main menu\n");	
	}
	
	public static void pigMenu(){
		System.out.println("\n\t\t Pig \n");
		System.out.println("\t [R]ules");
		System.out.println("\t [P]lay game");
		System.out.println("\n\t E[X]it to main menu\n");	
	}
	
	public static void runBostonMenu(char ch, char answer, int bank, int bet){
		switch (ch){
		case 'R': bostonRules();
		break;
		case 'P':
			do{
				bank = goingBoston(bank, bet, answer);
				do{
					System.out.print("Do you want to continue playing? (Y/N) ");
					answer = Keyboard.readChar();
					answer = Character.toUpperCase(answer);
				}while (answer != 'Y' && answer != 'N');
				
			}while(answer != 'N' && bank > 0);
		break;
		case 'X': System.out.print("You selected exit.\n\n");
		break;
		default: 
		} 
	}
	
	public static void runPigMenu(char ch){
		switch (ch){
		case 'R': pigRules();
		break;
		case 'P': pig();
		break;
		case 'X': System.out.print("You selected exit.\n\n");
		break;
		default: 
		} 
	}
	
	public static void bostonRules(){
		System.out.println("\n\n\t Going Boston Rules");
		Tool.delay(500);
		Tool.type("You start with $500 in the bank. \n");
		Tool.delay(50);
		Tool.type("At the beginnning of each turn you will place a bet. \n");
		Tool.delay(50);
		Tool.type("The bet must not be bigger than $75. \n");
		Tool.delay(50);
		Tool.type("You will roll 3 dice and keep the highest value. ");
		Tool.delay(50);
		Tool.type("The computer will do the same. \n");
		Tool.delay(50);
		Tool.type("At this time, you can change your bet if you want to. \n");
		Tool.delay(50);
		Tool.type("Then you and the computer wil roll the remaining dice \n setting aside the die with the highest number.");
		Tool.delay(50);
		Tool.type("The highest numbers are added up. \n");
		Tool.delay(50);
		Tool.type("If your total is bigger than the computer you win. ");
		Tool.delay(1000);
	}
	
	public static void pigRules(){
		System.out.println("\n\n\t Pig Rules");
		Tool.type("You roll a die adding the number to your turn total.\n");
		Tool.delay(50);
		Tool.type("Continue rolling and adding the number to your turn total.\n");
		Tool.delay(50);
		Tool.type("\nAt anytime you can choose to stop rolling.\n");
		Tool.delay(50);
		Tool.type("Then your turn total will be added to your overall total.\n");
		Tool.delay(50);
		Tool.type("If you roll a one you lose your entire turn total.\n");
		Tool.delay(50);
		Tool.type("\nThe computer will do the same.\n");
		Tool.delay(50);
		Tool.type("The first one to 100 wins.\n");
		Tool.delay(1000);
		
	}
	
	public static int goingBoston(int bank, int bet, char answer){
		Dice player = new Dice();
		Dice computer = new Dice();
		
		System.out.println("\n Bank: " + bank);//
		
		do {
			System.out.print("How much do you want to bet? ");
			bet = Keyboard.readInt();
			if (bet <= 0 || bet > BETMAX || bet > bank){
				System.out.println("Sorry invalid bet");
			}
		}while (bet <= 0 || bet > BETMAX || bet > bank);
		
		System.out.println("\n You: ");
		player.Dice1();
		System.out.println("Computer: ");
		computer.Dice1();
		
		do{
			System.out.print("Do you want to change your bet? (Y/N) ");
			answer = Keyboard.readChar();
			answer = Character.toUpperCase(answer);
		}while (answer != 'Y' && answer != 'N');
		
		if (answer == 'Y'){
			do {
				System.out.print("How much do you want to bet? ");
				bet = Keyboard.readInt();
				if (bet <= 0 || bet > BETMAX || bet > bank){
					System.out.println("Sorry invalid bet");
				}
			}while (bet <= 0 || bet > BETMAX || bet > bank);
		}
		
		System.out.println("\n You: ");
		player.Dice2();
		System.out.println("Computer: ");
		computer.Dice2();
		
		if (player.bostonFindTotal() > computer.bostonFindTotal()){
			System.out.println("Congrats! You won!!");
			bank = bank + bet;
			
		}
		
		else if (player.bostonFindTotal() < computer.bostonFindTotal()){
			System.out.println("Aww Snap! You lost.");
			bank = bank - bet;
			
		}
		
		else {
			System.out.println("Tie!");
			
		}
		
		
		
		return bank; 
		
	}
	
	public static void pig(){
		char choice = 'R';
		Dice player = new Dice();
		Dice computer = new Dice();
				
		do{
			System.out.println("You: \n" );
			do{
				System.out.print("\t" );
				player.rollDice3();
				player.pigTurnTotal();
			
				if (player.die1 != 1){
					do{
						System.out.print("Do you want to continue rolling? (Y/N) ");
						choice = Keyboard.readChar();
						choice = Character.toUpperCase(choice);
					}while (choice != 'Y' && choice != 'N');	
				}			
			}while(choice == 'Y' && player.die1 != 1);
			System.out.print("Your total: " + player.pigTotal() + "\n");
						
			int roll = (int)(Math.random()*6)+4;
			System.out.println("Computer: \n" );
			for (int r = roll; r >0; r--){
				System.out.print("\t" );
				computer.rollDice3();
				computer.pigTurnTotal();
			
				if (computer.die1 == 1){
				r = 0;
				}
			}
			System.out.print("Computer's total: " + computer.pigTotal() + "\n");
			
			do{
				System.out.print("Do you want to keep playing? (Y/N) ");
				choice = Keyboard.readChar();
				choice = Character.toUpperCase(choice);
			}while (choice != 'Y' && choice != 'N');
			player.turn = 0;
			computer.turn = 0;
		}while (choice == 'Y' && (player.total < 100 || computer.total < 100));
		
		
		System.out.print("\n Computer's total: " + computer.pigTotal() + "\n");
		System.out.print("Your total: " + player.pigTotal() + "\n");
		if (player.pigTotal() > computer.pigTotal()){
			System.out.println("Congrats! You won!!");
		}
		
		else if (player.pigTotal() < computer.pigTotal()){
			System.out.println("Sorry you lost.");
		}
		
		else{
			System.out.println("Tie.");
		}
		
	}
	
	public static void main(String[] args) {
		char answer = 'x';
		char ch = 'z';
		int bank = 0;
		int bet = 0;
		bank = START;
		
				
		do{
			mainMenu();
			ch = getChoice();
			runMainMenu(ch, answer, bank, bet);
		}while (ch != 'X'); 
	

		
	}

}
