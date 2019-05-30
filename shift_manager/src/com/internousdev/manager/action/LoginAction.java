package com.internousdev.manager.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.manager.dao.UserInfoDAO;
import com.internousdev.manager.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;
	private UserInfoDTO loginInfoDTO;

	private String userName;
	private int partCode;
	private int adminFlg;
	private String errorMessage;

	public String execute() {

//		入力情報がテーブルにあるか確認
		String result = ERROR;
		UserInfoDAO loginInfoDAO = new UserInfoDAO();
		loginInfoDTO = loginInfoDAO.getPartInfo(userName, partCode);

		if (loginInfoDTO.getAdminFlg() > 0) {
//		管理者からのログインかチェック
			result = "admin";
			adminFlg = loginInfoDTO.getAdminFlg();
			return result;
		} else if (loginInfoDTO.getLoginFlg() == false) {
//		login失敗の場合
			errorMessage = "在籍確認が取れません。氏名かパートコードを再度確認してください。";
		} else {
//		login成功の場合
			result = SUCCESS;
			session.put("userName", userName);
			session.put("partCode", partCode);
			return result;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public UserInfoDTO getLoginDTO() {
		return loginInfoDTO;
	}

	public void setLoginDTO(UserInfoDTO loginDTO) {
		this.loginInfoDTO = loginDTO;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPartCode() {
		return partCode;
	}

	public void setPartCode(int partCode) {
		this.partCode = partCode;
	}

	public int getAdminFlg() {
		return adminFlg;
	}

	public void setAdminFlg(int adminFlg) {
		this.adminFlg = adminFlg;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
