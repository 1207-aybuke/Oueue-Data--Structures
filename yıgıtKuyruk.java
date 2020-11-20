package veriYapýlarý;

import java.util.Arrays;

public class yýgýtKuyruk {

	public static void main(String[] args) {
		
		Kuyruk s = new Kuyruk (5);
		
		s.print();
		
		s.insert(5);
		s.print();
		
		s.insert(10);
		s.print();
		
		s.insert(9);
		s.print();
		
		s.insert(8);
		s.print();
		
		s.insert(13);
		s.print();
		
		System.out.println("çýkarýlan eleman" + s.remove());		
		s.print();
		
		

		
		
		
		
		

	}

}
