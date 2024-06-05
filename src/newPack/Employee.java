package newPack;


/**
 *  Stores and returns the first name, last name, address, phone number, email, Id, hire date, and clock in time of employees 
 *  Parent class of Customer and Employee classes. 
 */
public class Employee extends Person implements DataHandler{
  private String employeeId;
  private String clockedIn;
  private String hiredDate;
  /**
   *  Stores first name, last name, address, phone number, email, Id, hire date, and clock in time of employees to class variables.
   *  @param firstName first name of employee.
   *  @param lastName last name of employee.
   *  @param address address of employee.
   *  @param phoneNumber phone number of employee.
   *  @param email of employee.
   *  @param employeeId Id of employee.
   *  @param clockedIn clock in time of employee.
   *  @param hiredDate hire date of employee.
   */	 
  public Employee(String firstName, String lastName, String address, String phoneNumber, String email, String employeeId, String clockedIn, String hiredDate )
  {
	  super(firstName, lastName, address, phoneNumber, email);
	  this.employeeId = employeeId;
	  this.clockedIn = clockedIn;
	  this.hiredDate = hiredDate;
	  
	  
  }
  
  
  public void setEmployeeId(String employee)
  {
	  this.employeeId = employee;
  }
  
  
  public String getEmployeeId()
  {
	  return employeeId;
  }
  
  
  public void setClockedIn(String time)
  {
	  this.clockedIn = time;
  }
  
  
  public String getClockedIn()
  {
	  return clockedIn;
  }
  
  
  public void setHiredDate(String hire)
  {
	  this.hiredDate = hire;
  }
  
  
  public String getHiredDate()
  {
	  return hiredDate;
  }
  
  
  /**
   *  creates a string containing employee first name, last name, Id, and clock in time.
   *  @return employee information.
   */
  @Override
  public String getInfo()
  {
	 String employeeInfo;
	 
	 
	 employeeInfo = "Employee Info:";
	 employeeInfo += "Employee Name: " + getFirstName() + "," + getLastName();
	 employeeInfo +=  "\t" + "Employee ID: " + getEmployeeId();
	 employeeInfo += "\t" + "Time Clocked In: " + getClockedIn() + "\t";
	 
			 
	 
	 return employeeInfo;
	 
  }
  /**
   *  creates a string containing employee id, first name, last name, and clock in time.
   *  @return employee data.
   */
  @Override
  public String getFileData()
  {
	  String employeeData;
	  
	  employeeData = getEmployeeId()  +  ","+ getFirstName()+ ","+ getLastName() +  "," + getClockedIn() + ",";
	  
	  return employeeData;
  }
}
