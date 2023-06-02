class SavingsAccount{
    static int annualInterestRate;
    int savingsBalance;
    public SavingsAccount(int savingsBalance){
        this.savingsBalance=savingsBalance;
    }
    static void modifyInterestRate(int x){
        annualInterestRate=x;
    }
    public void calculateMonthlyInterest(){
        int interst=(savingsBalance * annualInterestRate)/12;
        System.out.println("Monthly_Interst ="+interst);
        savingsBalance=savingsBalance+interst;
        System.out.println("New_balance="+savingsBalance);
    }

}


public class Bank {
    public static void main(String[] args)
    {

        
        SavingsAccount saver1=new SavingsAccount(2000);
        SavingsAccount.modifyInterestRate(3);
        saver1.calculateMonthlyInterest();
        
        
        SavingsAccount saver2=new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(4);
        saver2.calculateMonthlyInterest();



    }
}
