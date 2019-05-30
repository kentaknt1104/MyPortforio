package com.internousdev.manager.action;

import java.util.List;

import com.internousdev.manager.dao.ShiftInfoDAO;
import com.internousdev.manager.dto.ShiftInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ShiftCheckAction extends ActionSupport{

	private List<ShiftInfoDTO> shiftInfoDTOList;

	public String execute() {

		String result = SUCCESS;
		ShiftInfoDAO shiftInfoDAO = new ShiftInfoDAO();
		shiftInfoDTOList = shiftInfoDAO.getAllShiftInfo();

		if (shiftInfoDTOList.size() > 0) {
//			ここでエラーに飛ばすか判断する
		}
		return result;
	}
}
