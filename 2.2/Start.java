public class Start{

	public static void main(String[] args){

	Employee employee = new Employee("Vasya", "Ivanov", "Menedger");
	Department department = new Department("Menedgers","Vasya Ivanov");
	PassCard passCard = new PassCard("12.12.2012",1234556);		PastPosition pastPosition = new PastPosition("Programmer","Programmers");
	Menu menu = new Menu(1);
	employee.setPastPosition(pastPosition);
	System.out.println(employee.getPastPosition());
	department.setPastPosition(pastPosition);
	System.out.println(department.getPastPosition());
	department.setEmployee(employee);
	System.out.println(department.getEmployee());
	employee.setPassCard(passCard);
	System.out.println(employee.getPassCard());

	}
    
}