package forwork.java.in;

import java.util.Scanner;

public class Pangramwrk {

	
		public static void pangramWord(String word)

		{

			String check=word.toLowerCase();

			int count=0;

			String compare="abcdefghijklmnopqrstuvwxyz";

			for(int i=0;i<compare.length();i++)

			{

				for(int j=0;j<check.length();j++)

				{

					if(compare.charAt(i)==check.charAt(j))

					{

						count++;

						break;

					}}}

			if(count==26)

			{
				System.out.println("pangram");

			}

			else
			{

				System.out.println("not pangram");

			}

		}

		public static void  main(String args[])

		{

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a word :- ");
			String word=sc.nextLine();
			pangramWord(word);

			

		}



	}