public class SevenPercent implements SalesTaxBehavior {
    public double compute(Double value) {
        return value * 0.07; // Seven Percent returns 7% of the value
    }
}
