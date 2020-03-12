import java.util.List;

class PolicySubObjects {
    private InsuredSum insuredSum = new InsuredSum();
    private Risks risks = new Risks();
    private String subObjectName = "TV";
    private Integer insuredSumTV = insuredSum.getSumInsuredFireTV() + insuredSum.getSumInsuredWaterTV();
    private List<String> riskType = risks.getRisks();

    public List<String> getRiskType() {
        return riskType;
    }

    public void setRiskType(List<String> riskType) {
        this.riskType = riskType;
    }

    public InsuredSum getInsuredSum() {
        return insuredSum;
    }

    String getSubObjectName() {
        return subObjectName;
    }

    public Integer getInsuredSumTV() {
        return insuredSumTV;
    }

    public void setInsuredSumTV(Integer insuredSumTV) {
        this.insuredSumTV = insuredSumTV;
    }

    @Override
    public String toString() {
        return "PolicySubObjects{" +
                "insuredSum=" + insuredSum +
                ", risks=" + risks +
                ", subObjectName='" + subObjectName + '\'' +
                ", insuredSumTV=" + insuredSumTV +
                ", riskType=" + riskType +
                '}';
    }
}
