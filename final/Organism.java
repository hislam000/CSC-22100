/*
 * @Group Project: Hasibul Islam, Tashin Alam and Shakir Chowdhury
 */
//import statement 
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class Organism {
	
	private int Organism_age;
	private String Organism_type;
	private ImageIcon Organism_icon;
	
	
	public Organism(String Organism_type) {
		this.Organism_age = 0;
		this.Organism_icon = new ImageIcon
		("The images of the /"+Organism_type+".png");
		this.Organism_type = Organism_type;}
		
	public Organism() { this.Organism_age = 0 ;
	    this.Organism_type = ""; }

	public void setAge(int value) { this.Organism_age = value; }
	
	public int getAge() { return this.Organism_age;}
	
	public String getType() { return this.Organism_type;}

	public void setType(String Organism_type) { this.Organism_type = Organism_type;}

	public void setIcon(String Organism_type) 
							throws IOException {
		Organism_icon = new ImageIcon(ImageIO.read(
			new File("The images of the /"+Organism_type+".png")));}
	
	public String getIconName() {
		return Organism_icon.getDescription();}
}
