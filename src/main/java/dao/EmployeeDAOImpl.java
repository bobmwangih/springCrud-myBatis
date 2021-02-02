package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import models.Employee;
import utils.MyBatisConfig;

public class EmployeeDAOImpl implements EmployeeDAO {

	public List<Employee> getAllEmployees() {
		SqlSession session = MyBatisConfig.getSessionFactory().openSession();
		List<Employee> employee =session.selectList("employeeMapper.getAllEmployees");
		session.commit();
		session.close();
		return employee;
	}

	public void createEmployee(Employee employee) {
		SqlSession session = MyBatisConfig.getSessionFactory().openSession();
		session.insert("employeeMapper.insertEmployee", employee);
		session.commit();
		session.close();
	}

	public void deleteEmployee(int id) {
		SqlSession session = MyBatisConfig.getSessionFactory().openSession();
		session.delete("employeeMapper.deleteEmployee", id);
		session.commit();
		session.close();
	}

	public void updateEmployee(Employee employee) {
		SqlSession session = MyBatisConfig.getSessionFactory().openSession();
		session.update("employeeMapper.updateEmployee", employee);
		session.commit();
		session.close();
		
	}

	public Employee getById(int id) {
		SqlSession session = MyBatisConfig.getSessionFactory().openSession();
		Employee toBeEdited =session.selectOne("employeeMapper.getById", id);
		session.commit();
		session.close();
		return toBeEdited;
	}

}
