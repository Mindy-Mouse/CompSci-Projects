/*Name: Mindy Altschul
Class: Comp Sci 2
Date: February 14, 2018
Purpose: make a snowman*/

import java.awt.*;
import java.applet.Applet;

public class Snowman extends Applet{
	public void init(){
		resize(500,500);
	}

	public void paint(Graphics box){
		final int MID = 200;
		final int TOP = 150;
		Font monocorsivPlain30 = new Font("Monotype Corsiva", Font.PLAIN, 30);
				
		setBackground (Color.blue);
		
		box.setColor (Color.black);
		box.fillRect (0,425,350,45);  //branch
		
		box.setColor (Color.white);
		box.fillOval (350, 40, 70,70); //moon
		box.setColor (Color.blue);
		box.fillOval (340, 30, 70,70); //moon
		
		box.setColor (Color.gray);
		box.fillOval (MID-35, TOP+45, 90, 90); //head
		
		box.setColor (Color.lightGray);
		box.fillOval (MID-75, TOP+100, 175, 175);  //body
		
		box.setColor (Color.white);
		box.fillOval (MID-50, TOP+110, 125, 160);  //belly
		
		box.setColor (Color.gray);
		box.fillOval (MID-90, TOP+110, 69, 150);  //left wing
		box.fillOval (MID+45, TOP+110, 70, 150);  // right wing
		
		box.setColor (Color.lightGray);
		box.fillOval (MID-65, TOP+52, 90, 90);  //left eye
		box.fillOval (MID-5, TOP+52, 90, 90);  //right eye
		
		box.setColor (Color.yellow);
		for (int dot=0; dot<35; dot++){
			box.drawLine(MID+10, TOP+150, MID+dot, TOP+100);  //beak
		}
		for (int dot=0; dot<15; dot++){
			box.drawLine(MID+10, TOP+150, MID-dot, TOP+100);  //beak
		}
		
		box.setColor (Color.white);
		box.fillOval (MID-50, TOP+67, 61, 61);  //left ball
		box.fillOval (MID+10, TOP+67, 61, 61);  //right ball
		
		box.setColor (Color.black);
		box.fillOval (MID-35, TOP+82, 30, 30);  //left pupil
		box.fillOval (MID+26, TOP+82, 30, 30);  //right pupil
						
		box.setColor (Color.yellow);
		box.fillOval (MID+30, TOP+265, 10, 20);  //right foot
		box.fillOval (MID+22, TOP+265, 10, 20); 
		box.fillOval (MID+38, TOP+265, 10, 20);
		
		box.fillOval (MID-8, TOP+265, 10, 20);  //left foot
		box.fillOval (MID-16, TOP+265, 10, 20); 
		box.fillOval (MID-24, TOP+265, 10, 20);
		
		box.setColor (Color.green);
		box.drawOval(MID+28, TOP+100, 35, 35);  //right glasses
		box.drawOval(MID+27, TOP+99, 37, 37);
		box.drawOval(MID-41, TOP+100, 35, 35);  //left glasses
		box.drawOval(MID-42, TOP+99, 37, 37);
		box.drawLine (MID-5, TOP+119, MID+27, TOP+119);//bridge
		box.drawLine (MID-5, TOP+118, MID+27, TOP+118);
		
		box.setFont(monocorsivPlain30);
		box.setColor (Color.yellow);
		box.drawString("Wit beyond measure", 90, 80);  //text
		box.drawString("is man's greatest treasure.", 65, 130);	
				
	}


	public static void main(String[] args) {
		
		

	}

}
