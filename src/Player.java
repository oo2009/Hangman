

import java.util.Scanner;



public class Player {
String c = "";
 
Scanner in = new Scanner(System.in);


char letter[] = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ','3',
		};


public char askPlayer() {
	
	
   System.out.println("Input a character below");
	
	
		
	c = in.nextLine().concat(" ");
	
	if (c==""){
		c="t";
	}
		
	
		
	
	//in.ioException();
	
		//c = letter[(int) ((Math.random())*27)];
	
   
	return c.charAt(0);  }
	
public void closeplayer(){
	in.close();
	System.exit(0);
}

public char askClose(){
	
	System.out.println("Play again?(Y/N)");
	c = in.nextLine().concat(" ");
	//in.ioException();
	return c.charAt(0);
	
	
}

public char askGame(){
	System.out.println("Movies(1) or Clubs(2)?");
	c = in.nextLine().concat(" ");
	//in.ioException();
	return c.charAt(0);
	
	
}
}
