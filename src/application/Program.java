package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		/* After define the Account with abstract, a Account of
		 * class Account get error in instance 
		 * 
		Account acc1 = new Account(1001, "Alex", 1000.0);
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		 */
	
		/*Totalizar o saldo de todas as contas
		 * Depositar 10.00 em todas as contas  */
		/*Criamos uma lista do Tipo Account e a chamamos de lista!! 
		 *Como o tipo array é mais fácil de trabalhar, utilizamos este tipo.*/
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		/*Usando a bucete desbeiçada do Upcasting podemos inserir dados tanto 
		 * na conta empresarial quanto na poupança*/
		
		list.add(new SavingsAccount(1001, "Dunha", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.00, 500.0));
		
		/*Vamos somar o valor de todas as contas*/
		double sum = 0.0;
		for (Account acc : list){
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n",sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
			
		}
		for (Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(),acc.getBalance());
		}
		System.out.printf("Total balance: %.2f%n",sum);

		
	}
	

}
  