package newPack;

/**
 *  Stores and returns the first name, last name, address, phone number, and email of employees and customers.
 *  Parent class of Customer and Employee classes. 
 */
public class Person {
	protected String firstName;
	protected String lastName;
	protected String address;
	protected String phoneNumber;
	protected String email;
	
/**
 *  Stores first name, last name, address, phone number, and email of employees and customers to class variables.
 *  @param firstName first name of customer/employee.
 *  @param lastName last name of customer/employee.
 *  @param address address of customer/employee.
 *  @param phoneNumber phone number of customer/employee.
 *  @param email email of customer/employee.
 */	
	public Person(String firstName,String lastName,String address, String phoneNumber, String email )
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public void setFirstName(String fName)
	{
		this.firstName = fName;
	}
	

	public String getFirstName()
	{
		return firstName;
	}
	

	public void setLastName(String lName)
	{
		this.lastName = lName;
	}
	

	public String getLastName()
	{
		return lastName;
	}


	public void setAddress(String addr)
	{
		this.address = addr;
	}
	

	public String getAddress()
	{
		return address;
	}
	

	public void setPhoneNumber(String phoneNum)
	{
		this.phoneNumber = phoneNum;
	}
	

	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	

	public void setEmail(String email)
	{
		this.email = email;
	}
	

	public String getEmail()
	{
		return email;
	}
}
