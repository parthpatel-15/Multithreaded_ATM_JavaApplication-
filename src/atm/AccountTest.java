package atm;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.security.SecureRandom;

public class AccountTest {
    public static void main(String [] args){
        SecureRandom generator = new SecureRandom();
        //array of all action
        String[] actions={"deposit","withdraw","deposit","aaaa","withdraw","withdraw","deposit"};
        List<String> actionsList= new ArrayList<>();   // arraylist

        for (String action : actions)
            actionsList.add(action);          // add action at end of arraylist

        ExecutorService executorService = Executors.newCachedThreadPool();    // create ExecutorService to manage thread

        for (int i=0; i < actionsList.size(); i++){

            int amount = generator.nextInt(5000);                  //generate random amount from 0-5000
            Account action= new Account(amount, actionsList.get(i));

            executorService.execute(action);    // start the thread
        }



        executorService.shutdown();      // to shut down threads "ExecutorService"

        System.out.println("-----------------  all transaction are done  ------------------");


    }
}

