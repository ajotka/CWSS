package CWSS;

//Klasa z danymi które zawieraj¹ wartosc i jak sie nazywa np AL 1
public class Data {
	String literal;
	double value;
	String name;

	public Data(double value, String name, String literal) {
		this.literal = literal;
		this.value = value;
		this.name = name;
	}

	public Data(String name) {
		this.literal = "AA";
		this.value = 0;
		this.name = name;
	}
	public String getLiteral() {
		return this.literal;
	}
	public double getValue(){
		return this.value;
	}
	public String getName(){
		return this.name;
	}
	public void setLiteral(String literal) {
		this.literal = literal;
	}
	public void setValue(float value){
		this.value = value;
	}
	public void setName(String name){
		this.name = name;
	}

}
