import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public Policy policy = new Policy();
    public static void main(String[] args) {

        infoCheck();
    }

    private static void infoCheck() {
//        System.out.println("Policy Nr.: " + policyN.getPolicy_num());
//        System.out.println("Policy status: " + policyN.getPolicy_stat1());
//        System.out.println("You insured:  " + policyN.getPolicy_obj());
//        System.out.println("Premium:  " + policyN.getRiskSumma() + " EUR ");
//        System.out.println("------------------------------");
        menu();

    }

    private static void menu() {

        System.out.println("To look details for FLAT input 1 and press ENTER");
        System.out.println("To look details for TV input 2 and press ENTER");
        System.out.println("To add different risk input 3 and press ENTER");

        try {
            int num = input.nextInt();
            if (num == 1) {
                flat();
            }
            if (num == 2) {
                tv();
            }
            if (num == 3) {
                createDifferentRisk();


            } else {
                System.out.println("*!! Only 1 or 2 !!*");
                System.out.println("---------------------");
                menu();
            }


        } catch (InputMismatchException e) {
            input.next();
            System.out.println("*!! Only 1 or 2 !!*");
            System.out.println("---------------------");
            menu();
        }
    }

    private static void createDifferentRisk() {

        System.out.println("New Risk");
        Risks risks = new Risks();
        System.out.println(risks.getRisks());
        Policy policy = new Policy();
        policy.run();
        menu();
    }

    private static void tv() {
        System.out.println("tv");
        menu();
    }

    private static void flat() {
        System.out.println("flat");
        menu();
    }
}
