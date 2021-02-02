package dao;

import java.util.List;

import models.Employee;

public interface EmployeeDAO {

	public List<Employee> getAllEmployees();
	public void createEmployee(Employee employee);
	public void deleteEmployee(int id);
	public void updateEmployee(Employee employee);
	public Employee getById(int id);
	
}
