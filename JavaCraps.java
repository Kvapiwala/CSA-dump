public class JavaCraps {
    public static void main(String[] args) {
        System.out.println("players turn");
        boolean playerRun = play("Player");

        System.out.println("Computers turn");
        boolean computerRun = play("Computer");

        System.out.println("--------Final result----------");
        if (playerRun && !computerRun){
        System.out.println("Player wins!");
        }
        else if (!playerRun && computerRun) {
            System.out.println("Computer wins!");
        }
        else if (playerRun && computerRun) {
            System.out.println("Both win!");
        }
        else {
            System.out.println("Both loose :(");
        }

        
    }
    public static boolean  play(String name){
        int diceTotal = roll(name);
        int point = 0;
       
        if (!(diceTotal !=  7 && diceTotal != 11)) {
         System.out.println(name + "Wins!");
         return true;
         }
        else if (!(diceTotal != 2 && diceTotal != 3 && diceTotal != 12)) {
         System.out.println(name + "Looses!");
         return false;
         }
         else if (!((diceTotal == 7) || (diceTotal == 11) || (diceTotal == 2) || (diceTotal == 3) || (diceTotal == 12))) {
        System.out.println(name + "'s Point! --->" + diceTotal);
            point = diceTotal;
         }

         while (true) {
            diceTotal = roll(name);

            if (diceTotal != point && diceTotal != 7) {
                System.out.println(name + " is Rolling Again");
            }
            else if (!(diceTotal != point)) {
                System.out.println(name + " rolled " + point + " again, " + name + " wins!");
                return true;
            }
            else if (diceTotal == 7) {
                System.out.println("SEVEN OUT!!" + name + "LOOSES");
                return false;
            }
        }

    }
    public static int roll(String player) {
        int diceTotal = 0;
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
        }
        System.out.println(player +" rolled a total of: " + diceTotal);
    return diceTotal;
}
}
