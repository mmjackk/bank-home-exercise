package accounts;

import java.util.HashMap;

import customers.Customer;
import enums.AccountType;

public class RegularAccount extends Account 
{

	public RegularAccount(String _accountName, String _accountNumber,
			HashMap<String, Customer> _myCustomers, AccountType _accountType,
			int _accountBalance, int _accountCredit, int _maxAllowedWithdrawal) 
	{
		super(_accountName, _accountNumber, _myCustomers, _accountType, _accountBalance, _accountCredit,
				_maxAllowedWithdrawal);
	}

	@Override
	public void printMe() {
		
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
