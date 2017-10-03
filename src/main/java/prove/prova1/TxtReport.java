package prove.prova1;

import org.springframework.stereotype.Component;



@Component
public class TxtReport {

	  //String path= "fede";
	   
	  //public TxtReport(String path) { this.path = path; }
	  
	   
	  public void generate(String data) {
	    System.out.println("genera txt report");
	  }
	 
	  public void saveToFile() {
	    System.out.println("File salvato!");
	  } 

	
}
