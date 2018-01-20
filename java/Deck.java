/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memstack;

public class Deck {

    Card[] deck = new Card[52];
    
    public Deck() {

    }
    
    public Deck(String stack){
    
        setDeck("Ireland");
    }
    
    public void setDeck (String stack) {
        
        //default is the Ireland Stack
        deck[0] = new Card(7,'H');
        deck[1] = new Card(4, 'H');
        deck[2] = new Card(13, 'H');
        deck[3] = new Card(2, 'C');
        deck[4] = new Card(10, 'S');
        deck[5] = new Card(6, 'C');
        deck[6] = new Card(8, 'H');
        deck[7] = new Card(12, 'D');
        deck[8] = new Card(2, 'D');
        deck[9] = new Card(12, 'S');
        deck[10] = new Card(5, 'D');
        deck[11] = new Card(6, 'H');
        deck[12] = new Card(13, 'C');
        deck[13] = new Card(7, 'S');
        deck[14] = new Card(11, 'S');
        deck[15] = new Card(4, 'S');
        deck[16] = new Card(12, 'H');
        deck[17] = new Card(12, 'C');
        deck[18] = new Card(2, 'S');
        deck[19] = new Card(13, 'S');
        deck[20] = new Card(3, 'H');
        deck[21] = new Card(11, 'H');
        deck[22] = new Card(13, 'D');
        deck[23] = new Card(2, 'H');
        deck[24] = new Card(1, 'S');
        deck[25] = new Card(6, 'S');
        deck[26] = new Card(1, 'C');
        deck[27] = new Card(9, 'C');
        deck[28] = new Card(3, 'C');
        deck[29] = new Card(1, 'D');
        deck[30] = new Card(11, 'C');
        deck[31] = new Card(8, 'D');
        deck[32] = new Card(9, 'H');
        deck[33] = new Card(8, 'C');
        deck[34] = new Card(9, 'S');
        deck[35] = new Card(1, 'H');
        deck[36] = new Card(9, 'D');
        deck[37] = new Card(10, 'H');
        deck[38] = new Card(8, 'S');
        deck[39] = new Card(6, 'D');
        deck[40] = new Card(3, 'S');
        deck[41] = new Card(5, 'H');
        deck[42] = new Card(5, 'C');
        deck[43] = new Card(4, 'D');
        deck[44] = new Card(10, 'D');
        deck[45] = new Card(7, 'C');
        deck[46] = new Card(3, 'D');
        deck[47] = new Card(4, 'C');
        deck[48] = new Card(7, 'D');
        deck[49] = new Card(10, 'C');
        deck[50] = new Card(11, 'D');
        deck[51] = new Card(5, 'S');       
        
    }
    
    public Card getCard (int i) {
        return deck[i];
    }
   
    public void printDeck() {
        
        int cardIndex;
        for (int i = 0; i < deck.length; i++){
            cardIndex = i + 1;
            System.out.println("Card Position: "+ cardIndex + " is the " + deck[i].printCard());
        }
    }
}
