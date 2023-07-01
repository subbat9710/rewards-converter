import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100.0;
        int expectedMilesValue = (int) (cashValue / RewardValue.CASH_TO_MILES_RATIO);

        RewardValue rewardValue = new RewardValue(cashValue);
        int actualMilesValue = rewardValue.getMilesValue();

        assertEquals(expectedMilesValue, actualMilesValue);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 1000;
        double expectedCashValue = milesValue * RewardValue.CASH_TO_MILES_RATIO;

        RewardValue rewardValue = new RewardValue(milesValue);
        double actualCashValue = rewardValue.getCashValue();

        assertEquals(expectedCashValue, actualCashValue);
    }
}
