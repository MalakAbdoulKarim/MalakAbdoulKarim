public class GasTank {
    private double amount = 0;
    public void addGas(double value) {
        amount += value;
    }
        public void useGas(double value) {
        amount -= value;
    }
        public double getGasLevel() {
        return amount;
    }
}
