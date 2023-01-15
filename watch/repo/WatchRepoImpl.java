package com.xworkz.watch.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.utils.DButils;

public class WatchRepoImpl implements WatchRepo {

	@Override
	public boolean saveAll(WatchDto dto) {

		String query = "insert into watch values(?,?,?,?,?)";

		try (Connection connection = DButils.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getBrandName());
			statement.setString(3, dto.getColor());
			statement.setString(4, dto.getType());
			statement.setInt(5, dto.getPrice());

			statement.executeUpdate();

			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		{
			return false;
		}

	}

	@Override
	public List<WatchDto> read() {

		String query = "select * from watch";

		try (Connection connection = DButils.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			ResultSet set = statement.executeQuery();

			List<WatchDto> list = new ArrayList<WatchDto>();

			while (set.next()) {
				int id = set.getInt(1);
				String brandName = set.getString(2);
				String color = set.getString(3);
				String type = set.getString(4);
				int price = set.getInt(5);

				WatchDto dto = new WatchDto(id, brandName, color, type, price);
				list.add(dto);
			}

			return list;

		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		{

			return null;
		}
	}

	@Override
	public WatchDto findByBrandNameAndColor(String brandName, String color) {

		String query = "Select * from watch where brandName=? and color=?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, brandName);
			statement.setString(2, color);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				int id = set.getInt(1);
				String brandName1 = set.getString(2);
				String color1 = set.getString(3);
				String type = set.getString(4);
				int price = set.getInt(5);

				WatchDto dto = new WatchDto(id, brandName1, color1, type, price);
				return dto;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public WatchDto findByIdAndType(int id, String type) {

		String query = "Select * from watch where id=? and type=?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, id);
			statement.setString(2, type);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				int id1 = set.getInt(1);
				String brandName1 = set.getString(2);
				String color1 = set.getString(3);
				String type1 = set.getString(4);
				int price = set.getInt(5);

				WatchDto dto = new WatchDto(id1, brandName1, color1, type1, price);
				return dto;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateBrandNameById(String brandName, int id) {

		String query = "update watch set brandName=? where id=?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, brandName);
			statement.setInt(2, id);

			statement.executeUpdate();

			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteByColorAndType(String color, String type) {

		String query = "delete from watch where color=? and type=?";

		try (Connection connection = DButils.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, color);
			statement.setString(2, type);

			statement.executeUpdate();

			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
