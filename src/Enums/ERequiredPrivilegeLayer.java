package Enums;

public enum ERequiredPrivilegeLayer {
	A("A", "Application"),
	S("S", "System"),
	N("N", "Network"),
	E("E", "Enterprise Infrastructure"),
	D("D", "Default"),
	U("U", "Unknown"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code;
	private String literal;

	private ERequiredPrivilegeLayer(final  String code, final String literal)
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
