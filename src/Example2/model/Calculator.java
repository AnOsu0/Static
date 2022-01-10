package Example2.model;

import java.util.Scanner;

public class Calculator {
    private static final double CUP_CAPACITY = 250;
    private static final double SMALL_SPOON_CAPACITY = 5;
    private static final double BIG_SPOON_CAPACITY= 15;

    static Scanner sc = new Scanner(System.in);
    public static void Cup(){
        System.out.println("Podaj ilość szklanek w przepisie:");
        double a = sc.nextDouble();
        System.out.println("Potrzbena ilość mililitrów to " + (a*CUP_CAPACITY));
    }
    public static void bigSpoon(){
        System.out.println("Podaj ilość łyżek w przepisie: ");
        double a = sc.nextDouble();
        System.out.println("Potrzbena ilość mililitrów to " + (a*BIG_SPOON_CAPACITY));
    }
    public static void smallSpoon(){
        System.out.println("Podaj ilość łyżeczek w przepisie:");
        double a = sc.nextDouble();
        System.out.println("Potrzbena ilość mililitrów to " + (a*SMALL_SPOON_CAPACITY));
    }

}
