# Multithreaded_ATM_JavaApplication-
This Java application simulates a multithreaded ATM (Automated Teller Machine) system where transactions (deposits or withdrawals) are performed concurrently using threads.
This project demonstrates the basics of multithreading and synchronization in a simple ATM scenario.
# Project Structure:
<img width="459" alt="Screenshot 2023-11-18 at 12 20 07 PM" src="https://github.com/parthpatel-15/Multithreaded_ATM_JavaApplication-/assets/79576096/1d6ed328-5217-4095-8c44-a28991c86795">

Here's a summary of the key components:
# Account.java:
Implements the Runnable interface, representing an account action performed by a thread.
Defines a constructor that takes the amount and action (deposit or withdraw) as parameters.
The run method executes the specified action using the Transaction class.
# Transaction.java:
Manages the account balance and provides synchronized methods for deposit and withdrawal actions.
Uses synchronized methods to ensure thread safety when updating the account balance.
# AccountTest.java:
Contains the main method to execute the multithreaded ATM transactions.
Utilizes an ExecutorService to manage and execute threads concurrently.
Generates a list of random actions (deposit or withdraw) and corresponding random amounts.
Creates Account objects for each action and submits them to the ExecutorService.
# Usage:

Launches the application to simulate ATM transactions concurrently.
Threads perform random deposit or withdraw actions with random amounts.
Outputs the results, including the account balance after each transaction.
# Multithreading:

The application leverages multithreading to simulate multiple users performing ATM transactions simultaneously.
The ExecutorService efficiently manages thread execution.

# OutPut:
<img width="1318" alt="Screenshot 2023-11-18 at 12 19 43 PM" src="https://github.com/parthpatel-15/Multithreaded_ATM_JavaApplication-/assets/79576096/81a8d6eb-7f49-4562-b72a-cce4900ded19">



