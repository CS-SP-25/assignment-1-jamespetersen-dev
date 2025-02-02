public class FourPointFivePercent implements SalesTaxBehavior {
    public double compute(Double value) {
        return value * 0.045; // FourPointFive Percent returns 4.5% of the value
    }
}
