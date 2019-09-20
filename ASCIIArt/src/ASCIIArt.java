/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	
	public static void wide() {
		System.out.println("                 |          |");
	
	}
	public static void body() {
		System.out.println("                  |        |");
		
	}
	public static void BodyWithLines() {
		System.out.println("                  |________|");
	}
	public static void BodyWithLadder() {
		System.out.println("                  |     ]  |");
		
	}
	public static void Head() {
		System.out.println("                      /\\");
		System.out.println("                     /  \\");
		System.out.println("                    /____\\");
		System.out.println("                   /      \\");
		System.out.println("                  /        \\");
		wide();
		wide();
		wide();
		System.out.println("                 |_        _|	");
		System.out.println("                   |      |");
		System.out.println("                   /      \\");
	}
	public static void Body() {
		System.out.println("                 /|        |\\");
		System.out.println("                / |        | \\");
		System.out.println("                | |        | |");
		System.out.println("                \\_|        |_/");
		BodyWithLines();
		BodyWithLadder();
		BodyWithLadder();
		BodyWithLadder();
		BodyWithLadder();
		BodyWithLadder();
		System.out.println("                  |_____]__|");
		BodyWithLines();
		body();
		body();
		body();
		body();
		BodyWithLines();
		System.out.println("                  |[[[[[[[[|");
		System.out.println("                  |--------|");
		BodyWithLines();
		
		
	}
	public static void Bot() {
		System.out.println("         /\\       |   /\\   |       /\\");
		System.out.println("        /  \\      /  /  \\  \\      /  \\");
		System.out.println("       /____\\    /  /____\\  \\    /____\\\n      |______|__/  |______|  \\__|______|");
		System.out.println("      |      |     |      |     |      |\n      |      |-----|      |-----|      |");
		System.out.println("      |      |     |      |     |      |");
		System.out.println("      |      |]]]]]|      |[[[[[|      |");
		System.out.println("      |      |     |      |     |      |");
		System.out.println("      |      |=====|      |=====|      |");
		System.out.println("      |      |     |      |     |      |");
		System.out.println("      \\______/     \\______/     \\______/");
		System.out.println("             |                  |");
		System.out.println("             \\__________________/");
		System.out.println("                 /__________\\");
		System.out.println("                 /\\/\\/\\/\\/\\/\\");


	}
	public static void main(String[] args) {
		
		Head();
		Body();
		Bot();
		
	
	}
}