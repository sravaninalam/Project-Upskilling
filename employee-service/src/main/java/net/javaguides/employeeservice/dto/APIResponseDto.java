package net.javaguides.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class APIResponseDto {
    private EmployeeDto employee;
    private DepartmentDto department;
	public APIResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public APIResponseDto(EmployeeDto employee, DepartmentDto department) {
		super();
		this.employee = employee;
		this.department = department;
	}
	public EmployeeDto getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeDto employee) {
		this.employee = employee;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "APIResponseDto [employee=" + employee + ", department=" + department + "]";
	}
    
}
