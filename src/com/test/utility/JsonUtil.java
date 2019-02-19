package com.test.utility;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.test.bean.Bank;

public class JsonUtil {

	public static String getJsonData(HttpServletResponse res, List<Bank> banks) {

		Gson gson = new Gson();
		if (banks.size() < 1) {
			String json = gson.toJson("No Banks found For the query", new TypeToken<String>() {
			}.getType());
			return json;
		} else {
			String json = gson.toJson(banks, new TypeToken<List<Bank>>() {
			}.getType());
			return json;
		}

	}

}
