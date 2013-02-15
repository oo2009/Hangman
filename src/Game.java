



public class Game {
	
	Word yam = new Word();	
	
    int x = 0;
    int y = 0;
    int index = 0;
    Boolean finished = false;
    
public void startFilmGame(Player r) {
	
	String film = yam.getFilm();
	int lengthFilm = yam.getFilm().length();
	//Player j = new Player();	
	
	lengthFilm = film.length();
	char filmChars[] = film.toCharArray();
	Boolean wonGame = false;
	Boolean taken[] = new Boolean[lengthFilm];
	int t=0;
	int u=0;
	int z=0;
	while (x < lengthFilm){
		
		if (filmChars[x] == ' '){
			y++;
		}
		x++;
	}
	
	while ( t < lengthFilm ){
		taken[t] = false;
		t++;
	}
	System.out.println("------Game Begins-------");
	System.out.println("Enter any character you think might be contained in the following word(s) describing the title of a popular movie " );
	System.out.println(hwmb(taken, filmChars));	

	while (wonGame == false){
	char let = r.askPlayer();
	x=0;
	u=0;
	System.out.println("You entered " + let);
	while (x<lengthFilm){
		
	if (Character.toLowerCase(let) == Character.toLowerCase(filmChars[x]) ){if (!taken[x]){
		//System.out.println("Very good    "+ hwmb(x)+ filmChars[x] + hwmba(x,lengthFilm) + "     a few more to go" );
		taken[x] = true;
		
		//System.out.println("Very good    "+ hwmb(taken,filmChars) );
		
			index++;
			u++;
			
		
		       }} 
	
	x++;
	
	}
	
	
	if (index == lengthFilm - y){
		System.out.println("Congratulations You have won  " + film + "    GameOver");
		wonGame = true;
		finished = true;
		
		
		
	}
	
	if (u==0){
		z++;
		System.out.println("You failed! You have only "+ (8-z)+ " tries left    " + hwmb(taken,filmChars));
	
	} else System.out.println("Very good    "+ hwmb(taken,filmChars) );
	
	if (z>7){
		System.out.println("Sorry you have lost the game, GameOver   " + film);
		wonGame = true;
		//r.closeplayer();
		finished = true;
	}     

	}	
}
	
                        


public void startClubGame(Player r) {
	
	String film = yam.getClub();
	int lengthFilm = yam.getClub().length();
	//Player j = new Player();	
	
	lengthFilm = film.length();
	char filmChars[] = film.toCharArray();
	Boolean wonGame = false;
	Boolean taken[] = new Boolean[lengthFilm];
	int t=0;
	int u=0;
	int z=0;
	while (x < lengthFilm){
		
		if (filmChars[x] == ' '){
			y++;
		}
		x++;
	}
	
	while ( t < lengthFilm ){
		taken[t] = false;
		t++;
	}
	System.out.println("------Game Begins-------");
	System.out.println("Enter any character you think might be contained in the following word(s) describing the title of a popular club " );
	System.out.println(hwmb(taken, filmChars));	

	while (wonGame == false){
	char let = r.askPlayer();
	x=0;
	u=0;
	System.out.println("You entered " + let);
	while (x<lengthFilm){
		
	if (Character.toLowerCase(let) == Character.toLowerCase(filmChars[x]) ){if (!taken[x]){
		//System.out.println("Very good    "+ hwmb(x)+ filmChars[x] + hwmba(x,lengthFilm) + "     a few more to go" );
		taken[x] = true;
		
		//System.out.println("Very good    "+ hwmb(taken,filmChars) );
		
			index++;
			u++;
			
		
		       }} 
	
	x++;
	
	}
	
	
	if (index == lengthFilm - y){
		System.out.println("Congratulations You have won  " + film + "    GameOver");
		wonGame = true;
		finished = true;
		
		
		
	}
	
	if (u==0){
		z++;
		System.out.println("You failed! You have only "+ (8-z)+ " tries left      "+ hwmb(taken,filmChars));
	
	} else System.out.println("Very good    "+ hwmb(taken,filmChars) );
	
	if (z>7){
		System.out.println("Sorry you have lost the game, GameOver   " + film);
		wonGame = true;
		//r.closeplayer();
		finished = true;
	}     

	}	
}
                        



private String hwmb(Boolean[] taken, char[] filmChars) {
	int g = 0;
	String d = "";
	while (g<filmChars.length){
		if(taken[g]){
	d = d + filmChars[g];
	}else if (filmChars[g] == ' ')
		d = d + " ";
	else
		d = d + "*";
	g++;
	}
	
	return d;
}



}
