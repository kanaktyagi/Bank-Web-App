package com.test.seach;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.bean.Bank;
import com.test.dao.ApplicationDao;
import com.test.utility.JsonUtil;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

	private List<Bank> banks = new ArrayList<Bank>();

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		ApplicationDao dao = new ApplicationDao();

		System.out.println(req.getParameter("IFSC_CODE"));

		if (req.getParameter("IFSC_CODE") != null) {
			String searchstring = req.getParameter("IFSC_CODE");
			try {
				banks = dao.searchBankDetailsByIfscCode(searchstring);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			String name = req.getParameter("bank_name");
			String city = req.getParameter("bank_city");

			try {
				banks = dao.searchBankDetailsByNameAndCity(name, city);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		res.setContentType("application/json");
		PrintWriter out = res.getWriter();
		out.print(JsonUtil.getJsonData(res, banks));
		out.flush();
	}
}
