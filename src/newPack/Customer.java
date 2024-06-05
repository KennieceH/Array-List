package newPack;

/**
 *  Stores and returns the first name, last name, address, phone number, email, Id, and account number of customers.
 *  Prints customer information and data.
 *  Child class of Person.
 */
public class Customer extends Person implements DataHandler{

	private String customerId;
	private String accountNumber;
	/**
	 *  Stores first name, last name, address, phone number, email, Id, and account number of customers to class variables.
	 *  @param firstName first name of customer
	 *  @param lastName last name of customer
	 *  @param address address of customer
	 *  @param phoneNumber phone number of customer
	 *  @param email of customer
	 *  @param customerId the customer's Id
	 *  @param accountNumber the customers account number
	 */		
	public Customer(String firstName, String lastName, String address, String phoneNumber, String email, String customerId, String accountNumber)
	{
		super(firstName, lastName, address, phoneNumber, email);
		this.customerId = customerId;
		this.accountNumber = accountNumber;
	}
	

	public void setCustomerId(String customer)
	{
		this.customerId = customer;
	}
	

	public String getCustomerId()
	{
		return customerId;
	}
	
	
	public void setAccountNumber(String account)
	{
		this.accountNumber = account;
	}
	

	public String getAccountNumber()
	{
		return accountNumber;
	}
	
/**
 *  creates a string containing the customer's first name, last name., id, and account number. 
 *  @return customer information.
 */
	@Override
	public String getInfo()
	{
		String customerInfo;
		
		
		customerInfo = "Customer Info:";
		customerInfo += "\t" + "Customer Name: " + getFirstName() + "," + getLastName();
		customerInfo += "\t" + "Customer ID: " + getCustomerId();
		customerInfo += "\t" +"Account Number: " + getAccountNumber() + "\t" ;
		
		return customerInfo;
		
	}
	
/**
 *  creates a string containing customer's id, first name, and last name.
 *  @return customer data
 */
	@Override
	public String getFileData()
	{
		String customerData;
		
		customerData = getCustomerId() +  ","+ getFirstName() +  ","+ getLastName();
		return customerData;
	}
}
