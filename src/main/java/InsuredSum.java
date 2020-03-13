public class InsuredSum {

    private Integer sumInsuredFireTV = 100;
    private Integer sumInsuredWaterTV = 8;
    private Integer sumInsuredWaterFlat = 100;
    private Integer sumInsuredFireFlat = 500;
    private double differentInsuredSum;

    public double getDifferentInsuredSum() {
        return differentInsuredSum;
    }

    public void setDifferentInsuredSum(double differentInsuredSum) {
        this.differentInsuredSum = differentInsuredSum;
    }

    Integer getSumInsuredFireTV() {
        return sumInsuredFireTV;
    }

    Integer getSumInsuredWaterTV() {
        return sumInsuredWaterTV;
    }

    public Integer getSumInsuredWaterFlat() {
        return sumInsuredWaterFlat;
    }

    public Integer getSumInsuredFireFlat() {
        return sumInsuredFireFlat;
    }

    @Override
    public String toString() {
        return "InsuredSum{" +
                "sumInsuredFireTV=" + sumInsuredFireTV +
                ", sumInsuredWaterTV=" + sumInsuredWaterTV +
                ", sumInsuredWaterFlat=" + sumInsuredWaterFlat +
                ", sumInsuredFireFlat=" + sumInsuredFireFlat +
                ", differentInsuredSum=" + differentInsuredSum +
                '}';
    }
}
