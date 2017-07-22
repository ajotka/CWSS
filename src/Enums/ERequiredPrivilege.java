package Enums;

public enum ERequiredPrivilege {
	N("N", "None"),
	L("L", "Limited/Guest"),
	RU("RU", "Regular User"),
	P("P", "Partially-Privileged User"),
	A("A", "Administartor"),
	D("D", "Default"),
	U("U", "Unknown"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code;
	private String literal;

	private ERequiredPrivilege (final  String code, final String literal)
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
