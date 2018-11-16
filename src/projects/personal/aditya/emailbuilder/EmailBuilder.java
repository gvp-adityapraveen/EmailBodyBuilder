package projects.personal.aditya.emailbuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class EmailBuilder {
	
	private String titleOfHtml;
	private String nameOfHtmlFile;
	
	public void setTitleOfHtml(String valueOfTitleTag)
	{
		this.titleOfHtml = valueOfTitleTag;
	}
	
	public String getTitleOfHtml()
	{
		return this.titleOfHtml;
	}
	
	public void setFileNameOfHTML(String fileName)
	{
		this.nameOfHtmlFile = fileName;
	}
	
	public String getFileNameOfHTML()
	{
		return this.nameOfHtmlFile;
	}
	
	abstract public String setBodyContent();
	
	public void createEntireHtml()
	{
		File f = new File(getFileNameOfHTML()+".html"); 
		FileWriter fw;
		try {
			fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("<html><head><title>"+this.getTitleOfHtml()+"</title></head>");
			bw.write("<body>"+setBodyContent()+"</body></html>");
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/*
	 * Need to add a method which specifies the
	 * path where the file resides
	 * */
}
