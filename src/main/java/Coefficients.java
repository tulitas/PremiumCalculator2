public class Coefficients {
    private double coefficientFireLess100 = 0.013;
    private double coefficientFireOver100 = 0.023;
    private double coefficientWaterDeafault = 0.1;
    private double coefficientWaterEqualGreater10 = 0.05;
    private double coefficientDifferent;

    public double getCoefficientFireLess100() {
        return coefficientFireLess100;
    }

    public void setCoefficientFireLess100(double coefficientFireLess100) {
        this.coefficientFireLess100 = coefficientFireLess100;
    }

    public double getCoefficientFireOver100() {
        return coefficientFireOver100;
    }

    public void setCoefficientFireOver100(double coefficientFireOver100) {
        this.coefficientFireOver100 = coefficientFireOver100;
    }

    public double getCoefficientWaterDeafault() {
        return coefficientWaterDeafault;
    }

    public void setCoefficientWaterDeafault(double coefficientWaterDeafault) {
        this.coefficientWaterDeafault = coefficientWaterDeafault;
    }

    public double getCoefficientWaterEqualGreater10() {
        return coefficientWaterEqualGreater10;
    }

    public void setCoefficientWaterEqualGreater10(double coefficientWaterEqualGreater10) {
        this.coefficientWaterEqualGreater10 = coefficientWaterEqualGreater10;
    }

    public double getCoefficientDifferent() {
        return coefficientDifferent;
    }

    public void setCoefficientDifferent(double coefficientDifferent) {
        this.coefficientDifferent = coefficientDifferent;
    }

    @Override
    public String toString() {
        return "Coefficients{" +
                "coefficientFireLess100=" + coefficientFireLess100 +
                ", coefficientFireOver100=" + coefficientFireOver100 +
                ", coefficientWaterDeafault=" + coefficientWaterDeafault +
                ", coefficientWaterEqualGreater10=" + coefficientWaterEqualGreater10 +
                ", coefficientDifferent=" + coefficientDifferent +
                '}';
    }
}
