public class GasTank {
    private double amount = 0;
    public void addGas(double value) {
        amount += value;
    }
    public void useGas(double value) {
        amount -= value;
        if (amount < 0) {
            amount = 0;
        }
    }
    public boolean isEmpty() {
        return amount < 0.1;
    }
    public double getGasLevel() {
        return amount;
    }
}
