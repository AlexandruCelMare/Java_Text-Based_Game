/*
Programmer Name: Alexander Butarita
Assignment Start: 12/1/2020
Assignment Completion: 12/16/2020
Total Hours for Assignment: 30
Man, this one took a while. I wish I could have could have done a better
job with input validation. I also don't know why the array returns null
when I try to call it to certain functions (It one was the one thing that would
constantly break every time I decided to redesign the program, as such I had to give
up since I've run out of time. I also apologize for the ratio of do-while loops compared
to other types of loops.
 */

import java.util.Scanner;

interface functionPair{     //I apologize for such a fundamental use of interfaces and abstract classes
    void closingCredits();  // You can tell that the program was not made with these two concepts as a priority
    void guessingGame();
}
abstract class usingFunctionPair implements functionPair{
    public void closingCredits()
    {
        System.out.print("Oh man, this one took a while."+
                "\n\nHave a great winter!\n\n");
    }
    // I spent too much time trying to do input validation for non-integers
// and did not succeed. I wish there was a function like cin.fail() in java
    // It would also seem that if you happen to reach the third attempt at guessing
    // the number, you lose even if you "logically" guessed it correctly
    // And yet, It doesn't trigger any of my other if statements

    public void guessingGame() {
        Scanner input = new
                Scanner(System.in);

        int tries = 0;
        String retry;
        int guessNum;

        int number = (int) (Math.random() * 4 + 1);

        System.out.print("\nTry to guess a number 1-5!\n\n" +
                "You get 3 tries!\n\n" +
                "Enter a number:\n\n");
        do {
            guessNum = input.nextInt();
            tries++;

            do {
                if (guessNum > number && guessNum <= 5) {
                    System.out.print("\nHAHA, that number is too large! Try again!\n" +
                            "\nEnter a number 1-5:\n\n");

                } else if (guessNum < number && guessNum >= 1) {
                    System.out.print("\nHAHA, that number is too small! Try again!\n" +
                            "\nEnter a number 1-5:\n\n");
                } else if (guessNum == number) {
                    System.out.print("\nGOSH DARN IT! You got me in ");
                    System.out.print(tries);
                    System.out.print(" guesses!\n\n" +
                            "You win this time...\n");
                    return;
                } else if (guessNum != 1 || guessNum != 2 || guessNum != 3 ||
                        guessNum != 4 || guessNum != 5 || guessNum > 5 || guessNum < 1) {
                    System.out.print("I said a number 1-5, not -2430 to 63990. Go on, guess a number.\n" +
                            "1-5, if I haven't made it clear enough.\n\n" +
                            "Enter a number 1-5:\n\n");
                    tries = 0;
                    continue;
                }
            } while (!input.hasNextInt());

        } while (tries <= 1);

        if ((guessNum != number) && (tries == 2)) {
            {
                System.out.print("\nBetter luck next time. Loser!\n\n" +
                        "GAME OVER\n\n");
                retry = "o";
                System.out.print("Would you like to retry this situation?(y/n)\n");
                while (!retry.equals("y") && !retry.equals("Y") && !retry.equals("n") && !retry.equals("N")) {
                    retry = input.next();
                }
            }
            if (retry.equals("y") || retry.equals("Y")) {
                guessingGame();
            } else {
                System.out.print("GOODBYE!\n");
                System.exit(0);
            }
        }
    }

}
class gameSystem extends usingFunctionPair{
    boolean key1;
    boolean key2;
    String theSamaritan;
    String pathChoice;
    String[] name = new String[2]; //Properly scoping this array took me hours
    // I eventually got it to work, but once I put bulks of the code in a few functions
    // to organized the program, it messed it up and now it only returns null. I spent another hour trying
    // to fix it but to no avail.

    public static void codeSection1(){
        Scanner input = new
                Scanner(System.in);
        System.out.print("\nIn the mythical world of Puzzulia, survival of the fittest was not based\n" +
                        "on the physical or athletic skills of an individual, but on their ability to\n" +
                        "efficiently solve puzzles.\n");
                gameSystem obj = new gameSystem();
                obj.enterA();
                System.out.print("However, among those puzzle solving individuals were the great puzzle solving\n" +
                        "individuals.\n");
                obj.enterA();
                System.out.print("One such individual is Rubiks, puzzler of puzzlers.");
                obj.enterA();
                System.out.print("Rubiks used his puzzle-solving abilities to slaughter and slay anyone who dared\n" +
                        "to cross his path.\n");
                obj.enterA();
                System.out.print("However, there was one thing that Rubiks sought and had acquired...\n");
                obj.enterA();
                System.out.print("THE LEGENDARY STONE OF |ATHANASIA|, the key to immortality.\n");
                obj.enterA();
                System.out.print("However, once Rubiks had acquired this stone, he disappeared.\n");
                obj.enterA();
                System.out.print("Many had embarked on journeys in search of Rubiks and his immortality stone.\n");
                obj.enterA();
                System.out.print("Among these adventurers, there was also a young boy in search of, not the stone,\n" +
                        "but Rubiks. Rubiks was his greatest hero, every young puzzlers role-model\n");
                obj.enterA();
                System.out.print("This young boy's name was...\n");
                obj.enterA();
                System.out.print("'MOM! WHAT WAS THE NAME OF THAT ONE KID WHO WENT ON A JOURNEY TO FIND RUBIKS?'\n");
                System.out.print("\nPlease enter your first name:\n\n");
                for (int i = 1; i < obj.name.length; i++) {
                    obj.name[i] = input.nextLine();
                }
                System.out.print("\nAh, ya mean that little ole rascal, ");
                System.out.print(obj.name[1]);
                System.out.print("?\n");
                obj.enterA();
                System.out.print("Yeah, ");
                System.out.print(obj.name[1]);
                System.out.print("! Thats the name!\n");
                obj.enterA();
                System.out.print("And so ");
                System.out.print(obj.name[1]);
                System.out.print(" begins his/her little adventure...\n");
                obj.enterA();

    }
    public static void codeSection2(String[] name) {
        gameSystem obj = new gameSystem();

                System.out.print("As you're leaving your hometown, you come across an injured traveler. \n");
                obj.enterA();

                obj.key1 = obj.traveler();

                System.out.print("And so, you continue on your journey.\n");
                obj.enterA();
                System.out.print("All of a sudden, while traveling through the woods, a man jumps out of a tree and\n\n" +
                "approaches you while laughing.\n");
                obj.enterA();
                System.out.print("HAHAHA, you thought could casually stroll the forest without running into me?!\n" +
                "The 'Lord of Numbers'?!\n");
                obj.enterA();
                System.out.print("I present to you one of my most difficult puzzles...\n");
                obj.enterA();
                System.out.print("'The Guessing Game'!\n\n");

                obj.guessingGame();

                obj.enterA();
                System.out.print("You continue your journey and you come across a large and mystical mountain.\n");
                obj.enterA();
                System.out.print("The only way to get past this mountain is if you enter a cave, so you do.\n");
                obj.enterA();
                System.out.print("The cave is illuminated by naturally occurring minerals that provide a calm, blue, light.\n");
                obj.enterA();
                System.out.print("However, as you are traversing this awe-inspiring geological structure, you come across" +
                "\na situation in which you have to decide what path to take.\n");
                obj.enterA();

                obj.key2 = obj.cave();

                obj.enterA();
                System.out.print("As your little journey comes to a conclusion, you come across a small pond.\n");

                obj.ending(obj.name, obj.key1, obj.key2);

                obj.closingCredits();
    }

    public static void enterA() {
        Scanner input = new
                Scanner(System.in);
        System.out.print("\nEnter 'a' to continue\n\n");
        String enter = input.next();
        System.out.print("\n");
        while (!enter.equals("a")) {
            System.out.print("\n");
            enter = input.next();
        }

    }
    /* I was going to make an array function to hold
    the name but was having a hard time
    public static String[] theName() {
        Scanner input = new
                Scanner(System.in);
        String[] name = new String[2];
        for (int i = 0; i < name.length; i++) {
                name[i] = input.nextLine();
            }
        return name;
    }

     */

//Function traveler
//First in-game situation

    public boolean traveler() {
        do {
            Scanner input = new
                    Scanner(System.in);
            key1 = false;
            String retry;
            System.out.print("\nDo you:\n" +
                    "A: Offer the traveler a trip to a nearby motel.\n" +
                    "B: Leave the traveler and assume that someone else might help.\n" +
                    "C: Attempt to steal some of his belongings.\n\n");
            theSamaritan = input.next();

            if (theSamaritan.equals("a") || theSamaritan.equals("A")) {
                System.out.print("\nThe traveler is very appreciative of your kind act and hands you\n" +
                        "what seems to be the piece of a key. This might help you along your journey.\n");
                key1 = true;
                //I want this key to allow players to unlock
                //a secret in the second part of this game
            } else if (theSamaritan.equals("b") || theSamaritan.equals("B")) {
                System.out.print("\nYou watch as the traveler struggles to crawl. However, his struggles\n" +
                        "do not concern you.\n");
            } else if (theSamaritan.equals("c") || theSamaritan.equals("C")) {
                System.out.print("\nAs you try to grab his fine leathery jacket, he reaches for has dagger\n" +
                        "and you suddenly find yourself slowly bleeding into the void\n\n" +
                        "GAME OVER\n\n");
                do {
                    System.out.print("Would you like to retry this situation? (y/n)\n");
                    retry = input.next();
                } while (!retry.equals("y") && !retry.equals("Y") && !retry.equals("n") && !retry.equals("N"));

                if (retry.equals("y") || retry.equals("Y")) {
                    key1 = traveler();
                } else {
                    System.out.print("GOODBYE!\n");
                    System.exit(0);
                }
            } else
                System.out.print("Invalid input. Retry the situation: \n\n");

        } while (!theSamaritan.equals("a") && !theSamaritan.equals("A") && !theSamaritan.equals("b") &&
                !theSamaritan.equals("B") && !theSamaritan.equals("c") && !theSamaritan.equals("C"));
        return key1;
    }

    public boolean cave() {
        Scanner input = new
                Scanner(System.in);
        do {
            key2 = false;
        String retry;
            System.out.print("\nDo you:\n"+
                "A: Take the path that is dimly lit and has eerie animal sounds emanating from the end of it.\n"+
                "B: Take the path that is also dimly lit but has footprints from previous cave explorers.\n"+
                "C: Take the path that has a strong light at the end of it.\n\n");
            pathChoice = input.next();
        if (pathChoice.equals("a") || pathChoice == "A")
            {
                System.out.print("\nYou take the path that is radiating with the predatory sounds of wild animals.\n"+
                "Unfortunately, since this isn't a movie, you are met with the grim realization\n"+
                "that you have just entered the shelter of an angry mother bear defensively surrounding"+
                "\nher cubs.\n");
                enterA();
                System.out.print("You do not get another chance to see the light of day.\n\n");
                enterA();
                System.out.print("GAME OVER\n\n");
            do
            {
                System.out.print("Would you like to retry this situation? (y/n)\n");
                retry = input.next();
            } while (!retry.equals("y") && !retry.equals("Y") && !retry.equals("n") && !retry.equals("N"));

        if(retry.equals("y") || retry.equals("Y"))
        {
            key2 = cave();
        }
            else
            {
                System.out.print("GOODBYE!\n");
                System.exit(0);
            }
    }
    else if (pathChoice.equals("b") || pathChoice.equals("B"))
    {
        System.out.print("\nYou take the a dark path that is riddled with the footprints of previous cave explorers,\n"+
                "As you traverse the cave, you come across a rotten treasure chest. You open it.\n"+
                "Coincidentally, the chest contained the second piece of your key!\n"+
                "You leave the cave unharmed. Your journey continues.\n");
        key2 = true;
    }
    else if (pathChoice.equals("c") || pathChoice.equals("C"))
    {
        System.out.print("\nYou take the path that has a strong light at the end of it.\n"+
                "Fortunately, you leave the cave unharmed. Your journey continues.\n");
    }
    else
        System.out.print("Invalid input. Retry the situation: \n\n");

    } while (!pathChoice.equals("a") && !pathChoice.equals("A") && !pathChoice.equals("b") &&
                !pathChoice.equals("B") && !pathChoice.equals("c") && !pathChoice.equals("C"));
    return key2;
}
static public void ending(String[] name, boolean key1, boolean key2) {
    if (key1 == false && key2 == false) {
        System.out.print("You look in the pond, and seeing your reflection, you realize something.\n");
        enterA();
        System.out.print("It isn't a about the destination, but the journey!\n");
        enterA();
        System.out.print("And so, ");
        System.out.print(name[1]);
        System.out.print(" experiences a boring and cliche ending in which he becomes spiritually content with himself.\n");
        enterA();
        System.out.print("Little does ");
        System.out.print(name[1]);
        System.out.print(" know, there was more to this journey than one would assume...\n");
        enterA();
        System.out.print("THE END\n");
    } else if (key1 == true && key2 == false) {
        System.out.print("You look in the pond and notice something peculiar: a trapdoor");
        enterA();
        System.out.print("However, it requires a key. You look in your pockets and realize that that you\n" +
                "have the key that the injured traveler gave you.\n");
        enterA();
        System.out.print("Unfortunately, you only have part of the key. Not that it mattered anyways.\n");
        enterA();
        System.out.print("You go for a swim and then continue your journey\n");
        enterA();
        System.out.print("After decades of journeying, ");
        System.out.print(name[1]);
        System.out.print(" grows old and is left with nothing but memories\n" +
                "and tales to tell.\n");
        enterA();
        System.out.print(name[1]);
        System.out.print(" wonders: 'what if there was more to it?' Indeed, he was correct.\n");
        enterA();
        System.out.print("THE END\n\n");
        enterA();
        System.out.print("Not gunna lie. That was a pretty anti-climatic ending. Don't ya think? Turns out there are\n" +
                "some fan made endings as well. Ima give em a read.\n\n");

    } else if (key1 == false && key2 == true) {
        System.out.print("You look in the pond and notice something peculiar: a trapdoor");
        enterA();
        System.out.print("However, it requires a key. You look in your pockets and realize that that you\n" +
                "have the key that you found while traversing the mystical cave.\n");
        enterA();
        System.out.print("Unfortunately, you only have part of the key. Not that it mattered anyways.\n");
        enterA();
        System.out.print("You go for a swim and then continue your journey\n");
        enterA();
        System.out.print("After decades of journeying, ");
        System.out.print(name[1]);
        System.out.print(" grows old and is left with nothing but memories\n" +
                "and tales to tell.\n");
        enterA();
        System.out.print(name[1]);
        System.out.print(" wonders: 'what if there was more to it?' Indeed, he was correct.\n");
        enterA();
        System.out.print("THE END\n\n");
        enterA();
        System.out.print(name[1]);
        System.out.print(": Not gunna lie. That was a pretty anti-climatic ending. Don't ya think? Turns out there are\n" +
                "some fan made endings as well. Ima give em a read.\n\n");

    } else if (key1 == true && key2 == true) {
        System.out.print("You look in the pond and notice something peculiar: a trapdoor.\n");
        enterA();
        System.out.print("However, it requires a key. You look in your pockets and realize that that you\n" +
                "have the part of the key that you found while traversing the mystical cave and the other part\n" +
                "that the injured traveler gave you.\n");
        enterA();
        System.out.print("You combine the two parts, insert the key, and behold: THE LEGENDARY STONE OF |ATHANASIA|.\n");
        enterA();
        System.out.print("Whats this? A letter?\n");
        enterA();
        System.out.print("'Dear adventurer,\n\n" +
                "If you found this letter, it means that you were successful in attaining THE LEGENDARY STONE OF |ATHANASIA|.\n" +
                "As it turns out, immortality isn't as impressive as one would think, so I decided to leave this stone to someone\n" +
                "who might appreciate it more. Enjoy you travels.'\n");
        enterA();
        System.out.print("-Rubiks\n");
        enterA();
        System.out.print("Following this experience, ");
        System.out.print(name[1]);
        System.out.print(" journeyed and enjoyed his life until he, too, grew tired of being immortal.\n" +
                "Thus, the cycle of leaving THE LEGENDARY STONE OF |ATHANASIA| to be found and experienced by brave adventurers\n" +
                "was a Puzzulian tradition that lasted until the end of time.\n");
        enterA();
        System.out.print("THE END\n\n");

        }
    }

}


public class RubiksAdventure {
    public static void main(String[] args) {
        String restart;
        do {

            Scanner input = new
                    Scanner(System.in);
            System.out.print(
                    " _______  ______   __   __  _______  __    _  _______  __   __  ______    _______\n" +
                            "|   _   ||      | |  | |  ||       ||  |  | ||       ||  | |  ||    _ |  |       |\n" +
                            "|  |_|  ||  _    ||  |_|  ||    ___||   |_| ||_     _||  | |  ||   | ||  |    ___|\n" +
                            "|       || | |   ||       ||   |___ |       |  |   |  |  |_|  ||   |_||_ |   |___ \n" +
                            "|       || |_|   ||       ||    ___||  _    |  |   |  |       ||    __  ||    ___|\n" +
                            "|   _   ||       | |     | |   |___ | | |   |  |   |  |       ||   |  | ||   |___ \n" +
                            "|__| |__||______|   |___|  |_______||_|  |__|  |___|  |_______||___|  |_||_______|\n" +
                            "_______  _______    ______    __   __  _______  ___   ___   _  _______ \n" +
                            "|       ||       |  |    _ |  |  | |  ||  _    ||   | |   | | ||       |\n" +
                            "|   _   ||    ___|  |   | ||  |  | |  || |_|   ||   | |   |_| ||  _____|\n" +
                            "|  | |  ||   |___   |   |_||_ |  |_|  ||       ||   | |      _|| |_____ \n" +
                            "|  |_|  ||    ___|  |    __  ||       ||  _   | |   | |     |_ |_____  |\n" +
                            "|       ||   |      |   |  | ||       || |_|   ||   | |    _  | _____| |\n" +
                            "|_______||___|      |___|  |_||_______||_______||___| |___| |_||_______|\n\n");


            //Menu System
            System.out.print("Input any key to start.\t\t('x' quits the program)\t\t\t\t('y'?)\n\n");
            String start = input.next();

            if (!start.equals("x") && !start.equals("y")) {
                System.out.print("\nAnd thus, the story begins...\n");
            } else if (start.equals("y")) {
                System.out.print(
                        "__   __          _                                     \n" +//Secret screen with no purpose whatsoever
                                "| | / /         ( )                                    \n" +
                                " | V /___  _   _|/ _ __ ___    __ _                    \n" +
                                "  | // _ || | | | | '__/ _ |  / _` |                   \n" +
                                "  | | (_) | |_| | | | |  __/ | (_| |                   \n" +
                                "  |_/|___/ |__,_| |_|  |___|  |__,_|                   \n" +
                                "                                                       \n" +
                                "                                                       \n" +
                                "                      _                                \n" +
                                "                     | |                               \n" +
                                " ___ _ __   ___  __ _| | ___   _    ___  _ __   ___    \n" +
                                "/ __| '_ | / _ |/ _` | |/ / | | |  / _ || '_  |/ _ |   \n" +
                                "|__ | | | |  __/ (_| |   <| |_| | | (_) | | | |  __/   \n" +
                                "|___/_| |_||___||__,_|_||_||__, |  |___||_| |_||___|( )\n" +
                                "                            __/ |                   |/ \n" +
                                "                           |___/                       \n" +
                                "                      _ _                      ___     \n" +
                                "                     ( ) |                    |__ |    \n" +
                                "  __ _ _ __ ___ _ __ |/| |_   _   _  ___  _   _  ) |   \n" +
                                " / _` | '__/ _ | '_ |  | __| | | | |/ _ || | | |/ /    \n" +
                                "| (_| | | |  __/ | | | | |_  | |_| | (_) | |_| |_|     \n" +
                                " |__,_|_|  |___|_| |_| |__|  |__,| |___/ |__,_/(_)     \n" +
                                "                               __/ |                   \n" +
                                "                              |___/                    \n");
            } else {
                System.out.print("GOODBYE!\n");
                System.exit(0);
            }
            gameSystem obj = new gameSystem();

            obj.codeSection1();

            obj.codeSection2(obj.name);

            System.out.print("Would you like to retry the game?('y' = yes, any other key to quit)\n\n");
            restart = input.next();
        }while (restart.equals("y") || restart.equals("Y"));

    }

}