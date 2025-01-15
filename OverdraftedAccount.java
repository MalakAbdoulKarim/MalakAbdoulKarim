public class OverdraftedAccount extends BankAccount {
	private int overdraftLimit, overdraftAmount;
	public int getAvailable() {
        return (super.getAvailable() + overdraftLimit - overdraftAmount);
    }
}
