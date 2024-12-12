/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman x= new Spiderman();
		x.setActor("Tobey Maguire");
		x.setAge(49);
		x.setVillain("Green goblin");

		Spiderman y= new Spiderman("andrew",41,"electro");
		
		Spiderman z= new Spiderman("tom");
		z.setAge(28);
		z.setVillain("the vulture");
		
		System.out.println("the villain is"+y.getVillain());
	}
}
