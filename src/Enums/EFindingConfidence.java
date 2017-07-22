package Enums;

public enum EFindingConfidence {
	T("T", "Proven True"),
	LT("LT", "Proven Localyy True"),
	F("F", "Proven False"),
	D("D", "Default"),
	U("U", "Unknown"),
	NA("NA", "Not Applicable"),
	Q("Q", "Quantified");
	
	

	private  String code;
	private String literal;

	private EFindingConfidence (final  String code, final String literal)
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
