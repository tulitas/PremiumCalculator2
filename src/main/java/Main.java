import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static Policy policy = new Policy();
    private static Risks risks = new Risks();
    private static InsuredSum insuredSum = new InsuredSum();
    private static Coefficients coefficients = new Coefficients();
    private static PolicyObject policyObject = new PolicyObject();

    public static void main(String[] args) {

        infoCheck();
    }

    public static void infoCheck() {

        System.out.println("Policy Nr.: " + policy.getPolicyNumber());
        System.out.println("Policy status: " + policy.getPolisyStatus());
        System.out.println("You insured:  " + policyObject.getObjectName() + ", " + policyObject.getPolicySubObject());
        System.out.println("Insured sum:  " + policy.getPolicySum() + " EUR ");
        System.out.println("------------------------------");
        menu();

    }

     static void menu() {

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


            } else {
                System.out.println("*!! Only 1 or 4 !!*");
                System.out.println("---------------------");
                menu();
            }


        } catch (InputMismatchException e) {
            String num = input.next();
            System.out.println("*!! Only 1 or 4 !!*");
            System.out.println("---------------------");
            menu();
        }

    }

    private static void createDifferentInsuredSum() {
        System.out.print("Choose risk: " + "\n" + "1. Fire" + "\n" + "2. Water" + "\n");
        double num = input.nextInt();
        if (num == 1) {
            makeInsuranceFire();
        }
        if (num == 2) {
            makeInsuranceWater();
        } else {
            System.out.println("1 or 2");
            System.out.println("--------------");
        }
        menu();

    }

    private static void makeInsuranceWater() {
        System.out.println("enter the amount for insurance: ");
        double num = input.nextInt();
        if (num < 10) {
            double insuranceReturnPremiumWater = num * coefficients.getCoefficientWaterDeafault();
            String formatteDouble = String.format("%8.2f", insuranceReturnPremiumWater);
            System.out.println("You insured sum: " + num + "\n"
                    + "Your coefficient: " + coefficients.getCoefficientWaterDeafault() + "\n"
                    + "Your return premium is: " + formatteDouble);
        } else {
            double insuranceReturnPremiumWaterEqualGreater10 = num * coefficients.getCoefficientWaterEqualGreater10();
            String formatteDouble = String.format("%8.2f", insuranceReturnPremiumWaterEqualGreater10);
            System.out.println("You insured sum: " + num + "\n"
                    + "Your coefficient: " + coefficients.getCoefficientWaterEqualGreater10() + "\n"
                    + "Your return premium is: " + formatteDouble);
        }
        System.out.println("------------------");
        menu();


    }

    private static void makeInsuranceFire() {
        System.out.println("enter the amount for insurance: ");
        double num = input.nextInt();
        if (num <= 100) {
            double insuranceReturnPremiumFire = num * coefficients.getCoefficientFireLess100();
            String formatteDouble = String.format("%8.2f", insuranceReturnPremiumFire);
            System.out.println("You insured sum: " + num + "\n"
                    + "Your coefficient: " + coefficients.getCoefficientFireLess100() + "\n"
                    + "Your return premium is: " + formatteDouble);
        } else {
            double insuranceReturnPremiumFireOver100 = num * coefficients.getCoefficientFireOver100();
            String formatteDouble = String.format("%8.2f", insuranceReturnPremiumFireOver100);
            System.out.println("You insured sum: " + num + "\n"
                    + " Your coefficient: " + coefficients.getCoefficientFireOver100() + "\n"
                    + " Your return premium is: " + formatteDouble);
        }
        System.out.println("------------------");
        menu();

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
        System.out.println("Fire: " + insuredSum.getSumInsuredFireTV() + " EUR" + ", " + "Water: " + insuredSum.getSumInsuredWaterTV() + " EUR " +
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
        System.out.println("Fire: " + insuredSum.getSumInsuredFireFlat() + " EUR " + ", " + "Water: " + insuredSum.getSumInsuredWaterFlat() + " EUR " +
                ", " + " Sum: " + sumWaterFireFlat + " EUR ");
        System.out.println("Your return premium for flat by WATER is: " + coefficietWater + " EUR ");
        System.out.println("Your return premium for flat by FIRE is: " + coefficientFire + " EUR ");
        System.out.println("Your return premium for flat sum is: " + coefsum + " EUR ");

        System.out.println("------------------------------");
        menu();
    }



}
