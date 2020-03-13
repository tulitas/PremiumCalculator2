import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public Policy policy = new Policy();
    private static Risks risks = new Risks();
    private static InsuredSum insuredSum = new InsuredSum();
    private static Coefficients coefficients = new Coefficients();

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
        System.out.println("To add different insured sum input 4 and press ENTER");

        try {
            int num = input.nextInt();
            if (num == 1) {
                flat();
            }
            if (num == 2) {
                tv();
            }
            if (num == 3) {
                createDifferentPremium();
            }
            if (num == 4) {
                createDifferentInsuredSum();


        } else{
            System.out.println("*!! Only 1 or 3 !!*");
            System.out.println("---------------------");
            menu();
        }


    } catch(
    InputMismatchException e)

    {
        input.next();
        System.out.println("*!! Only 1 or 2 !!*");
        System.out.println("---------------------");
        menu();
    }

}

    private static void createDifferentInsuredSum() {
        System.out.print("Choose risk: " + "\n" + "1. Fire" + "\n" + "2. Water");
        int num = input.nextInt();
        if (num == 1) {

        }


    }

    private static void createDifferentPremium() {

        System.out.println("Type a different coefficient: ");
        double differentCoeff = input.nextDouble();
        coefficients.setCoefficientDifferent(differentCoeff);
        System.out.println("Type a different insures sum: ");
        double differentInsuranceSum = input.nextDouble();
        insuredSum.setDifferentInsuredSum(differentInsuranceSum);
        System.out.println("You type coefficient: " + coefficients.getCoefficientDifferent() + " % " + "and sum: " +
                insuredSum.getDifferentInsuredSum() + " EUR ");
        double differentPremium = insuredSum.getDifferentInsuredSum() * coefficients.getCoefficientDifferent();
        System.out.println("Your premium is: " + differentPremium + " EUR");
        System.out.println("---------------------");
        menu();
    }

    private static void tv() {
        int sumWaterFireTV = insuredSum.getSumInsuredFireTV() + insuredSum.getSumInsuredWaterTV();
        double coefficietWater = insuredSum.getSumInsuredWaterTV() * coefficients.getCoefficientWaterDeafault();
        double coefficientFire = insuredSum.getSumInsuredFireTV() * coefficients.getCoefficientFireLess100();
        double coefsum = coefficientFire + coefficietWater;

        System.out.println("Insured: TV " + "Risks: " + risks.getRisks());
        System.out.println("Fire: " + insuredSum.getSumInsuredFireTV() + ", " + "Water: " + insuredSum.getSumInsuredWaterTV() +
                ", " + " Sum: " + sumWaterFireTV);
        System.out.println("Your return premium for TV by WATER is: " + coefficietWater + " EUR ");
        System.out.println("Your return premium for TV by FIRE is: " + coefficientFire + " EUR ");
        System.out.println("Your return premium for TV sum is: " + coefsum + " EUR ");

        System.out.println("------------------------------");
        menu();
    }

    private static void flat() {
        int sumWaterFireFlat = insuredSum.getSumInsuredFireFlat() + insuredSum.getSumInsuredWaterFlat();
        double coefficietWater = insuredSum.getSumInsuredWaterFlat() * coefficients.getCoefficientWaterEqualGreater10();
        double coefficientFire = insuredSum.getSumInsuredFireFlat() * coefficients.getCoefficientFireOver100();
        double coefsum = coefficientFire + coefficietWater;

        System.out.println("Insured: Flat " + "Risks: " + risks.getRisks());
        System.out.println("Fire: " + insuredSum.getSumInsuredFireFlat() + ", " + "Water: " + insuredSum.getSumInsuredWaterFlat() +
                ", " + " Sum: " + sumWaterFireFlat);
        System.out.println("Your return premium for TV by WATER is: " + coefficietWater + " EUR ");
        System.out.println("Your return premium for TV by FIRE is: " + coefficientFire + " EUR ");
        System.out.println("Your return premium for TV sum is: " + coefsum + " EUR ");

        System.out.println("------------------------------");
        menu();
    }
}
