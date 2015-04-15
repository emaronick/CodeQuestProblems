import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Problem02
	{

	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner(new File("Problem02.in"));
		int counter = 1;
		while(file.hasNextLine())
			{
			System.out.println("HAND " + counter);
			String str = file.nextLine();
			System.out.println(str);
			String[] hand = str.split("");
			int red = 0;
			int black = 0;
			int heart = 0;
			int diamond = 0;
			int spade = 0;
			int club = 0;
			int two = 0;
			int three = 0;
			int four = 0;
			int five = 0;
			int six = 0;
			int seven = 0;
			int eight = 0;
			int nine = 0;
			int ten = 0;
			int jack = 0;
			int queen = 0;
			int king = 0;
			int ace = 0;
			for(int i = 0; i < hand.length; i++)
				{
				String card = hand[i];
				if(card.contains("H") || card.contains("D"))
					{
					red++;
					if(card.contains("H"))
						heart++;
					else
						diamond++;
					}
				else if(card.contains("S") || card.contains("C"))
					{
					black++;
					if(card.contains("S"))
						spade++;
					else
						club++;
					}
				if(card.contains("2"))
					two++;
				else if(card.contains("3"))
					three++;
				else if(card.contains("4"))
					four++;
				else if(card.contains("5"))
					five++;
				else if(card.contains("6"))
					six++;
				else if(card.contains("7"))
					seven++;
				else if(card.contains("8"))
					eight++;
				else if(card.contains("9"))
					nine++;
				else if(card.contains("10"))
					ten++;
				else if(card.contains("J"))
					jack++;
				else if(card.contains("Q"))
					queen++;
				else if(card.contains("K"))
					king++;
				else if(card.contains("A"))
					ace++;
				}
			System.out.println(red + "-RED");
			System.out.println(black + "-BLACK");
			System.out.println(club + "-CLUBS");
			System.out.println(diamond + "-DIAMONDS");
			System.out.println(heart + "-HEARTS");
			System.out.println(spade + "-SPADES");
			if(two > 0)
				{
				if(two > 1)
					System.out.println(two + "-2 cards");
				else
					System.out.println("1-2 card");
				}
			if(three > 0)
				{
				if(two > 1)
					System.out.println(three + "-3 cards");
				else
					System.out.println("1-3 card");
				}
			if(four > 0)
				{
				if(four > 1)
					System.out.println(four + "-4 cards");
				else
					System.out.println("1-4 card");
				}
			if(five > 0)
				{
				if(five > 1)
					System.out.println(five + "-5 cards");
				else
					System.out.println("1-5 card");
				}
			if(six > 0)
				{
				if(six > 1)
					System.out.println(six + "-6 cards");
				else
					System.out.println("1-6 card");
				}
			if(seven > 0)
				{
				if(seven > 1)
					System.out.println(seven + "-7 cards");
				else
					System.out.println("1-7 card");
				}
			if(eight > 0)
				{
				if(eight > 1)
					System.out.println(eight + "-8 cards");
				else
					System.out.println("1-8 card");
				}
			if(nine > 0)
				{
				if(nine > 1)
					System.out.println(nine + "-9 cards");
				else
					System.out.println("1-9 card");
				}
			if(ten > 0)
				{
				if(ten > 1)
					System.out.println(ten + "-10 cards");
				else
					System.out.println("1-10 card");
				}
			if(jack > 0)
				{
				if(jack > 1)
					System.out.println(jack + "-JACKS");
				else
					System.out.println("1-JACK");
				}
			if(queen > 0)
				{
				if(queen > 1)
					System.out.println(queen + "-QUEENS");
				else
					System.out.println("1-QUEEN");
				}
			if(king > 0)
				{
				if(king > 1)
					System.out.println(king + "-KINGS");
				else
					System.out.println("1-KING");
				}
			if(ace > 0)
				{
				if(ace > 1)
					System.out.println(ace + "-ACES");
				else
					System.out.println("1-ACE");
				}
			counter++;
			}
		}

	}
