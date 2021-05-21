import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        while(pileA>0 || pileB > 0 || pileC >0) {
            System.out.print("A: "+ pileA+ "     B: " + pileB + "     C: " + pileC);
            System.out.print("\r\nChoose a pile: ");
            String pile = keyboard.nextLine();
            System.out.print("\r\nHow many to remove from pile " + pile + ": ");
            int removal = keyboard.nextInt();
            keyboard.nextLine();
            if (pile.equalsIgnoreCase("A")) {
                pileA = pileA - removal;
            } else if (pile.equalsIgnoreCase("B")) {
                pileB = pileB - removal;
            } else if (pile.equalsIgnoreCase("C")) {
                pileC = pileC - removal;
            }
            if(pileA<=0 && pileB <= 0 && pileC <= 0) {
                System.out.print("All piles are empty. Good job!");
            }
        }
    }
}