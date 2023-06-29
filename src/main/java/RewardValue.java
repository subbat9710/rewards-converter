public class RewardValue {
    private final double CASH_TO_MILES_RATIO = 0.0035;
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        calculateMilesValue();
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        calculateCashValue();
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private void calculateMilesValue() {
        milesValue = cashValue / CASH_TO_MILES_RATIO;
    }

    private void calculateCashValue() {
        cashValue = milesValue * CASH_TO_MILES_RATIO;
    }
}
