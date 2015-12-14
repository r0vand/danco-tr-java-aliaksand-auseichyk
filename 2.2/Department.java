public  class Department{
	private String name;
	private String employees;
	private PastPosition pastPosition;
	private Employee employee;

	public Department(String n,String employees){
		this.name = n;
		this.employees = employees;
		System.out.println("Department ready");
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void  addEmployee(Employee newEmployee){
	
	}
	public void setEmployees(String employees){
		this.employees = employees;
	}
	public String  getEmployees(){
		return employees;
	}
	public void setEmployee(Employee employee){
		this.employee = employee;
	}
	public Employee getEmployee(){
		return employee;
	}

	public void  removeEmployee(Employee e){
		
	}
	public void setPastPosition( PastPosition pastPosition  ){
	this.pastPosition = pastPosition;
	}
	public PastPosition getPastPosition(){
	return pastPosition;
	}

	}
