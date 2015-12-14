public  class Employee extends Man{

	private String position;
	private PassCard passCard;
	private Department department;
	private PastPosition pastPosition;

	public  Employee(String name, String secName, String
	position){
	super(name,secName);
	this.position = position;
	System.out.println("Employee ready");
	}
	
	public void setPosition(String position){
	this.position = position;			
	}
	public String getPosition(){
	return position;
	}
	public void setPassCard(PassCard passCard){
	this.passCard =  passCard;
	}
	public PassCard getPassCard(){
	return passCard;
	}	
	public void setDepartment(Department d){
	this.department = d;
	}
	public Department getDepartment(){
	return department;
	}
	public void setPastPosition( PastPosition pastPosition  ){
	this.pastPosition = pastPosition;
	}
	public PastPosition getPastPosition(){
	return pastPosition;
	}
	
	public void deletePastPosition(PastPosition p){
	}
}