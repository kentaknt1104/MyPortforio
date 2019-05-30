package com.internousdev.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.manager.dto.UserInfoDTO;
import com.internousdev.manager.util.DBConnector;

public class UserInfoDAO {

	public UserInfoDTO getPartInfo(String userName, int partCode) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		UserInfoDTO loginDTO = new UserInfoDTO();

		String sql = "SELECT * FROM user_info "
				+ "WHERE user_name = ? AND part_id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1,  userName);
			ps.setInt(2, partCode);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				loginDTO.setUserName(rs.getString("user_name"));
				loginDTO.setPartCode(rs.getInt("part_id"));
				loginDTO.setAdminFlg(rs.getInt("admin_flg"));

				if (!(rs.getString("user_name").equals(null))) {
					loginDTO.setLoginFlg(true);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return loginDTO;
	}

	public int codeMaker(int tempPartCode) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		int partCode = 1;
		String sql = "SELECT part_id FROM user_info "
				+ "WHERE part_id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setInt(1, tempPartCode);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				partCode = 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return partCode;
	}

	public int regist(String userName, String partCode) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "INSERT INTO user_info (user_name, part_id) "
				+ "VALUES (?. ?)" ;

		int count = 0;
		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, userName);
			ps.setString(2, partCode);

			count = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	public List<UserInfoDTO> getDecidedShift(String partCode) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<UserInfoDTO> userInfoDTOList = new ArrayList<UserInfoDTO>();

		String sql = "SELECT * FROM decide_shift "
				+ "WHERE part_id = ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, partCode);

			ResultSet rs = ps.executeQuery();
			UserInfoDTO userInfoDTO = new UserInfoDTO();

			if (rs.next()) {
				userInfoDTO.setPartCode(rs.getInt("part_id"));
				userInfoDTO.setDay(rs.getInt("day"));
				userInfoDTO.setStartHour(rs.getInt("start_hour"));
				userInfoDTO.setFinishHour(rs.getInt("finish_hour"));
				userInfoDTO.setColor(rs.getString("color"));
				userInfoDTOList.add(userInfoDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userInfoDTOList;

	}
}
