package Enums;

public enum ELikelihoodOfDiscovery {

	H("H", "High"),
	M("M", "Medium"), 
	L("L", "Low"), 
	D("D", "Default"),
	U("UK", "Unknown"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code;
	private String literal;

	private ELikelihoodOfDiscovery(final  String code, final String literal)
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
