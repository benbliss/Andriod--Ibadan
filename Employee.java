package com.makotojava.intro;

import java.math.BigDecimal;

public class Employee extends Person {

	@Override
	public void printAudit(StringBuilder buffer) {
		// TODO Auto-generated method stub
		super.printAudit(buffer);
		buffer.append("TaxpayerIdentificationNumber=");
		buffer.append(getTaxpayerIdentificationNumber());
		buffer.append(","); buffer.append("EmployeeNumber=");
		buffer.append(getEmployeeNumber());
		buffer.append(","); buffer.append("Salary=");
		buffer.append(getSalary().setScale(2).toPlainString());
	}

	private String taxpayerIdentificationNumber;
	private String employeeNumber;
	private BigDecimal salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTaxpayerIdentificationNumber() {
		return taxpayerIdentificationNumber;
	}

	public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
		this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
