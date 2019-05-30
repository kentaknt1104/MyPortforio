package com.internousdev.manager.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.manager.dao.ShiftInfoDAO;
import com.internousdev.manager.dto.ShiftInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DecideShiftAction extends ActionSupport implements SessionAware{

	private int decided;
	private int count;
	private Map<String, Object> session;

	public String execute() {

		String result = ERROR;
		ShiftInfoDAO shiftInfoDAO = new ShiftInfoDAO();
		count = shiftInfoDAO.decideAllShift();

		if (count > 0) {
			result = SUCCESS;

			ShiftInfoDTO shiftInfoDTO = new ShiftInfoDTO();
			shiftInfoDTO.setDecided(1);

			return result;
		}

		return result;
	}

	public int getDecided() {
		return decided;
	}

	public void setDecided(int decided) {
		this.decided = decided;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
