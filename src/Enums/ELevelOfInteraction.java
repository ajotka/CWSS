package Enums;

public enum ELevelOfInteraction {

	A("A", "Automated"),
	T("T", "Typical/Limited"),
	M("M", "Moderate"),
	O("O", "Opportunistic"),
	H("H", "High"),
	NI("NI", "No Interaction"),
	D("D", "Default"),
	U("UK", "Unknown"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code;
	private String literal;

	private ELevelOfInteraction(final  String code, final String literal)
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
