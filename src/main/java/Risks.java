import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Risks {
    private List<String> risks = Arrays.asList("FIRE", "WATER");

    List<String> getRisks() {
        return risks;
    }

    public void setRisks(List<String> risks) {
        this.risks = risks;
    }

    @Override
    public String toString() {
        return "Risks{" +
                "risks=" + risks +
                '}';
    }
}
