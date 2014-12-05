package customers;

import java.util.HashMap;

import accounts.Account;
import enums.CustomerType;

public class RegularCustomer extends Customer
{

	public RegularCustomer(String _id, String _firstName, String _lastName,
			String _adress, String _phone,
			HashMap<String, Account> _myAccounts, CustomerType _customerType) 
	{
		super(_id, _firstName, _lastName, _adress, _phone, _myAccounts, _customerType);
	}

	@Override
	public void printMe() 
	{
		
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
