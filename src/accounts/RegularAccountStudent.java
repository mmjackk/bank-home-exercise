package accounts;

import java.util.HashMap;

import customers.Customer;
import enums.AccountType;

public class RegularAccountStudent extends RegularAccount 
{

	public RegularAccountStudent(String _number,
			HashMap<String, Customer> _myCustomers, AccountType _accountType,
			int _accountBalance, int _accountCredit, int _maxAllowedWithdrawal) 
	{
		super(_number, _myCustomers, _accountType, _accountBalance, _accountCredit,
				_maxAllowedWithdrawal);
	}

}
