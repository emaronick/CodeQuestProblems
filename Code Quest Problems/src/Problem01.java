import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Problem01
	{

	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner(new File("Problem01.in"));
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		while(file.hasNextLine())
			{
			int num = file.nextInt();
			myArray.add(num);
			}
		exchange(myArray);
		}
	
	public static void exchange(ArrayList<Integer> myArray)
		{
		for(int i = 0; i < myArray.size(); i++)
			{
			if(myArray.get(i) % 3 == 0 && myArray.get(i) % 7 == 0)
				{
				System.out.println("CODEQUEST");
				}
			else if(myArray.get(i) % 3 == 0)
				{
				System.out.println("CODE");
				}
			else if(myArray.get(i) % 7 == 0)
				{
				System.out.println("QUEST");
				}
			else
				{
				System.out.println(myArray.get(i));
				}
			}
		}

	}
