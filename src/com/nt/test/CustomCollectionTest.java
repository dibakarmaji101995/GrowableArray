package com.nt.test;


import com.nt.collection.CustomCollection;

public class CustomCollectionTest {

	public static void main(String[] args) {
		CustomCollection custCollection=null;
		//create CustomCollection class object
		custCollection=new CustomCollection();
		//add new object to CustomCollection object
		custCollection.add(1);
		custCollection.add(2);
		custCollection.add(3);
		custCollection.add(4);
		custCollection.add(5);
		custCollection.add(6);
		custCollection.add(7);
		custCollection.add(8);
		custCollection.add(9);
		custCollection.add(10);
//		custCollection.add(11);
		//Display CustomCollecton object size and length
		System.out.println(custCollection);
		
		//invoke size() method
		System.out.println("Size of the CustomCollection::"+custCollection.size());
		
		//invoke capacity() method
		System.out.println("Capacity of the CustomCollection::"+custCollection.capacity());
		
		//invoke get() method
		System.out.println("Retrive element value of given index::"+custCollection.get(1));
		System.out.println("============================================================");
		
		//replace the element by given index number
		System.out.println("Before replace::"+custCollection.getAll());
		//invoke replace() method
		custCollection.replace(1,"B");
		System.out.println("Ater replace"+custCollection.getAll());
		System.out.println("=============================================================");
		
/*		//remove element by given index number
		System.out.println("Before remove::"+custCollection.getAll());
		//invoke remove method
		custCollection.remove(1);
		System.out.println("After remove::"+custCollection.getAll());
	*/	
		//insert a new object to a collection object
		System.out.println("Before Insert::"+custCollection.getAll());
		//invoke insert() method
		custCollection.insert(5,"B");
		System.out.println("After Insert::"+custCollection.getAll());
		
		//searchin an element by given object
		System.out.println("============================================================");
		System.out.println("B element is available?? "+custCollection.isAvailable("B"));
		System.out.println("C element is available?? "+custCollection.isAvailable("C"));
	}

}
