package prove.prova1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class HelloFede {
	
	  public static void main(String[] args) {
		    String data = null;
		     
		    // ...  reperimento dati
		   
		    ApplicationContext context =
		     	   new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		    
		    
		    ReportGenerator reportGenerator=(ReportGenerator)context.getBean("reportGenerator");
		    
		    reportGenerator.generate(data);
		  }

	

}
