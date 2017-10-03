package prove.prova1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {

	  String path;
	   
	  @Autowired
	  TxtReport report;
	  
	  public TxtReport generate(String data) {
	    report.generate(data);
	    return report;
	  }
	  
	  
	  public void setReport (TxtReport report) {
	    this.report = report;
	  }
	
	
}
