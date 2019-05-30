package com.internousdev.manager.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.manager.dao.UserInfoDAO;
import com.internousdev.manager.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ThisMonthShiftAction extends ActionSupport implements SessionAware{

	private String userName;
	private String partCode;
	private String errorMessage;

	private Map<String, Object> session;
	private List<UserInfoDTO> shiftInfoDTOList;

	public String execute() {

		//sessionタイムアウトの確認
		if (session.isEmpty()) {
			return "sessionTimeOut";
		}

		String result = ERROR;
		UserInfoDAO userInfoDAO = new UserInfoDAO();

		shiftInfoDTOList = userInfoDAO.getDecidedShift(session.get("partCode").toString());

		if (shiftInfoDTOList.size() > 0) {
			result = SUCCESS;

			return result;
		} else {
			errorMessage = "来月のシフトがまだ決まっていません。";
		}

		return result;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPartCode() {
		return partCode;
	}

	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<UserInfoDTO> getShiftInfoDTOList() {
		return shiftInfoDTOList;
	}

	public void setShiftInfoDTOList(List<UserInfoDTO> shiftInfoDTOList) {
		this.shiftInfoDTOList = shiftInfoDTOList;
	}
}
