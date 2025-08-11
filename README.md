# Elevate-lab-tasks5
Creating Basic Bank Operations
 **Check Balance** – View the current balance in your account.
- **Deposit Money** – Add funds to your account.
- **Withdraw Money** – Withdraw funds if sufficient balance exists.
- **Transaction History** – View all past transactions with date & time.
- **Exit Option** – Safely close the application.

## Technologies Used::
- **Java** (JDK 8+)
- **LocalDateTime** for date & time
- **ArrayList** for storing transaction history
- **Scanner** for user input

## Project Structure
Account/
│
├── Account.java # Main Java class containing logic
├── README.md # Project documentation


## ▶️ How to Run
1. **Clone or Download** this project.
2. Open a terminal in the project directory.
3. Compile the Java file: javac Account.java
   Run the program:java Account

##Sample flow
 Operation performed on Bank Account
1. Check the account balance
2. Withdraw the money from account
3. Deposit the money to the account
4. Transaction history of the Bank account
5. Exit
Enter choice: 3
Enter the Deposit amount:
5000
The amount after the Deposit: 5000.0

Enter choice: 2
Enter the Withdraw amount:
2000
The amount after the withdraw: 3000.0

Enter choice: 4
Transaction History:
11-08-2025 19:45:10 Deposited Amount: 5000.0 Balance: 5000.0
11-08-2025 19:46:15 Withdraw Amount: 2000.0 Balance: 3000.0
