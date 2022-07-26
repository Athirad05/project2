package com.constants;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	
	
	public static void JVMReport(String json) {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\OrangeHrm\\target");
		Configuration confg = new Configuration(file,"Orange Hrm");
		confg.addClassifications("Browser", "Chrome");
		confg.addClassifications("platform", "Win-11");
		confg.addClassifications("Sprint No", "14");
		confg.addClassifications("Envirnment", "Testing");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li,confg);
		builder.generateReports();

}
}
