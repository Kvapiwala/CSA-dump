public class JavaCraps { 
    public static void main(String[] args){
        
        int diceTotal = 0;
        String wincondition = "";
        for (int i = 0; i < 2; i++) {
            int roll = (int) (Math.random()*6);

        
        if (roll < 1) {
            System.out.println("____________");
            System.out.println("|          | ");
            System.out.println("|     0    | ");
            System.out.println("|          | ");
            System.out.println("____________");
            diceTotal += 1;
        }
        else if (roll == 1) {
            System.out.println("____________");
            System.out.println("|        0 | ");
            System.out.println("|          | ");
            System.out.println("| 0        | ");
            System.out.println("____________");
            diceTotal += 2;
        
        }
        else if (roll == 2) {
            System.out.println("____________");
            System.out.println("|         0| ");
            System.out.println("|     0    | ");
            System.out.println("|0         | ");
            System.out.println("____________");
            diceTotal += 3;

        }
        else if (roll == 3) {
            System.out.println("____________");
            System.out.println("|0        0| ");
            System.out.println("|          | ");
            System.out.println("|0        0| ");
            System.out.println("____________");
            diceTotal += 4;

        }
        else if (roll == 4 ) {
            System.out.println("____________");
            System.out.println("|0        0|");
            System.out.println("|     0    |");
            System.out.println("|0        0|");
            System.out.println("____________");
            diceTotal += 5;
        }
        else if (roll > 4 ) {
            System.out.println("____________");
            System.out.println("|0        0|");
            System.out.println("|0        0| ");
            System.out.println("|0        0|");
            System.out.println("____________");
            diceTotal += 6;
        }
        System.out.println("You rolled a total of: " + diceTotal);
        } 
       gameState(wincondition, diceTotal);

       if (wincondition == "Point") {
        gameState(wincondition, diceTotal);
        if (wincondition == "Win") {
            System.out.println("You lose!(Seven Out!)");
        }
       }

     }

     public static void gameState(String gamecondition, int roll) {

     if (roll ==  7 || roll == 11) {
        gamecondition = "Win";
        System.out.println("You win!");
     }
     else if (roll == 2 || roll == 3 || roll == 12) {
        gamecondition = "Loose";
        System.out.print("You loose!");
     }

     else {
        gamecondition = "Point";
        System.out.println("Point!");
     }   
     }

    }
