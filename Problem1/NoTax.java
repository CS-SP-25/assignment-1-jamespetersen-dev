public class NoTax implements SalesTaxBehavior{
    public double compute(Double value) {
        return 0.0; // Seven Percent returns 0% of the value, so 0.0
    }
}
