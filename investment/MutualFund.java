package investment;

public class MutualFund extends Investment {

    private double units;
    private double unitValue;

    public MutualFund(String name, String phoneNumber, String ssn, int age, double units, double unitValue) {
        this.name = name;
        this.units = units;
        this.unitValue = unitValue;
        this.ssn = ssn;
        this.type = "Mutual Fund";
    }

    public void calcValue() {
        double value = this.units * this.unitValue;
        this.value = value;
    }

}
