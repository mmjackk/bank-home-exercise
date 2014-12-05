package accounts;

import interfaces.Printable;

import java.io.Serializable;
import java.util.HashMap;

import customers.Customer;
import enums.AccountType;

public abstract class Account implements Printable, Comparable, Serializable
{
	private String _accountName;
	private String _accountNumber;
	private HashMap<String , Customer> _myCustomers;
	private AccountType _accountType;
	private int _accountBalance;
	private int _accountCredit;
	private int _maxAllowedWithdrawal;
	private static int _bonus;
	
	
	public Account(String accountName, String _number, HashMap<String, Customer> _myCustomers,
			AccountType _accountType, int _accountBalance, int _accountCredit,
			int _maxAllowedWithdrawal) 
	{
		super();
		this._accountName = accountName; 
		this._accountNumber = _number;
		this._myCustomers = _myCustomers;
		this._accountType = _accountType;
		this._accountBalance = _accountBalance;
		this._accountCredit = _accountCredit;
		this._maxAllowedWithdrawal = _maxAllowedWithdrawal;
	}
	

	public String get_accountName() 
	{
		return _accountName;
	}


	public void set_accountName(String _accountName) 
	{
		this._accountName = _accountName;
	}


	public String get_accountNumber() 
	{
		return _accountNumber;
	}


	public void set_accountNumber(String _number) 
	{
		this._accountNumber = _number;
	}


	public HashMap<String, Customer> get_myCustomers() 
	{
		return _myCustomers;
	}


	public void set_myCustomers(HashMap<String, Customer> _myCustomers) 
	{
		this._myCustomers = _myCustomers;
	}


	public AccountType get_accountType() 
	{
		return _accountType;
	}


	public void set_accountType(AccountType _accountType) 
	{
		this._accountType = _accountType;
	}


	public int get_accountBalance() 
	{
		return _accountBalance;
	}


	public void set_accountBalance(int _accountBalance) 
	{
		this._accountBalance = _accountBalance;
	}


	public int get_accountCredit() 
	{
		return _accountCredit;
	}


	public void set_accountCredit(int _accountCredit) 
	{
		this._accountCredit = _accountCredit;
	}


	public int get_maxAllowedWithdrawal() 
	{
		return _maxAllowedWithdrawal;
	}


	public void set_maxAllowedWithdrawal(int _maxAllowedWithdrawal) 
	{
		this._maxAllowedWithdrawal = _maxAllowedWithdrawal;
	}


	public static int getBonus() 
	{
		return _bonus;
	}

	
	public void printMe()
	{
		System.out.println("Account name : " +get_accountName() + "\n"
				+ "Account number : " + get_accountNumber() + "\n"
				+ "Account Type : " + get_accountType()
				+ "Account balance : " + get_accountBalance() + "\n"
				+ "Account credit : " + get_accountCredit() + "\n"
				+ "Maximum allowed withdrawal : " + get_maxAllowedWithdrawal() + "\n");
	}
	
}
