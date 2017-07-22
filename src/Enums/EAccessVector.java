package Enums;


public enum EAccessVector {
	I("I", "Internet"),
	R("R", "Intranet"),
	V("V", "Private Network"),
	A("A", "Adjacent Networ"),
	L("L", "Local"),
	P("P", "Psyhical"),
	D("D", "Default"),
	U("U", "Unknown"),
	Q("Q", "Quantified");
	
	

	private String code;
	private String literal;

	private EAccessVector(final String code, final String literal)
	{
		this.code = code;
		this.literal = literal;
	}
	public String getCode ()
	{
		return code;
	}

	public String getLiteral ()
	{
		return literal;
	}
}
