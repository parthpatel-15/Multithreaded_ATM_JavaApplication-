package atm;
public class Transaction {

    protected static int balance= 50000;

    public static synchronized void deposit(int amount){         //deposit action
        balance=balance+amount;
        System.out.println("------------------------------");
        System.out.println("your action : deposit " );
        System.out.println("deposit amount : " +amount);
        System.out.println("balance after deposit action : " +balance);

    }

    public static synchronized void withdraw(int amount){            //withdraw action
        balance=balance-amount;
        System.out.println("------------------------------");
        System.out.println("your action : withdraw " );
        System.out.println("deposit amount : " +amount);
        System.out.println("balance after withdraw action : " +balance);

    }
}
