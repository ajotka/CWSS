package Enums;

public enum EBusinessImpact {

	C("C", "Criticial"),
	H("H", "High"),
	M("M", "Medium"), 
	L("L", "Low"), 
	N("N", "None"),
	D("D", "Default"),
	U("UK", "Unknown"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code;
	private String literal;

	private EBusinessImpact(final  String code, final String literal)
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
