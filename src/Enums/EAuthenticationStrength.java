package Enums;

public enum EAuthenticationStrength {
	M("M", "Moderate"),
	S("S", "Strong"),
	N("N", "None"),
	W("W", "Weak"),
	D("D", "Default"),
	UK("UK", "Unknown"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code; 
	private String literal;

	private EAuthenticationStrength(final  String code, final String literal)
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
