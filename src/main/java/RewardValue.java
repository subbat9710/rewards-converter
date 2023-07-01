public class RewardValue {
    public static final double CASH_TO_MILES_RATIO = 0.0035;
    private double cashValue;
    private int milesValue;

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

    public int getMilesValue() {
        return milesValue;
    }

    private void calculateMilesValue() {
        milesValue = (int) (cashValue / CASH_TO_MILES_RATIO);
    }

    private void calculateCashValue() {
        cashValue = milesValue * CASH_TO_MILES_RATIO;
    }
}
