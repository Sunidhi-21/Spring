package com.xworkz;

import java.util.ArrayList;
import java.util.Comparator;

import com.xworkz.dto.ToyDTO;

public class ToyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ToyDTO> toyAL = new ArrayList<ToyDTO>();

		ToyDTO t1 = new ToyDTO("Car", "Remote control toy", 1500);
		ToyDTO t2 = new ToyDTO("Teddy bear", "Stuffed toy", 2000);
		ToyDTO t3 = new ToyDTO("Unicorn", "Stuffed toy", 2500);
		ToyDTO t4 = new ToyDTO("Kitchen set", "kitchen toys", 600);
		ToyDTO t5 = new ToyDTO("Doctor Kit", "Doctor toys", 800);
		ToyDTO t6 = new ToyDTO("Barbie", "Girls toys", 1200);
		ToyDTO t7 = new ToyDTO("Little Mommy", "Girls toys", 2550);
		ToyDTO t8 = new ToyDTO("Hotwheels Car", "Boys toys", 2000);
		ToyDTO t9 = new ToyDTO("Lego", "Construction toys", 5000);
		ToyDTO t10 = new ToyDTO("Beyblade", "Boys toys", 1600);

		toyAL.add(t1);
		toyAL.add(t2);
		toyAL.add(t3);
		toyAL.add(t4);
		toyAL.add(t5);
		toyAL.add(t6);
		toyAL.add(t7);
		toyAL.add(t8);
		toyAL.add(t9);
		toyAL.add(t10);

		Comparator<ToyDTO> comparator1 = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Comparator<ToyDTO> comparator2 = (o1, o2) -> o1.getType().compareTo(o2.getType());
		Comparator<ToyDTO> comparator3 = (o1, o2) -> o1.getPrice() - o2.getPrice();

		toyAL.sort(comparator1);
		System.out.println("sorting w.r.t name");
		System.out.println(toyAL);

		toyAL.sort(comparator2);
		System.out.println("sorting w.r.t type");
		System.out.println(toyAL);

		toyAL.sort(comparator3);
		System.out.println("sorting w.r.t price");
		System.out.println(toyAL);
	}

}

//Output
//sorting w.r.t name
//[ToyDTO [name=Barbie, type=Girls toys, price=1200], ToyDTO [name=Beyblade, type=Boys toys, price=1600], ToyDTO [name=Car, type=Remote control toy, price=1500], ToyDTO [name=Doctor Kit, type=Doctor toys, price=800], ToyDTO [name=Hotwheels Car, type=Boys toys, price=2000], ToyDTO [name=Kitchen set, type=kitchen toys, price=600], ToyDTO [name=Lego, type=Construction toys, price=5000], ToyDTO [name=Little Mommy, type=Girls toys, price=2550], ToyDTO [name=Teddy bear, type=Stuffed toy, price=2000], ToyDTO [name=Unicorn, type=Stuffed toy, price=2500]]
//sorting w.r.t type
//[ToyDTO [name=Beyblade, type=Boys toys, price=1600], ToyDTO [name=Hotwheels Car, type=Boys toys, price=2000], ToyDTO [name=Lego, type=Construction toys, price=5000], ToyDTO [name=Doctor Kit, type=Doctor toys, price=800], ToyDTO [name=Barbie, type=Girls toys, price=1200], ToyDTO [name=Little Mommy, type=Girls toys, price=2550], ToyDTO [name=Car, type=Remote control toy, price=1500], ToyDTO [name=Teddy bear, type=Stuffed toy, price=2000], ToyDTO [name=Unicorn, type=Stuffed toy, price=2500], ToyDTO [name=Kitchen set, type=kitchen toys, price=600]]
//sorting w.r.t price
//[ToyDTO [name=Kitchen set, type=kitchen toys, price=600], ToyDTO [name=Doctor Kit, type=Doctor toys, price=800], ToyDTO [name=Barbie, type=Girls toys, price=1200], ToyDTO [name=Car, type=Remote control toy, price=1500], ToyDTO [name=Beyblade, type=Boys toys, price=1600], ToyDTO [name=Hotwheels Car, type=Boys toys, price=2000], ToyDTO [name=Teddy bear, type=Stuffed toy, price=2000], ToyDTO [name=Unicorn, type=Stuffed toy, price=2500], ToyDTO [name=Little Mommy, type=Girls toys, price=2550], ToyDTO [name=Lego, type=Construction toys, price=5000]]
//
