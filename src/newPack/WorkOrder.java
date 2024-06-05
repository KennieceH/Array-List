package newPack;
/**
 *  Stores and returns the employee information and data, ticket information and data, and the time the work order was created
 *  
 */
public class WorkOrder implements DataHandler {
	private Employee employee;
	private Ticket ticket;
	private String createdAt;
	/**
	 *  Stores employee information and data, ticket information and data, and the time the work order was created to class variables.
	 *  @param employee employee information and data.
	 *  @param ticket ticket information and data.
	 *  @param createdAt the time the work order was created
	 */	
	public WorkOrder(Employee employee, Ticket ticket, String createdAt )
	{
		this.employee = employee;
		this.ticket = ticket;
		this.createdAt = createdAt;
	}
	

	public void setCreatedAt(String time)
	{
		  this.createdAt = time;
	}

	public String getCreatedAt()
	{
		  return createdAt;
		  
	}
	
/**
 *  creates a string containing employee/ticket information and data along with the time the work order was created.
 *  @return work order information
 */
	@Override
	public String getInfo()
	{
		String workOrderInfo;
		
		workOrderInfo = employee.getInfo() + ticket.getInfo();
		workOrderInfo +=  "\t" + "Work Order Info: ";
		workOrderInfo += "\t" + "Created At:" + getCreatedAt();		
		return workOrderInfo;
		
	}
	
/**
 * creates a string containing employee/ticket information and data along with the time the work order was created.
 *  @return work order data.
 */
	@Override
	public String getFileData()
	{
		String workOrderData;
		
		workOrderData = employee.getFileData() + ticket.getFileData() + "," + getCreatedAt();
		
		
		return workOrderData;
	}

}
