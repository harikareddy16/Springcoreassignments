package com.Autowiring.Autowiring;


public abstract class BankRepositoryImpl implements BankRepository {
	
	private void BankAccountRepositoryImpl(){
	  BankAccount bankaccount = new BankAccount();
	  bankaccount.setAccountHolderName("Harika");
	  bankaccount.setAccountId(89);
	  bankaccount.setAccountType("Savings");
	  bankaccount.setAccountBalance((long) 789.61);


	}
}
