public class CheckingAccount extends BankAccount{
private boolean overdraft;
public CheckingAccount(String s, boolean b){
super(s);
overdraft = b;
}
public boolean hasOverdraft(){
return overdraft;
}
public boolean clearCheck(double d){
if(d < getBalance() || overdraft) {
withdraw(d);
return true;
}
else return false;
}
}
