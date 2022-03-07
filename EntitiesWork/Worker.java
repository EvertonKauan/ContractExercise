package EntitiesWork;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.Contract;
import entities.Departament;

public class Worker {
	private String name;
	private String level;
	private Double baseSalary;
	
	private Departament department;
	
	private List<Contract> listcontract = new ArrayList<>();
	

	public Departament getDepartment() {
		return department;
	}

	public void setDepartment(Departament department) {
		this.department = department;
	}


	public Worker(String name, String level, Double baseSalary, Departament department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<Contract> getListcontract() {
		return listcontract;
	}

	public void setListcontract(List<Contract> listcontract) {
		this.listcontract = listcontract;
	}

	public void addContrats(Contract contract) {
		listcontract.add(contract);
	}
	
	public void removeContracts(Contract contract) {
		listcontract.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(Contract c : listcontract) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum; 
	}
	
}
