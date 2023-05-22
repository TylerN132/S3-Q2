public class TestAccount {
    public static void main(String[] args) {
        Account Acc1= new Account(null, null, 5000);
        Account Acc2 = new Account(null, null, 4000);
    
    

    Acc2.getBalance();
    
    System.out.println("This is account balance of Account 1 $"+Acc1.getBalance());
    System.out.println("This is account balance of Account 2 $"+Acc2.getBalance());

    Acc1.transferTo(Acc2, 1000);
    System.out.println("This is account balance of Account 1 $"+Acc1.getBalance());
    System.out.println("This is account balance of Account 2 $"+Acc2.getBalance());
}
}
