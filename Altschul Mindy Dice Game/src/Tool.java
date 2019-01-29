/*
 * Author: Brian Costlow
 * Created: Friday, April 01, 2005 9:51:45 AM
 * Modified: Friday, April 01, 2005 9:51:45 AM
 * Tool is a class that contains common methods 
 * that can be used in Java programs.  
 */
import cs1.Keyboard;


public class Tool
{
	// Inserts 25 blank lines that clear the screen of all text.
	public static void clrscr()
	{
		for (int i=0; i <25; i++)
			System.out.println();
			//TextIO.putln();
	}
	
	// usage: Tool.delay(# of milliseconds);
	// adds a time gap where the system does nothing.
	// the variable sent is the number of milliseconds the program waits.
	public static void delay(int time)
	{                                 
		try {                         
    	 	   Thread.currentThread().sleep(time);
    	    } catch (InterruptedException e){} 
	}
	
	// Tells the user to press any key to continue
	// waits for the user to press a key before executing the next part of the program.
	public static void pause() 
	{                          
		System.out.println("\n\nType any key and ENTER to continue ");
		//TextIO.putln("\n\nHit any key to continue ");
		Keyboard.readChar();
		//char ch = TextIO.getlnChar();
	}

	//writes a string with a small delay between each character.
	// used for strings.
	public static void type(String text)
	{
		try {                         
    	 	   Thread.currentThread().sleep(1000);
    	    } catch (InterruptedException e){}
		for (int i = 0; i < text.length(); i++)
		{
			System.out.print(text.charAt(i));
			//TextIO.put(text.charAt(i));
			try {                         
    	 	   Thread.currentThread().sleep(100);
    	    } catch (InterruptedException e){}
		}
		try {                         
    	 	   Thread.currentThread().sleep(1000);
    	    } catch (InterruptedException e){}
	}

	//does the same function as Tool.type but it puts the cursor at a new line 
	//when it is done executing the function.
	public static void typeln(String text)
	{
		try {                         
    	 	   Thread.currentThread().sleep(1000);
    	    } catch (InterruptedException e){}
		for (int i = 0; i < text.length(); i++)
		{
			System.out.print(text.charAt(i));
			//TextIO.put(text.charAt(i));
			try {                         
    	 	   Thread.currentThread().sleep(100);
    	    } catch (InterruptedException e){}
		}
		try {                         
    	 	   Thread.currentThread().sleep(1000);
    	    } catch (InterruptedException e){}
		System.out.println();
		//TextIO.putln();

	}
}

