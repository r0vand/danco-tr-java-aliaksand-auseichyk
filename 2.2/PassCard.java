public  class PassCard{

	private String data;
	private int number;

	public PassCard(String data,int n){
		this.number = n;
		this.data = data;
	System.out.println("PassCard ready");
	}
	public String toString(){
	return "PassCard [Data"+data+",Number"+number+"]";}
	public void setNumber(int number){
		this.number = number;
	}
	public int getNumber(){
		return number;
	}
	public void setData(String data){
		this.data = data;
	}
	public String getData(){
		return data;
	}
}