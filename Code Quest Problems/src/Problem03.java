import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem03
	{

	public static void main(String[] args) throws IOException
		{
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		ArrayList<Integer> frontArray = new ArrayList<Integer>();
		ArrayList<Integer> backArray = new ArrayList<Integer>();
		ArrayList<Integer> finishedArray = new ArrayList<Integer>();
		Scanner file = new Scanner(new File("Problem03.in.txt"));
		while(file.hasNextLine())
			{
			String str = file.nextLine();
			String[] list = str.split(" ");
			for(int i = 0; i < list.length; i++)
				{
				int number = Integer.parseInt(list[i]);
				myArray.add(number);
				}
			Collections.sort(myArray);
			for(int i = myArray.size() - 1; i >= 0; i--)
				{
				if(i % 2 == 0)
					{
					frontArray.add(myArray.get(i));
					}
				else
					{
					backArray.add(myArray.get(i));
					}
				}
			if(frontArray.size() == backArray.size())
				{
				for(int i = 0; i < backArray.size(); i++)
					{
					if(i % 2 == 0)
						finishedArray.add(frontArray.get(i));
					else
						finishedArray.add(backArray.get(i - 1));
					}
				}
			else if(frontArray.size() > backArray.size())
				{
				for(int i = 0; i < backArray.size(); i++)
					{
					if(i % 2 == 0)
						finishedArray.add(frontArray.get(i));
					else
						finishedArray.add(backArray.get(i - 1));
					}
				}
			else
				{
				for(int i = 0; i < frontArray.size(); i++)
					{
					if(i % 2 == 0)
						finishedArray.add(frontArray.get(i));
					else
						finishedArray.add(backArray.get(i - 1));
					}
				}
			for(int i = 0; i < finishedArray.size(); i++)
				{
				System.out.print(finishedArray.get(i) + " ");
				}
			System.out.println();
			myArray.clear();
			frontArray.clear();
			backArray.clear();
			finishedArray.clear();
			}
		}

	}
