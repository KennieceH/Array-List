package newPack;
/**
 *  returns the information and data of the customer, employee, ticket, and work order classes.
 *  
 */
interface DataHandler {
	/**
	 * Stores the information of the customer, employee, ticket, and work order classes.
	 * @return information.
	 */
	default String getInfo()
	{
		String str = "";
		return str;
	}
	/**
	 * returns the data of the customer, employee, ticket, and work order classes. 
	 * @param data.
	 */
	default String getFileData()
	{
		String str = "";
		return str;
	}

}
