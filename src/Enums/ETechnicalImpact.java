package Enums;

public enum ETechnicalImpact {


	C("C", "Criticial"),
	H("H", "High"),
	M("M", "Medium"), 
	L("L", "Low"), 
	N("N", "None"),
	D("D", "Default"),
	U("U", "Unknown"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code; 
	private String literal;

	private ETechnicalImpact (final  String code, final String literal)
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
