package com.bank.amd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Random;

public class bank {
	String fname, lname;
	double balance;
	int accNo;
	BufferedReader br;
	
	bank(){
		br = new BufferedReader(new InputStreamReader(System.in));
		balance = 0.0;
		accNo = 707001;
	}
	
	public int openAcc() throws IOException {
		
		Random ran = new Random();
		
		System.out.print("\n\t Please enter your first name: ");
		fname = br.readLine();
		
		System.out.print("\n\t Please enter your last name: ");
		lname = br.readLine();
		
		System.out.print("\n\t Please enter your opening balance: ");
		balance = Double.parseDouble(br.readLine());
		
		accNo = ran.nextInt(900);
		
		System.out.println("acc No"+accNo);
		
		
		
		//new acc number??
		
		
		return accNo;
	}
	
	public void checkBalance() throws IOException{
		
		int accNo1;
		double bal = 1000.0; //change this
		
		
		System.out.print("\n\t Please enter your account number: ");
		accNo1 = Integer.parseInt(br.readLine());
		
		// bal = select bal from bank where accNo = $accNo1;
		System.out.println("\n\t Your balance is: "+bal);
		
		}
	
	public void withdraw() throws IOException {
		
		int accNo1;
		double bal,ubal;
		int amt;
		
		bal = 1000.0;
		
		System.out.print("\n\t Please enter your account number: ");
		accNo1 = Integer.parseInt(br.readLine());
		
		//bal = select bal from bank where accNo = $accNo;
		
		System.out.print("\n\t Please enter the amount to withdraw: ");
		amt = Integer.parseInt(br.readLine());
		
		ubal = bal - amt;
		
		
		//update bank set balance = $ubal where accNo = $accNo1
		System.out.println("\n\t Amount withdrawn: "+amt);
		System.out.println("\n\t Your balance: "+ubal);
		
	}
	
	public void deposit() throws IOException {
		
		int accNo1;
		double bal,ubal;
		int amt;
		
		bal = 1000.0;
		System.out.print("\n\t Please enter your account number: ");
		accNo1 = Integer.parseInt(br.readLine());
		
		//bal = select bal from bank where accNo = $accNo;
		
		System.out.print("\n\t Please enter the amount to deposit: ");
		amt = Integer.parseInt(br.readLine());
		
		ubal = bal + amt;
		
		
		//update bank set balance = $ubal where accNo = $accNo1
		
		System.out.println("\n\t Amount deposited: "+amt);
		System.out.println("\n\t Your balance: "+ubal);
		
	}
		
	
	public static void main(String[] args) throws IOException{
		
		int ch;
		bank obj = new bank();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n\t MENU");
			System.out.println("\n\t 1. Open new account");
			System.out.println("\n\t 2. Check balance");
			System.out.println("\n\t 3. Withdraw money");
			System.out.println("\n\t 4. Deposit money");
			System.out.println("\n\t 5. Exit");
			
			System.out.print("\n\t Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch) {
				case 1:
					//open account
					int accNo;
					accNo = obj.openAcc();
					System.out.println("\n\t Your account number is: "+accNo);
					System.out.println("\n\t Account opened successfully");
					break;
				case 2:
					//check balance
					obj.checkBalance();
					break;
				case 3:
					//withdraw
					obj.withdraw();
					break;
				case 4:
					//deposit
					obj.deposit();
					break;
				case 5:
					System.out.println("\n\t Thank you. Have a nice day!");
					break;
				default:
					System.out.println("\n\t Invalid choice.");
					break;
			}
			
		} while(ch!=5);
		sc.close();
		
	}

}
