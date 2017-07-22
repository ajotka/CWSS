package Enums;

public enum EPrevalence {

	W("W", "Widespread"),
	H("H", "High"), 
	C("C", "Common"),
	L("L", "Limited"),
	D("D", "Default"),
	U("UK", "Unknown"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code;
	private String literal;

	private EPrevalence(final  String code, final String literal)
	{
		this.code = code;
		this.literal = literal;
	}
	public  String getCode ()
	{
		return code;
	}

	public String getLiteral ()
	{
		return literal;
	}
}
