package com.techlabs.model.test;

import java.util.Iterator;
import java.util.List;

import com.techlabs.model.Builder;
import com.techlabs.model.Guitar;
import com.techlabs.model.GuitarSpec;
import com.techlabs.model.Inventory;
import com.techlabs.model.Type;
import com.techlabs.model.Wood;

public class InventoryTest {
	public static void main(String args[]) {
		Inventory inventory = new Inventory();
		initiliazeInventory(inventory);
		
		GuitarSpec whatTanmayLikes = 
				new GuitarSpec(Builder.FENDER, "abc", Type.ACOUSTICS, Wood.AFRICAN, Wood.AFRICAN);
		
		List<Guitar> matchingGuitars = inventory.search(whatTanmayLikes);
		
		if(!matchingGuitars.isEmpty()) {
			System.out.println("You may like this Guitars");
			for(Iterator i = matchingGuitars.iterator() ; i.hasNext() ; ) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				
				System.out.println("We have "+spec.getBuilder()+" "+spec.getModel()+" "+
				spec.getType()+" guitar :\n    "+
				spec.getBackwood()+" back and sides, \n    "+
				spec.getTopwood()+" top.\n  You can have it for "+guitar.price());
			}
		}else {
			System.out.println("No such guitar found");
		}
		
	}

	private static void initiliazeInventory(Inventory inventory) {
		inventory.addGuitar("101", 5000, Builder.COLLINGS, "xyz", Type.ACOUSTICS, Wood.AFRICAN, Wood.AFRICAN);
		inventory.addGuitar("102", 1000, Builder.FENDER, "abc", Type.ACOUSTICS, Wood.AFRICAN, Wood.AFRICAN);
		inventory.addGuitar("103", 2000, Builder.COLLINGS, "abc", Type.ACOUSTICS, Wood.AFRICAN, Wood.AFRICAN);
		inventory.addGuitar("104", 4000, Builder.FENDER, "xyz", Type.ELECTRIC, Wood.AFRICAN, Wood.AFRICAN);
		inventory.addGuitar("105", 6000, Builder.ANY, "efg", Type.ELECTRIC, Wood.AFRICAN, Wood.AFRICAN);
		inventory.addGuitar("106", 7000, Builder.ANY, "efg", Type.ELECTRIC, Wood.AFRICAN, Wood.AFRICAN);
	}
}
