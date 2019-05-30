package com.internousdev.manager.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.manager.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateCodeCompleteAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;

	public String execute() {

//		sessionTimeOutの確認
		if (session.isEmpty()) {
			return "sessionTimeout";
		}

		String result = ERROR;
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		int count = userInfoDAO.regist(session.get("userName").toString(), session.get("partCode").toString());

		if (count > 0) {
			result = SUCCESS;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
