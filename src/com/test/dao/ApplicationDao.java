package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.test.bean.Bank;

public class ApplicationDao {
	Bank bank = null;
	List<Bank> banks = new ArrayList();

	public List<Bank> searchBankDetailsByIfscCode(String searchstring) throws SQLException {
		try {
			Connection conn = Dbconnection.getConnectionToDb();
			PreparedStatement statement = conn.prepareStatement("select * from bank_details where bank_ifsc = ?");
			statement.setString(1, searchstring);
			ResultSet rs = statement.executeQuery();

			// String sql="select
			// bank_id,bank_name,bank_branch,bank_address,bank_city,bank_district,bank_state
			// from bank_details where bank_ifsc=searchstring";
			// Statement statement=conn.createStatement();
			// ResultSet rs=statement.executeQuery(sql);
			while (rs.next()) {
				bank = new Bank();
				bank.setBank_Id(rs.getInt("bank_id"));
				bank.setBank_Name(rs.getString("bank_name"));
				bank.setBank_Branch(rs.getString("bank_branch"));
				bank.setBank_Address(rs.getString("bank_address"));
				bank.setBank_City(rs.getString("bank_city"));
				bank.setBank_District(rs.getString("bank_district"));
				bank.setBank_State(rs.getString("bank_state"));
				banks.add(bank);
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return banks;
	}

	public List<Bank> searchBankDetailsByNameAndCity(String name, String city)throws SQLException {
		Connection conn = Dbconnection.getConnectionToDb();
		try {
			PreparedStatement statement = conn
					.prepareStatement("select * from bank_details where bank_name = ? and bank_city= ? ");
			statement.setString(1, name);
			statement.setString(2, city);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				bank = new Bank();
				bank.setBank_Id(rs.getInt("bank_id"));
				bank.setBank_Name(rs.getString("bank_name"));
				bank.setBank_Ifsc(rs.getString("bank_ifsc"));
				bank.setBank_Branch(rs.getString("bank_branch"));
				bank.setBank_Address(rs.getString("bank_address"));
				bank.setBank_City(rs.getString("bank_city"));
				bank.setBank_District(rs.getString("bank_district"));
				bank.setBank_State(rs.getString("bank_state"));
				banks.add(bank);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return banks;
	}

}
