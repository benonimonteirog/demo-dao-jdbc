package dao;

import java.util.List;

import entities.Department;
import entities.Seller;

public interface SellerDao {
	void insert(Seller seller);
	void update(Seller seller);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findByDepartment(Department department);
	List<Seller> findAll();
}