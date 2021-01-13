import java.time.*;

public class dateValidator extends Validator{
	
	private String date1;
	private String date2;
	
	super(String line){
		
	}
	
	// main method which will check date (4 and 5 column) field with all given methods
	public boolean checkDate(String date1, String date2){
		this.date1 = date1;
		this.date2 = date2;
		if(checkDateFormat(date1)){
			System.out.println("date 1 format is correct.");
			if(checkDateFormat(date2)){
				System.out.println("date 2 format is correct.");
				if(checkDateRange(date1, date2)){
					System.out.println("Range of date is correct.");
					if(compareFormats(date1, date2)){
						System.out.println("date formats are identical.");
						System.out.println("date check is done!");
						return true;
					}else{
						System.out.println("date formats are different.");
					}
				}else{
					System.out.println("Range of date is incorrect.");
				}
			}else{
				System.out.println("date 1 format is impossible to convert.");
			}
		}else{
			System.out.println("date 1 format is impossible to convert.");
		}
		return false;
	}
	
	// check if date is in format DD.MM.YYYY, MM.YYYY or YYYY
	public boolean checkDateFormat(String date){
		
		if(year.getValue() > 1945 && year.getValue() < 2030){
			return true
		}
		
	}
	
	//identify format of date field
	private time identifyFormat(String date){
		
		
	}
	
	// check if date1 value is before date2 value
	public boolean checkdateRange(String date1, String date2){
		
		
	}
	
	// check if date1 and date2 have same format
	public boolean compareFormats(String date1, String date2){
		
		
	}
	
}