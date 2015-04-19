package com.tdc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class OracleSequenceDao {

	public String getNextKey(Long id) {
		String str=null;
		
		if (id == null) {
			try {
				str = String.valueOf(getNextSequenceNumber("INSTALLATION_SEQ"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			str = String.valueOf(id);
		}

		String kissKeyPrefix = "INST" + "-" + str;

		return StringUtils.rightPad(kissKeyPrefix, 19, '-');
	}

	
	public Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection(
						"jdbc:oracle:thin:@Miraculix:1826:DCTVCRM", "kasia",
						"kasia4kiss");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public long getNextSequenceNumber(String oracleSequenceName)
			throws Exception {

		Connection connect = null;
		Statement statement = null;
		ResultSet results = null;
		try {

			/*Class.forName("oracle.jdbc.OracleDriver");

			connect = DriverManager.getConnection(
					"jdbc:oracle:thin:@Miraculix:1826:DCTVCRM", "kasia",
					"kasia4kiss");*/
			connect = getConnection();
			statement = connect.createStatement();
			statement.executeQuery("select " + oracleSequenceName
					+ ".nextval from DUAL");
			results = statement.getResultSet();
			if ((results != null) && (results.next())) {
				return results.getLong(1);
			} else {
				throw new SQLException(" sequence failed to return a value");
			}
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (results != null) {
				results.close();
			}
			if (connect != null) {
				connect.close();
			}
		}

	}

}
