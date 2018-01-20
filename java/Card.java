/*
 * Defines the card class.
 */
package memstack;

public class Card {
    
   int value;
   char suit;
   
   public Card() {
       
   }
   
   public Card(int cardValue, char cardSuit) {
       
    this.value = cardValue;
    this.suit = cardSuit;
    
   }
   
   public String printCard() {
       
       String printedValue, printedSuit;
       printedSuit = "No Suit";
       
       switch (this.suit) {
           case 'H':
               printedSuit = "Hearts";
               break;    
           case 'S':
               printedSuit = "Spades";
               break;
           case 'C':
               printedSuit = "Clubs";
               break;
           case 'D':
               printedSuit = "Diamonds";
               break;
           default:
           System.out.println("Error in Suits");
       }
       
       
       
       
       
       return this.value + " " + printedSuit;
   }  
   
}
