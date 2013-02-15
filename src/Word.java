
import java.io.*;

public class Word {
	

public String getFilm(){	
	
     String record = null;
    String film = "";
    int recCount = 0;
    int num = 0;
    
   
    

    BufferedReader dis = null;
	try {

       File f = new File("films.txt");
       FileInputStream fis = new FileInputStream(f);
       BufferedInputStream bis = new BufferedInputStream(fis);
     dis = new BufferedReader(new InputStreamReader(bis));

       while ( (record=dis.readLine()) != null ) {
          recCount++;
          if (dis.readLine() == ","){
        	  num++;
         }
         film = film + record;
       
       }

    } catch (IOException e) {
       // catch io errors from FileInputStream or readLine()
    	
       System.out.println("Uh oh, got an IOException error!" + e.getMessage());
       System.exit(0);
    
    } finally {
       // if the file opened okay, make sure we close it
       if (dis != null) {
          try {
             dis.close();
          } catch (IOException ioe) {
          }
       }
    }
    
    
    String films[] = new String[num]; 
    
    films = film.split(", ");
    
	return films[(int) (Math.random()*films.length)];
    
  
    

}

public String getClub(){	
	
    String record = null;
   String film = "";
   int recCount = 0;
   int num = 0;
   
  
   

   BufferedReader dis = null;
	try {

      File f = new File("clubs.txt");
      FileInputStream fis = new FileInputStream(f);
      BufferedInputStream bis = new BufferedInputStream(fis);
     dis = new BufferedReader(new InputStreamReader(bis));

      while ( (record=dis.readLine()) != null ) {
         recCount++;
         if (dis.readLine() == ","){
       	  num++;
         }
        film = film + record;
      
      }

   } catch (IOException e) {
      // catch io errors from FileInputStream or readLine()
      
	   
	   System.out.println("Uh oh, got an IOException error!" + e.getMessage());
      System.exit(0);
      
   } finally {
      // if the file opened okay, make sure we close it
      if (dis != null) {
         try {
            dis.close();
         } catch (IOException ioe) {
         }
      }
   }
   
   
   String films[] = new String[num]; 
   
   films = film.split(", ");
   
	return films[(int) (Math.random()*films.length)];
   
 
   

}
}



