package bankaccount;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create 2 bank accounts
		Account account1 = new Account(50.33);
		Account account2 = new Account(-7.53);
		
		System.out.printf( "Balance de la cuenta $%.1f\n", account1.getBalance() );
		
		String input2 = JOptionPane.showInputDialog("Ingrese Valor a consignar para cuenta 1: ");
		
		Scanner input = new Scanner(System.in);
		double depositAmount;
		System.out.println("Ingrese Valor a consignar para cuenta 1: ");
		depositAmount = input.nextDouble();
		account1.credit(depositAmount);
		System.out.println("el saldo actual en la cuenta 1");
		System.out.println(account1.getBalance());
		System.out.printf("Saldo %.2f\n ",account1.getBalance() );
		
		
		//System.out.println("Ingrese Valor a consignar para cuenta 2: ");
		//depositAmount = input.nextDouble();
		
		
		
		

	}

}
