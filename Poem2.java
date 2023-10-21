/**
 *Main method for CH%HW Q 2
 * 
 * @author Walker Bell
 *
 */package CH5;

import java.io.FileWriter;
import java.io.IOException;

public class Poem2 {
	public static void main(String[] args) {
	    Poem poem1 = new Poem();
	    poem1.setName("We Real Cool");
	    poem1.setPoet("Gwendolyn Brooks");

	    Poem poem2 = new Poem();
	    poem2.setName("I know Why the caged bird sings");
	    poem2.setPoet("Maya Angelou");

	    Poem poem3 = new Poem();
	    poem3.setName("Emily Dickinson");
	    poem3.setPoet("Hope is the thing with feathers");
	    
	    Poem poem4 = new Poem();
	    poem3.setName("Emily Dickinson");
	    poem3.setPoet("The Road Not Taken");
	    String filePath = "C:/Progamming/poems.txt";

	    try (FileWriter writer = new FileWriter("poems.txt")) {
	        writePoemInfo(writer, poem1);
	        writePoemInfo(writer, poem2);
	        writePoemInfo(writer, poem3);
	    } catch (IOException e) {
	        System.out.println("The file couldn't be written  " + e.getMessage());
	    }
	}

	public static void writePoemInfo(FileWriter writer, Poem poem) throws IOException {
	    writer.write(poem.getName() + "\n");
	    writer.write(poem.getPoet() + "\n");
	}
	}


