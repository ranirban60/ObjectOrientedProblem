/*Account related problem
 */

package com.bridgelabz;
import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        System.out.println("Welcome to account debit program");

        float accountBalance = 500000;
        System.out.println("Enter the amount you want to debit from your account:");
        Scanner scanner = new Scanner(System.in);
        float debitAmount = scanner.nextFloat();
        AccountTest accountTest = new AccountTest();
        accountTest.test(accountBalance, debitAmount);
    }
}
