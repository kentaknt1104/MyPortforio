package com.internousdev.manager.action;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.internousdev.manager.dao.ShiftInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

class JsonDTO {

	public String date;
	public String start;
	public String end;
}

public class NextMonthShiftConfirmAction extends ActionSupport{

	private String params;

	public String execute() {

		String result = ERROR;

//		JSON形式で送られたカレンダー情報を元の形式に戻す。
		params = "{"
				+ "\"date\": \"date0\", "
				+ "\"start\": \"start0\", "
				+ "\"end\": \"end0\""
				+ "}";

		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonDTO dto = mapper.readValue(params, JsonDTO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		ここでカレンダー情報をDBに登録させる
		ShiftInfoDAO shiftInfoDAO = new ShiftInfoDAO();

		int count = shiftInfoDAO.insertMyShift();

		if(count > 0) {
			result = SUCCESS;
		}

		return result;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}
}
