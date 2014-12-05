package customers;

import interfaces.Printable;

import java.io.Serializable;
import java.util.HashMap;

import accounts.Account;
import enums.CustomerType;

public abstract class Customer implements Printable, Comparable, Serializable
{
	private String _id;
	private String _firstName;
	private String _lastName;
	private String _adress;
	private String _phone;
	private HashMap<String, Account> _myAccounts;
	private CustomerType _customerType;
	
	public Customer(String _id, String _firstName, String _lastName,
			String _adress, String _phone,
			HashMap<String, Account> _myAccounts, CustomerType _customerType) 
	{
		super();
		this._id = _id;
		this._firstName = _firstName;
		this._lastName = _lastName;
		this._adress = _adress;
		this._phone = _phone;
		this._myAccounts = _myAccounts;
		this._customerType = _customerType;
	}
	
	
	public String get_id() 
	{
		return _id;
	}

	public void set_id(String _id) 
	{
		this._id = _id;
	}

	public String get_firstName() 
	{
		return _firstName;
	}

	public void set_firstName(String _firstName) 
	{
		this._firstName = _firstName;
	}

	public String get_lastName() 
	{
		return _lastName;
	}

	public void set_lastName(String _lastName) 
	{
		this._lastName = _lastName;
	}

	public String get_adress() 
	{
		return _adress;
	}

	public void set_adress(String _adress) 
	{
		this._adress = _adress;
	}

	public String get_phone() 
	{
		return _phone;
	}

	public void set_phone(String _phone) 
	{
		this._phone = _phone;
	}

	public HashMap<String, Account> get_myAccounts() 
	{
		return _myAccounts;
	}

	public void set_myAccounts(HashMap<String, Account> _myAccounts) 
	{
		this._myAccounts = _myAccounts;
	}

	public CustomerType get_customerType() 
	{
		return _customerType;
	}

	public void set_customerType(CustomerType _customerType) 
	{
		this._customerType = _customerType;
	}
	
	public void printMe()
	{
		System.out.println("Customer name : " +get_firstName() + " " + get_lastName() + "\n"
				+ "ID number : " + get_id() + "\n"
				+ "Customer Type : " + get_customerType()
				+ "Adress : " + get_adress() + "\n"
				+ "Phone numbr : " + get_phone() + "\n");
	}
}
