package controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.EmployeeDAO;
import models.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("/list")
	public ModelAndView getAllEmployees() {
		List<Employee> employees= dao.getAllEmployees();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		mav.addObject("employees", employees);
		return mav;
	}
	
	@RequestMapping("/save")
	public String createEmployee(HttpServletRequest request,HttpServletResponse response) {
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String gender= request.getParameter("gender");
		String address= request.getParameter("address");
		dao.createEmployee(new Employee(name,email,gender,address));
		
		return "redirect:/list";
	}
	
	@RequestMapping("/delete")
	public String deleteEmployee(HttpServletRequest request,HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		dao.deleteEmployee(id);
		return "redirect:/list";
	}
	
	@RequestMapping("/toUpdate")
	public ModelAndView toUpdate(HttpServletRequest request,HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		Employee toBeEdited = dao.getById(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("update-employee.jsp");
		mav.addObject("toBeEdited", toBeEdited);
		return mav;
		
	}
	
	@RequestMapping("/update")
	public String updateEmployee(HttpServletRequest request,HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("empid"));
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String gender= request.getParameter("gender");
		String address= request.getParameter("address");
		Employee updated =new Employee(id,name,email,gender,address);
		dao.updateEmployee(updated);
		return "redirect:/list";
	}
}
