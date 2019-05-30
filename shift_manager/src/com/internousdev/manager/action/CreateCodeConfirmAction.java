package com.internousdev.manager.action;

import java.util.Map;
import java.util.Random;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.manager.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateCodeConfirmAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;

	private String userName;

	public String execute() {

//		パートコードの発酵を行う。
		String result = ERROR;
		UserInfoDAO userInfoDAO = new UserInfoDAO();

		int createCode = 0;
		int i = 0;

		do {
			Random r = new Random();
			createCode = r.nextInt(9000) + 1000;
			i = userInfoDAO.codeMaker(createCode);
			if (i == 1) {
				session.put("userName", userName);
				session.put("partCode", createCode);
				result = SUCCESS;
			}
		} while (i == 1);

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
