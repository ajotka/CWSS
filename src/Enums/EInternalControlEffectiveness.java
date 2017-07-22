package Enums;

public enum EInternalControlEffectiveness {

	A("N", "None"),
	L("L", "Limited"),
	M("M", "Moderate"),
	I("I", "Indirect(Defense-in-Depth"),
	B("B", "Best-Available"),
	C("C", "Complete"),
	D("D", "Default"),
	U("U", "Unknown"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code;	 
	private String literal;

	private EInternalControlEffectiveness (final  String code, final String literal)
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
