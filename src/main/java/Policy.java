public class Policy {
    private String policyNumber = "e.g. LV19-07-100000-1";
    private String polisyStatus = "Registered, Approved";
    private PolicyObject policyObjects = new PolicyObject();
    private Risks risks = new Risks();
    private InsuredSum insuredSum = new InsuredSum();
    private int sum = insuredSum.getSumInsuredFireTV() + insuredSum.getSumInsuredWaterTV() + insuredSum.getSumInsuredFireFlat() + insuredSum.getSumInsuredWaterFlat();
    private String policySum = String.valueOf(sum);

    String getPolicySum() {
        return policySum;
    }

    public void setPolicySum(String policySum) {
        this.policySum = policySum;
    }

    public Risks getRisks() {
        return risks;
    }

    public void setRisks(Risks risks) {
        this.risks = risks;
    }

    public InsuredSum getInsuredSum() {
        return insuredSum;
    }

    public void setInsuredSum(InsuredSum insuredSum) {
        this.insuredSum = insuredSum;
    }

    PolicyObject getPolicyObjects() {
        return policyObjects;
    }

    public void setPolicyObjects(PolicyObject policyObjects) {
        this.policyObjects = policyObjects;
    }

    String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    String getPolisyStatus() {
        return polisyStatus;
    }

    public void setPolisyStatus(String polisyStatus) {
        this.polisyStatus = polisyStatus;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", polisyStatus='" + polisyStatus + '\'' +
                ", policyObjects=" + policyObjects +
                ", risks=" + risks +
                ", insuredSum=" + insuredSum +
                ", sum=" + sum +
                ", policySum='" + policySum + '\'' +
                '}';
    }
}
