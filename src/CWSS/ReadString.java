package CWSS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Klasa sluzaca do czytania ze stringa i jego podzial. 
// algorytm dziala tak ze dostaje stringa i go pare razy dziele, jest przedstawiony
// w celu sparsowania i otrzmania gotowego wektora nalezy wyowalc
// metode endSolution(string) w tedy verctor bedzie utworznu i metodê getVector
// aby uzyskac vector.

// zabezpiecza siê kiedy jest za ma³o lub za du¿o znaków w stringu,
//jest wywolywany exeption z klasy MyExeption i program sie konczy, nie sprawdza
// merytoryki stringu

public class ReadString {
	
	
    static List<String> solution = new ArrayList<String>();
    
	public boolean firstSplit(String a) throws MyExeption {
		String solution1 [];
		solution1 = a.split("/");
	    for(String b: solution1){
	    	solution.add(b);
	    }
	    return true;
	}
	
	public boolean secondSplit() throws MyExeption {
		
		List<String> help = new ArrayList<String>();

		for(String a:solution){
			List<String>  list = new ArrayList<String>( Arrays.asList( a.split(":") ) );

			if (list.size() == 2) {
				help.add( list.size()-2 ,list.get(list.size()-2));
				help.add( list.size()-1 ,list.get(list.size()-1));
			} else {
				new MyExeption();
			}
		}
		solution.clear();
		for(int i =0; i<help.size(); i++){
			solution.add(i, help.get(i));
		}	
		return true;

	}
	public boolean thirdSplit() throws MyExeption{
		List<String> help = new ArrayList<String>();
		for(String a:solution){
			List<String>  list = new ArrayList<String>( Arrays.asList( a.split(",") ) );
			if(a.length()<= 2){
				help.add( list.size()-1 ,list.get(list.size()-1));
			}
			else{
				help.add( list.size()-2 ,list.get(list.size()-2));
				help.add( list.size()-1 ,list.get(list.size()-1));
			}
			
		}
		solution.clear();
		for(int i =0; i<help.size(); i++){
			solution.add(i, help.get(i));
		}
		
		return true;
	}
	
	public List<String> getSolution() throws MyExeption {
		return solution;
	}
	public void readError() throws MyExeption{
		  new MyExeption();
	}
	
	public boolean endSolution(String line){
		boolean t = false,r = false,u = false,e = false;
		try {
			t = controlLength(line);
			r = firstSplit(line);
			u = secondSplit();
			e = thirdSplit();
			getVector();
		} catch (MyExeption exept) {}
		if ((t && r && u && e ) == true)
			return true;
		else 
			return false;
	}
	public int checkLength(String line){
		return line.length();
	}
	public boolean controlLength(String line) throws MyExeption{
		boolean cnd = true;
		if(checkLength(line) == 0 || checkLength(line) == 1){
			cnd = false;
			readError();
		}else if( checkLength(line)>170 || checkLength(line) <140 ){
			cnd = false;
			readError();
		}	
//		else {
//			System.out.println("Dlugosc wektora jest poprawna");
//		}
		return cnd;
	}
	
	public List<Data> getVector() throws MyExeption{
		List<Data> vector = new ArrayList<Data>();
		String data = "a";
		double value = 10.0;
		String literal = "AA";
		for(int i =0; i<solution.size(); i++){
			if( (i%3) == 1 ){
				value = Double.parseDouble(solution.get(i));
			}
			else if( (i%3)== 2 ){
				data = solution.get(i);
			} else {
				literal = solution.get(i);
			}
			
			if(data != "a" && value !=10.0){
				vector.add(new Data(value, data, literal));
				value = 10;
				data = "a";
			} 
		}
		return vector;
		
	}

}
