package Enums;


public enum EAcquiredPrivilege {

	A("A", "Administrator"),
	P("P", "Partially-Privileged User"),
	RU("RU", "Regular User"), 
	L("L", "Limited/Guest"), 
	N("N", "None"),
	U("U", "Unknown"),
	D("D", "Default"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code;
	private String literal;

	private EAcquiredPrivilege (final  String code, final String literal)
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
