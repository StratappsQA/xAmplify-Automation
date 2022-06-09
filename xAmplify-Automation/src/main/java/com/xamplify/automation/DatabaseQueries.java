package com.xamplify.automation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueries {

	public List<String> listNames(String query,String column) throws SQLException, InterruptedException
	{
		
		List<String> campaignNames = new ArrayList<String>();
		ResultSet resultSet = DatabaseConnection.getResultSet(query);
		while (resultSet.next()) {
			campaignNames.add(resultSet.getString(column).toLowerCase());
		}
		return campaignNames;
			
		}
}
