package newPack;
/**
 *  Stores and returns the first name, last name, address, phone number, and email of customers to create tickets.
 *  Parent class of Customer and Employee classes. 
 */
public class Ticket implements DataHandler{

	private Customer customer;
	private String createdAt;
	private String ticketId;
	/**
	 *  Stores customer information and data as well as ticket Id and the time it was created at to class variables .
	 *  @param customer customer information and data.
	 *  @param createdAt the time the ticket was created.
	 *  @param ticketId the ticket Id.
	 */		
	public Ticket(Customer customer, String createdAt, String ticketId)
	{
		this.customer = customer;
		this.createdAt = createdAt;
		this.ticketId = ticketId;
	}
	

	public void setCreatedAt(String time)
	{
		  this.createdAt = time;
	}
	
	public String getCreatedAt ()
	{
		  return createdAt;
	}
	
	public void setTicketId(String ticket)
	{
		  this.ticketId = ticket;
	}
	
	public String getTicketId()
	{
		  return ticketId;
	}
	
	/**
	 *  creates a string that contains customer information, the time the ticket was created at, and the ticket Id.
	 *  @returns the ticket information.
	 */
	@Override
	public String getInfo()
	{
		String ticketInfo;
		ticketInfo = customer.getInfo();
		ticketInfo += "      Created At: " + getCreatedAt();
		ticketInfo += "      Ticket Id: " +  getTicketId();
		return ticketInfo;
	}
	/**
	 *  creates a string that contains the customer data, the ticket Id, and the time the ticket was created at. 
	 *  @return ticket data.
	 */
	@Override
	public String getFileData()
	{
		String ticketData;
		
		ticketData = customer.getFileData() + "," + getTicketId() + "," + getCreatedAt();
		
		return ticketData;
	}
}
