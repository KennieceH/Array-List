package newPack;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Loads data from employee and ticket file into their respective array lists and writes the data to the 
 * log and work order data file.
 */
public class FileHandler {
	
	private Scanner scnr = new Scanner(System.in);

	
/**
 * writes data contained in the work order array list to the log and work order data file. 
 * @param workOrderFileNam name of the worker file.
 */	
	public void writeData(String workOrderfileName)
	{
		
		FileWriter file;
		try {
			file = new FileWriter(workOrderfileName);
			PrintWriter output = new PrintWriter(file);
			int count = 0;
			for(int i = 0; i < Project3.workOrderList.size() + 1; i++)
			{
				if(i == 0)
				{
					output.println("employee_id,employee_first_name,employee_last_name,clocked_in,customer_id,customer_first_name,customer_last_name,ticket_id,ticket_createdAt,workorder_createdAt");
				}
				
				else
				{
					
					String person = Project3.workOrderList.get(count).getFileData();
					String person2 = Project3.workOrderList.get(count).getInfo();
				  output.println(person);
				  FileHandler log = new FileHandler();
				  log.logger(person2);
				  count++;
				}
				
			}
			output.close();
			
			
		  } catch (IOException e) {
			e.printStackTrace();
		  }
		
		
		
	}

/**
 *  Reads in data from the employee file and stores the data into the employee array list. 
 *  @param employeeFileName name of file containing employee data.
 */
	public void readEmployeeData(String employeeFileName)
	{
		
		FileReader newFile;
		try {
			newFile = new FileReader(employeeFileName);
			 scnr = new Scanner(newFile);
			
			int count = 0;
			while(scnr.hasNext())
			{
				  String word = scnr.nextLine();
				  if(count > 0)
				  {
					  
					  String[] newLine = word.split(",");
					  Employee employee = new Employee(newLine[1],newLine[2],newLine[3],newLine[4], newLine[5], newLine[0], newLine[6], newLine[7]);
					  Project3.employeeList.add(employee);
				  }

				count++;
			}
			
			scnr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
/**
 *  Reads in data from the ticket file and stores the data into the ticket array list. 
 *  @param ticketFileName name of file containing ticket data.
 */	
	public void readTicketData(String ticketFileName)
	{
		FileReader newFile;
		try {
			newFile = new FileReader(ticketFileName);
			Scanner scnr = new Scanner(newFile);
			
			int count = 0;
			while(scnr.hasNext())
			{
				  String word = scnr.nextLine();
				  if(count > 0)
				  {
					  
					  String[] newLine = word.split(",");
					  Customer customer = new Customer(newLine[1],newLine[2],newLine[3],newLine[4], newLine[5], newLine[0], newLine[6]);
					  Ticket ticket = new Ticket(customer, newLine[8], newLine[7]);
					  Project3.ticketList.add(ticket);
				  }

				count++;
			}
			
			scnr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
/**
 *  Writes work order data and comments(made in main) into the log file.
 *  @param log data that will be written to the log file.
 */	
	public void logger(String log)
	{
		
		
		try {
			FileWriter file = new FileWriter("log.txt", true);
			PrintWriter output = new PrintWriter(file);
			
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:");  
		    Date date = new Date();  
		    
			output.println(sdf.format(date) + " " + log);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
