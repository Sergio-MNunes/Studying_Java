package sg.edu.ntu.tests;
import sg.edu.ntu.classes.Ex0104Employee;

public class TestEx0104Employee {

	public static void main(String[] args) {
		Ex0104Employee e1 = new Ex0104Employee(1, "Sergio", "de Magalhaes Nunes", 100);
		
		System.out.println(e1.getName());
		System.out.println("Salario: " + e1.getSalary());
		System.out.println("Salario anual: " + e1.getAnnualSalary());
		e1.setSalary(200);
		e1.raiseSalary(50);
		System.out.println("Salario aumentado: " + e1.getSalary());
		System.out.println("saida do toString: " + e1);
		
	}
}
