/**
 * Author: Kenniece Harris
 * Course: COP3503
 * Project#: 3
 * Title: Project3_N01503765
 * Due Date: 7/24/2022
 * 
 *  Generates work orders for employees based on customer tickets.
 */

package newPack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *  Creates arrays for employees, customers/tickets, and work orders, then writes them to a file called log.
 */
public class Project3 {

		public static String employeeFileName = "employee_data.csv";
		public static String ticketFileName = "ticket_data.csv";
		public static String workOrderfileName = "workorder_data.csv";
		
		public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
		public static ArrayList<WorkOrder> workOrderList = new ArrayList<WorkOrder>();
	    public static ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	    
		public static void main(String[] args) {
			
			System.out.println("Project Title: Work Order Generator");
			
			FileHandler file = new FileHandler();
			file.logger("Loading Employee Data");
			file.readEmployeeData(employeeFileName);
			
			
			
			file.logger("Loading Ticket Data");
			file.readTicketData(ticketFileName);
			
			
			
			
			file.logger("Create Work Orders");
			createWorkOrders();
			
			
			
			file.logger("Writing Work Order Data to File");
			file.writeData(workOrderfileName);
			
			
			
			
			
			file.logger("Work Orders Created. Program Exiting");
			
			
			
	}
	
		
 /**
  * Creates work orders through assigning each employee ten customers/tickets including current date.
  */
	public static void createWorkOrders()
	{
		    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
	        Date date = new Date();
	        
	        int count = 0;
				for(int i = 0; i < employeeList.size(); i++)
			    {
					
					
					for(int j = 0; j < 19; j++) // not entirely sure why this loop needs to go 19, was the only way to assign each employee 10 tickets.
					{
						
						if(count == 963)
						{
							break;
						}
						
						WorkOrder workOrder = new WorkOrder(employeeList.get(i), ticketList.get(count), sdf.format(date));
						workOrderList.add(workOrder);
						j++;
						count++;
					}
			    }
	
			
			
	}

}
