package Enums;

public enum EDeploymentScope {

	A("A", "All"),
	M("M", "Moderate"),
	R("R", "Rare"),
	P("P", "Potentially Reachable"),
	D("D", "Default"),
	U("U", "Unknown"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code;
	private String literal;

	private EDeploymentScope(final  String code, final String literal)
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
