import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


import EntitiesWork.Worker;
import entities.Contract;
import entities.Departament;

public class application {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter departament name: ");
		String nameDepartament = sc.next();
		
		//Departament dep = new Departament(setNameDepartament);
		
		System.out.println();
		
		System.out.println("Enter Worker Data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Level: ");
		String level = sc.next();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		
		System.out.println();
		
		Worker worker = new Worker(name, level.valueOf(level), baseSalary, new Departament(nameDepartament)); 
		
		System.out.print("How many contracts to this worker? ");
		int cont = sc.nextInt();
		
		cont +=1;
		for(int i = 1; i < cont; i ++) {
			System.out.println();
			System.out.printf("Enter Contract Date #%d", i);
			System.out.println();
			System.out.println();
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per Hour: ");
			Double valuerPerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();	
			
			Contract contract = new Contract(date, valuerPerHour, hours);
			worker.addContrats(contract);
		}
		
		System.out.println();
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println();
		
		System.out.printf("Name: %s", worker.getName());
		System.out.println();
		System.out.printf("Departament: " + worker.getDepartment().getName());
		System.out.println();
		//System.out.printf("Income for: %d: %d", monthAndYear, String.format("%.2f", worker.income(year, month)));
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}

}
