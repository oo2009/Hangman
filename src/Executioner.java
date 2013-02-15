import java.io.IOException;
public class Executioner {

	/**
	 * @param args
	 */
static  Boolean Play = true;

public static void main(String[] args)throws IOException{
	
	//char c = 0;
	
	 
	
		// TODO Auto-generated method stub
	//while (!g.finished ){
//Scanner in = new Scanner(System.in);
//System.out.println("Movies(1) or Clubs(2)?");


//c = in.nextLine().charAt(0);

//if (c == '1'd){
while (true){	
 

Game g = new Game();	
Player t = new Player();
switch (t.askGame()){
case '1': g.startFilmGame(t);break;	
case '2': g.startClubGame(t);break;
default : ;	
}



switch (t.askClose()){
case 'y': break;
case 'n' : t.closeplayer();
}

//char c = 0;
//Scanner in = new Scanner(System.in);
//c = in.nextLine().charAt(0);

//switch (c){
//case 'Y': in.close();
//case  'y': in.close();
//case 'N': break;
//case 'n': break;

//in.close();
}

//in.ioException();
//} if (c == '2'){
		
//Game t = new Game();

//t.startClubGame();
//in.ioException();
//} 
//} 

//}




//in.close();

//Executioner h = new Executioner();

//h.main(null);
}
}



