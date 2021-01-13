public class Validator{
	private String[] parts;
	
	
	Validator(String line){
		parts = line.split(";");
	}
	
	// trim all white spaces before and after each part of line
	public void prepareLine(){
		for(int i = 0; i < parts.length; i++){
			parts[i] = parts[i].trim();
		}
	}
	
	// return checked csv line 
	public String getLine(){
		return String.join(";", parts);
	}
	
	// check csv line part quantity (should be 9)
	public boolean partsLength(){
		if(parts.length != 9){
			return false;
		}
		else{
			return true;
		}
	}
	
	// change element in parts variable
	public void changeElement(String el, int num){
		parts[num-1] = el;
	}
	
	// get element from parts variable
	public String getElement(int num){
		return parts[num-1];
	}
}