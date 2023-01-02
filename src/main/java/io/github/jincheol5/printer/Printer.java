package io.github.jincheol5.printer;

/**
 * 
 * @author oscar
 * java printer class for maven library upload 
 */
public class Printer {
	
	private String name;
	
	public Printer(String name) {
		
		this.name=name;
		
		
	}
	
	public void printerName() {
		
		System.out.println("Printer name = "+name);
	}
}
