public class InsuredSum {

    private Integer sumInsuredFireTV= 100;
    private Integer sumInsuredWaterTV = 8;
    private Integer sumInsuredWaterFlat = 100;
    private Integer sumInsuredFireFlat = 500;


    public Integer getSumInsuredFireTV() {
        return sumInsuredFireTV;
    }

    public Integer getSumInsuredWaterTV() {
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
                '}';
    }
}
