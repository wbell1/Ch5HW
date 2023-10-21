package CH5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Poem3 {
	   public static void main(String []args) {
	         ArrayList<Poem> poets = new ArrayList<Poem>(); 
	         
	         try {
	            File file = new File("poem2.txt"); 
	            Scanner input = new Scanner(file);
	            while (input.hasNextLine()) {
	              String name = input.nextLine();
	              String poet=input.nextLine();
	              Poem poem=new Poem();
	              poem.setName(name);
	              poem.setPoet(poet);
	              poets.add(poem);   
	            }
	            input.close();
	          } catch (IOException e) {        
	            System.out.println("Error");
	            e.printStackTrace();
	          }
	   
	          for(int i=0;i<poets.size();i++){
	            System.out.println(poets.get(i).toString());
	          }
	       }

	}


