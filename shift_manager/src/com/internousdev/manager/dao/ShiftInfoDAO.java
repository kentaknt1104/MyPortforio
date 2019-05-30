package com.internousdev.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.manager.dto.ShiftInfoDTO;
import com.internousdev.manager.util.DBConnector;

public class ShiftInfoDAO {

	public List<ShiftInfoDTO> getAllShiftInfo() {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<ShiftInfoDTO> shiftInfoDTOList = new ArrayList<ShiftInfoDTO>();

		String sql = "SELECT "
				+ "ui.user_name, "
				+ "hc.part_id, "
				+ "hc.day, "
				+ "hc.start_hour, "
				+ "hc.finish_hour, "
				+ "hc.color, "
				+ "ui.ability_flg as status"
				+ "FROM hope_shift hc "
				+ "LEFT JOIN user_info ui "
				+ "ORDER BY id DESC";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			ShiftInfoDTO shiftInfoDTO = new ShiftInfoDTO();

			while (rs.next()) {
				shiftInfoDTO.setId(rs.getInt("id"));
				shiftInfoDTO.setTitle(rs.getString("user_name"));
				shiftInfoDTO.setPartCode(rs.getInt("part_id"));
				shiftInfoDTO.setDay(rs.getInt("day"));
				shiftInfoDTO.setStart(rs.getInt("start_hour"));
				shiftInfoDTO.setEnd(rs.getInt("finish_hour"));
				shiftInfoDTO.setColor(rs.getString("color"));
				shiftInfoDTO.setStatus(rs.getInt("status"));

				shiftInfoDTOList.add(shiftInfoDTO);
			}
		} catch (SQLException e) {
				e.printStackTrace();
		} finally {
			try {
				connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return shiftInfoDTOList;
	}

	public int decideAllShift () {

//		ここで全員のシフトをgetする
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		int count = 0;
		return count;

	}

	public int insertMyShift () {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

//		ここでカレンダー情報の登録をする
		int count = 0;
		return count;
	}
}
