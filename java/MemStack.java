package memstack;

import java.util.*;
/**
 *
 * @author amakar
 */
public class MemStack {

    public static void main(String[] args) {
           
        Deck myDeck = new Deck("Ireland");

        //declare the input for menu choice
        Scanner input = new Scanner(System.in);
        char menuChoice;
               
        do {
            printMenu();// TODO code application logic here
            menuChoice = input.nextLine().charAt(0);
            menuChoice = Character.toUpperCase(menuChoice);
            
            switch (menuChoice){
                case 'A':
                System.out.println(menuChoice + "Number to Card");    
                break;
                case 'B':
                cardToNumber(myDeck);
                break;
                case 'P':
                myDeck.printDeck();
                break;
                case 'Q':
                System.out.println("Exiting program.  Goodbye");
                break;
                default:
                System.out.println("Please select a valid choice");
            }
            
        } while (menuChoice != 'Q');
        
    }

    public static void printMenu() {
        System.out.println("Welcome to MemStack");
        System.out.println("-------------------");
        System.out.println("\nPlease select from the following options");
        System.out.println("(A) Number to Card");
        System.out.println("(B) Card to Number");
        System.out.println("(P) Print Stack");
        System.out.println("(Q) Quit");
        System.out.print("\nPlease enter a selection: ");
    }
    
    public static void cardToNumber (Deck myDeck) {
    
     //generate a random number between 0 and 51   
     Scanner input = new Scanner(System.in);
     int randomCard = (int)(Math.random() * 51);   
     int cardPosition, cardGuess;
     Card testCard;
     
     //offset the 0 starting point in the array
     testCard = myDeck.getCard(randomCard);
     
     System.out.print("The " + testCard.printCard() + " position is: ");
     
     cardGuess = input.nextInt();
     cardPosition = randomCard +1;
     if (cardGuess == cardPosition){
         System.out.println("You are correct\n");
     } else {
         System.out.printf("Sorry.  You are incorrect.  The %s is in position %d\n",testCard.printCard(), cardPosition );
     }
     
    }
    
    
}
