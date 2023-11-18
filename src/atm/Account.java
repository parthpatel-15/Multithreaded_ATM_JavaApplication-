package atm;
public class Account implements Runnable {
    private int amount;
    private String action;
    //constructor
    public Account(int a, String ac){
        amount = a;
        action = ac;
    }
    // run method that contains the code which thread execute
    @Override
    public void run() {

        if (action=="deposit"){                          // condition if user want to deposit money
            Transaction.deposit(amount);
            //System.out.println("----------------------------------------------------");
            //System.out.println("your action : " + action);
            //System.out.println("deposit amount : " +amount);

        }else if (action == "withdraw"){                 // condition if user want to withdraw money
            Transaction.withdraw(amount);
            //System.out.println("----------------------------------------------------");
            //System.out.println("your action : " + action);
            //System.out.println("withdraw amount : " +amount);

        }else {                                          // condition if user enter wrong action

            System.out.println("--------------------------------\n" +
                    "This action '"+ action + "' is not acceptable, please try again\n" +
                    "---------------------------------------------");
        }



    }

}

