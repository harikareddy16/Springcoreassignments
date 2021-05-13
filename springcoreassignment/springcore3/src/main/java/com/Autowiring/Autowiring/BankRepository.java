package com.Autowiring.Autowiring;

public interface BankRepository {

	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
	
	
}
