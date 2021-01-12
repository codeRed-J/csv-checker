import java.io.IOException;

public class CsvFile{
	// holds file name
	private String fileName;
	private FileReader fr;
	private BufferedReader br;
	// declare String variable which will hold the line from csv file
	private String line;
	
	// open file given in the argument
	CsvFile(String fileName){
		this.fileName = fileName;
		try{
			// open .csv file
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
		}
		catch(IOException e){
			e.getMessage();
		}
		finally{
			br.close();
			fr.close();
		}
	}
	
	public void checkFile(){
		while((line = br.readLine()) != null){
			Validator vr = new Validator(line);
			vr.checkLine();
		}		
	}
}