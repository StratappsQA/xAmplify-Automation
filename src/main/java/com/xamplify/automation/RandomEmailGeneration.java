package com.xamplify.automation;

import java.io.File;
import org.apache.commons.lang3.RandomStringUtils;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

//Java class to generate random mails and storing data in csv file
public class RandomEmailGeneration {

	private static final String DELIMITER =","; 
	private static final String LINE_SEPARATOR ="\n";

	public static void main(String[] args) {

		//headers to display in CSV file
		List<String> headers = new ArrayList<>(); 
		headers.add("Email Id");
		headers.add("First Name");
		headers.add("Last Name");

		//generating random email ids , first name and last names
		String generatemail=RandomStringUtils.randomAlphabetic(6);
		String emailid=generatemail+"@gmail.com";	 
		String generatemail2=RandomStringUtils.randomAlphabetic(6);
		String emailid2=generatemail2+"@gmail.com";   
		System.out.println("email id1 is:" +emailid);
		System.out.println("email id2 is:" +emailid);
		
		String generatefname1=RandomStringUtils.randomAlphabetic(3);
		String fname1=generatefname1+"_autoFN";
		String generatefname2=RandomStringUtils.randomAlphabetic(3);
		String fname2=generatefname2+"__autoFN";
		System.out.println("firstname1 is:" +fname1);
		System.out.println("firstname2 is:" +fname2);
		
		String generatelname1=RandomStringUtils.randomAlphabetic(3);
		String lname1=generatelname1+"_autoLN";
		String generatelname2=RandomStringUtils.randomAlphabetic(3);
		String lname2=generatelname2+"_autoLN";
		System.out.println("lastname1 is:" +lname1);
		System.out.println("lastname2 is:" +lname2);

		//storing emailid,fname and lname in csv file (product model is separate class which stores the headers)
		List<ProductModel> products = new ArrayList<>();
		ProductModel row1 = new ProductModel(emailid,fname1,lname1);  //for first row 
		products.add(row1);	
		ProductModel row2 = new ProductModel(emailid2,fname2,lname2); //for second row 
		products.add(row2);

		File file = new File("D:\\git\\Teammember_CSV.csv");  //In which location csv file need to be saved
		try (PrintWriter writer = new PrintWriter(file))
		{
			//write header
			writer.write(writeHeader(headers));
			//write body
			writer.write(writeBody(products));
			//get path of file
			System.out.println("path of the csv file is:"+file.getAbsolutePath());
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

	//to display headers in separate columns
	private static String writeHeader(List<String> headers) {
		StringBuilder result = new StringBuilder();
		headers.stream().forEach(item->result.append(item).append(DELIMITER));
		result.append(LINE_SEPARATOR);
		return result.toString();
	}

	//to display data in the csv in separate columns
	private static String writeBody(List<ProductModel> email) {
		StringBuilder result = new StringBuilder();
		email.stream().forEach(item->result.append(item.getEmail()).append(DELIMITER).append(item.getFirstname()).append(DELIMITER).append(item.getLastname()).append(DELIMITER).append(LINE_SEPARATOR));
		return result.toString();
	} 


}









