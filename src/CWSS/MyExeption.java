package CWSS;

public class MyExeption extends Exception{
	
	private static final long serialVersionUID = 1L;

	public MyExeption()  {
		GUI.setError("Podano zle dane - Wektor niepoprawny\n");
		setResult();
	}
	public boolean setResult() {
		return false;
	}

}
