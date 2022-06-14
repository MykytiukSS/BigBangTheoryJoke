package bigBangTheory;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class BingBangDeque {

	
	
	public void bangDequeue(int count) {
		
		Deque<String>bang=new ArrayDeque<>();
		bang.add("Sheldon");
		bang.addLast("Leonard");
		bang.addLast("Penny");
		bang.addLast("Volovits");
		bang.addLast("Cutropali");
		System.out.println(bang);
		
		
		
		for (int i = 0; i < count; i++) {
			String str =bang.pollFirst();
			bang.addLast(str);
			bang.addLast(str);
		}
		
		System.out.println(bang);
		
		
	}
		
	

}
