public class ActivteState implements AccountState{
    @Override
    public void deposit(Account account, double amount){
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit: " + amount);
        System.out.println(account);
    }

    @Override
    public void withdraw(Account account, double amount){
        account.setBalance(account.getBalance() + amount);
        System.out.println("Withdrawn: " + amount);
        System.out.println(account);
    }

    @Override
    public void suspend(Account account){
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }
    @Override
    public void activate (Account account){
        System.out.println("Account is already activated!");
    }

    @Override
    public void close (Account account){
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    } 
}