package example;
import java.util.*;
public class decemberContst {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();

	        String[] players = new String[4];
	        players[0]="Bharath Raj";
	        players[1]="Bharath V";
	        players[2]="Gayathri S";
	        players[3]="Cusnatsova A V";

	        int askerIndex = rand.nextInt(4);
	        int answererIndex;
	        do {
	            answererIndex = rand.nextInt(4);
	        } while (askerIndex == answererIndex);

	        System.out.println();
	        System.out.println("Asker   : " + players[askerIndex]);
	        System.out.println("Answerer: " + players[answererIndex]);

	        sc.close();
	    }
	}