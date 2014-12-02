package customers;

import java.util.HashMap;

import accounts.Account;


public abstract class Customer 
{
	private String _id;
	private String _firstName;
	private String _lastName;
	private String _adress;
	private String _phone;
	private HashMap<String, Account> _myAccounts;
	
}
