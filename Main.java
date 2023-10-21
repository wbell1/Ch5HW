/**
 *Main method for CH%HW Q 1
 * 
 * @author Walker Bell
 *
 */

package CH5;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

//got stuck on this
public class Main
{

	public static void main(String[] args)
	{
		Scanner inputFile = null;
		int sum = 0;
		String regex = ",";

		try
		{
			 inputFile = new Scanner(new File("src/AccessFile/Writing/CSVPackage/Book1.csv"));
			inputFile.useDelimiter(regex);
			
			while (inputFile.hasNext())
			{
				String numString = inputFile.next();
				int num = Integer.parseInt(numString);
				sum = sum + num;
				System.out.println(numString);
			}
		} catch (IOException ex)
		{
			ex.printStackTrace();
			System.out.println("The file couldn't be open");
		} finally
		{
			inputFile.close();
		}

		System.out.println("The sum is : " + sum);

	}

}
