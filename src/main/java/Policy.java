public class Policy {
    private String policyNumber = "e.g. LV19-07-100000-1";
    private String polisyStatus = "Registered, Approved";
    private PolicyObject policyObjects = new PolicyObject();
    private Risks risks = new Risks();
    private InsuredSum insuredSum = new InsuredSum();

    void run() {
        System.out.println(5);
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

    public PolicyObject getPolicyObjects() {
        return policyObjects;
    }

    public void setPolicyObjects(PolicyObject policyObjects) {
        this.policyObjects = policyObjects;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolisyStatus() {
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
                '}';
    }
}
