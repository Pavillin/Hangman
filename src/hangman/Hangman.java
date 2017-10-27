package hangman;

/**
 *
 * @author Dylan
 */
import java.util.Scanner;
import java.util.Random;

public class Hangman
{
    public static void main (String [] args)
    {
	Scanner kb = new Scanner (System.in);
	Random rand = new Random();
		
	System.out.println("WELCOME TO DYLAN'S HANGMAN GAME!");
	System.out.println("GUESS ONE LETTER AT A TIME.");
	System.out.println("IF YOU MISS MORE THAN 5 TIMES, YOU LOSE!");
		
	int ran = 1 + rand.nextInt(10);//PICKS RANDOM NUMBER(WORD)
	String guess; //GUESS(LETTERS)
	int guessnum = 0; //GUESS(NUMBERS)
	String miss; //MISSES(LETTERS)
	int missnum = 0; //MISSED(NUMBERS)
		
	if (ran==1)
	{
            String word = "word";
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\nYour Word:");
            System.out.println("_ _ _ _");
            System.out.println("Misses:");
            System.out.println("Lives:");
            System.out.print("Guess: ");
            guess = kb.next();
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		if (word.contains(guess))
		{
                    System.out.println ("You guessed a letter");
                    guessnum++;
			if (guessnum == 5)
			{
                            System.out.println("You guessed the word! YOU WIN!");
			}
		}
		else
                    System.out.println("Oops, that was not a correct letter, try again!");
                        missnum++;
                        if (missnum == 5)
			{
                            System.out.println("Oh no! You ran out of lives! YOU LOSE!");
			}
	}
	if (ran==2)
	{
            String java = "java";
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\nYour Word:");
            System.out.println("_ _ _ _");
            System.out.println("Misses:");
            System.out.println("Lives:");
            System.out.print("Guess: ");
            guess = kb.next();
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		if (java.contains(guess))
		{
                    System.out.println ("You guessed a letter");
                    guessnum++;
			if (guessnum == 5)
			{
                            System.out.println("You guessed the word! YOU WIN!");
			}
		}
		else
                    System.out.println("Oops, that was not a correct letter, try again!");
                        missnum++;
                        if (missnum == 5)
			{
                            System.out.println("Oh no! You ran out of lives! YOU LOSE!");
			}
	}
	if (ran==3)
	{
            String motorbike = "motorbike";
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\nYour Word:");
            System.out.println("_ _ _ _ _ _ _ _ _");
            System.out.println("Misses:");
            System.out.println("Lives:");
            System.out.print("Guess: ");
            guess = kb.next();
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		if (motorbike.contains(guess))
		{
                    System.out.println ("You guessed a letter");
                        guessnum++;
			if (guessnum == 5)
			{
                            System.out.println("You guessed the word! YOU WIN!");
			}
		}
		else
		System.out.println("Oops, that was not a correct letter, try again!");
                    missnum++;
                    if (missnum == 5)
                    {
                        System.out.println("Oh no! You ran out of lives! YOU LOSE!");
                    }
	}
	if (ran==4)
	{
            String magic = "magic";
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\nYour Word:");
            System.out.println("_ _ _ _ _");
            System.out.println("Misses:");
            System.out.println("Lives:");
            System.out.print("Guess: ");
            guess = kb.next();
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		if (magic.contains(guess))
		{
                    System.out.println ("You guessed a letter");
                    guessnum++;
			if (guessnum == 5)
			{
                            System.out.println("You guessed the word! YOU WIN!");
			}
		}
		else
                    System.out.println("Oops, that was not a correct letter, try again!");
                        missnum++;
			if (missnum == 5)
			{
                            System.out.println("Oh no! You ran out of lives! YOU LOSE!");
			}
	}
	if (ran==5)
	{
            String pepperoni = "pepperoni";
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\nYour Word:");
            System.out.println("_ _ _ _ _ _ _ _ _");
            System.out.println("Misses:");
            System.out.println("Lives:");
            System.out.print("Guess: ");
            guess = kb.next();
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		if (pepperoni.contains(guess))
		{
                    System.out.println ("You guessed a letter");
                        guessnum++;
                        if (guessnum == 5)
			{
                            System.out.println("You guessed the word! YOU WIN!");
			}
		}
		else
		System.out.println("Oops, that was not a correct letter, try again!");
                    missnum++;
                    if (missnum == 5)
                    {
			System.out.println("Oh no! You ran out of lives! YOU LOSE!");
                    }
	}
	if (ran==6)
	{
            String jukebox = "jukebox";
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\nYour Word:");
            System.out.println("_ _ _ _ _ _ _");
            System.out.println("Misses:");
            System.out.println("Lives:");
            System.out.print("Guess: ");
            guess = kb.next();
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                if (jukebox.contains(guess))
		{
                    System.out.println ("You guessed a letter");
                        guessnum++;
			if (guessnum == 5)
			{
                            System.out.println("You guessed the word! YOU WIN!");
			}
                }
		else
                    System.out.println("Oops, that was not a correct letter, try again!");
                    missnum++;
                    if (missnum == 5)
                    {
			System.out.println("Oh no! You ran out of lives! YOU LOSE!");
                    }
	}
	if (ran==7)
	{
            String cat = "cat";
            System.out.println("\nYour Word:");
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("_ _ _");
            System.out.println("Misses:");
            System.out.println("Lives:");
            System.out.print("Guess: ");
            guess = kb.next();
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		if (cat.contains(guess))
		{
                    System.out.println ("You guessed a letter");
                        guessnum++;
			if (guessnum == 5)
			{
                            System.out.println("You guessed the word! YOU WIN!");
			}
		}
		else
                    System.out.println("Oops, that was not a correct letter, try again!");
                        missnum++;
			if (missnum == 5)
			{
                            System.out.println("Oh no! You ran out of lives! YOU LOSE!");
			}
	}
	if (ran==8)
	{
            String vehicle = "vehicle";
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\nYour Word:");
            System.out.println("_ _ _ _ _ _ _");
            System.out.println("Misses:");
            System.out.println("Lives:");
            System.out.print("Guess: ");
            guess = kb.next();
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                if (vehicle.contains(guess))
		{
                    System.out.println ("You guessed a letter");
                        guessnum++;
			if (guessnum == 5)
			{
                            System.out.println("You guessed the word! YOU WIN!");
			}
		}
                else
                    System.out.println("Oops, that was not a correct letter, try again!");
                        missnum++;
			if (missnum == 5)
			{
                            System.out.println("Oh no! You ran out of lives! YOU LOSE!");
			}
        }
	if (ran==9)
        {
            String power = "power";
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\nYour Word:");
            System.out.println("_ _ _ _ _");
            System.out.println("Misses:");
            System.out.println("Lives:");
            System.out.print("Guess: ");
            guess = kb.next();
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                if (power.contains(guess))
		{
                    System.out.println ("You guessed a letter");
			guessnum++;
			if (guessnum == 5)
			{
                            System.out.println("You guessed the word! YOU WIN!");
			}
		}
		else
                    System.out.println("Oops, that was not a correct letter, try again!");
                        missnum++;
			if (missnum == 5)
			{
                            System.out.println("Oh no! You ran out of lives! YOU LOSE!");
			}
	}
        if (ran==10)
        {
            String kite = "kite";
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\nYour Word:");
            System.out.println("_ _ _ _");
            System.out.println("Misses:");
            System.out.println("Lives:");
            System.out.print("Guess: ");
            guess = kb.next();
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		if (kite.contains(guess))
		{
                    System.out.println ("You guessed a letter");
                        guessnum++;
			if (guessnum == 5)
			{
                            System.out.println("You guessed the word! YOU WIN!");
			}
		}
		else
                    System.out.println("Oops, that was not a correct letter, try again!");
                        missnum++;
                        if (missnum == 5)
			{
                            System.out.println("Oh no! You ran out of lives! YOU LOSE!");
			}
	}
    }
}
