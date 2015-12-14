public  class Man{
	protected String name;
	protected String secName;

	public Man(String name, String secName){
	this.name = name;
	this.secName = name;
	System.out.println("Man ready");
	}
				
	public void setName(String newName){
		name = newName;			
	}
	public String getName(){
		return name;

	}
	public void setSurname(String newSecName){
		name = newSecName;			
	}
	
	public String getSecName(){
		return secName;

	}
}	