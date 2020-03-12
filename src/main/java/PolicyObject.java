public class PolicyObject {
    private String objectName = "A Flat";
    private PolicySubObjects policySubObjects = new PolicySubObjects();
    private String policySubObject = policySubObjects.getSubObjectName();

    public String getPolicySubObject() {
        return policySubObject;
    }

    public void setPolicySubObject(String policySubObject) {
        this.policySubObject = policySubObject;
    }

    public PolicySubObjects getPolicySubObjects() {
        return policySubObjects;
    }

    public void setPolicySubObjects(PolicySubObjects policySubObjects) {
        this.policySubObjects = policySubObjects;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return "PolicyObject{" +
                "objectName='" + objectName + '\'' +
                ", policySubObjects=" + policySubObjects +
                ", policySubObject='" + policySubObject + '\'' +
                '}';
    }
}
