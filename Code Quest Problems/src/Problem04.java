import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem04
	{

	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner(new File("Problem04.in.txt"));
		while(file.hasNextLine())
			{
			String str = file.nextLine();
			String[] words = str.split(" ");
			String[] pigLatin = new String[words.length];
			for(int i = 0; i < words.length; i++)
				{
				String word = words[i];
				pigLatin[i] = translate(word);
				}
			
			for(int i = 0; i < pigLatin.length; i++)
				{
				System.out.print(pigLatin[i] + " ");
				}
			System.out.println();
			}
		}
	
	public static String translate(String word)
		{
		if(word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u"))
			{
			if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u"))
				return word + "yay";
			else
				{
				String hold = "";
				for(int j = 0; j < word.length(); j++)
					{
					String letter = word.substring(j, j + 1);
					if(letter.equals("q"))
						{
						if(word.substring(j + 1, j + 2).equals("u"))
							{
							hold += letter + word.substring(j + 1, j + 2);
							j = j + 2;
							}
						else
							hold += letter;
						}
					if(letter.equals("b") || letter.equals("c") || letter.equals("d") || letter.equals("f") || letter.equals("g") || letter.equals("h") || letter.equals("j") || letter.equals("k") || letter.equals("l") || letter.equals("m") || letter.equals("n") || letter.equals("p") || letter.equals("r") || letter.equals("s") || letter.equals("t") || letter.equals("v") || letter.equals("w") || letter.equals("x") || letter.equals("y") || letter.equals("z"))
						hold += letter;
					else
						return word.substring(j) + hold + "ay";
					}
				}
			}
		return word;
		}

	}
