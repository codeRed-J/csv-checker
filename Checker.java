import java.io.File;

public class Checker{
	 public static void main(String[] args){
		 
		// check if there is argument in args[]
		if(args.length < 1){
			System.out.println("There is no given file name");
			System.out.println("Please run the programm with file name");
			System.exit(0);
		}
		
		// Create File object from filename in args[]
		File file = new File(args[0]);
		
		// check if file exists
		// if file does not exist write message and close program
		if(file.exists()){
			CsvFile cf = new CsvFile(file);
		}
		else{
			System.out.printf("File name \"%s\" does not exist%n", args[0]);
			System.out.println("Make sure thet your file is located in the same directory as Checker.java");
			System.out.printf("or check if file name \"%s\" is correct.", args[0]);
		}
		
		cf.checkFile();
		
		
		
		// declare Validator object
	/*	Validator vd;
		
		try{
			// open .csv file
			FileReader fr = new FileReader("import.csv");
			BufferedReader br = new BufferedReader(fr);
			// declare String variable which will hold the line from csv file
			String line;
			while((line = br.readLine()) != null){
				vd = new Validator(line);
			}
		}
		catch(){
			
		}
	 }
	 */
	 
	 
	 // Check if there is a file
	 // Open and read one line in time
	 // Split line in parts separating with ';' symbol
	 // Check parts acording requirements
	 // If all parts of the line are correct add it to the new file
	 // If mistake is found try to fix it
	 // If impossible to fix, inform user where mistake is found and close programm ( + delete result file)
	 // If possible to fix a mistake, fix it
	 // when there is no lines anymore, add header to new file and inform user about succesfull validation with some statistics (number of lines checked, number of fixed mistakes etc.)
	 
	 // Objects:
	 // 1. Checker (with main() )
	 // 2. FileReader - reads the file and sends each line to Validator
	 // 3. Validator - Splits line and send each part to validation method
	}
}