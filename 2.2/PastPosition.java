public class PastPosition{

	private String pPosition;
	private String lastDepartment;

	public PastPosition(String pPosition,String lastDepartment){
		this.pPosition = pPosition;
		this.lastDepartment = lastDepartment;
		System.out.println("PastPosition ready");
	}
	public void setPPosition(String PPosition){
		this.pPosition = pPosition;
	}
	public String getPPosition(){
		return pPosition;
	}
	public void setLastDepartment( String lastDepartment ){
		this.lastDepartment = lastDepartment;
	}
	public String getLastDepartment(){
		return lastDepartment;
	}
}
