package abstract_class;

public abstract class Athlete {
    private double ccl;

    public double getCCL() {
        return this.ccl;
    }

    public void setCCL(double val) {
        this.ccl = val;
    }

    public abstract void calcConditioningLevel();
}
