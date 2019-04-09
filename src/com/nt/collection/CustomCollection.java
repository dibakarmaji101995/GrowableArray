package com.nt.collection;

import java.util.Arrays;

public class CustomCollection {
	private Object[] objArray = new Object[10];
	private int elementCount = 0;

	/**
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		if (elementCount == objArray.length) {
			increaseLength();
		}
		objArray[elementCount] = obj;
		elementCount++;
	}

	/**
	 * 
	 */
	public void increaseLength() {
		int nextLength = 0;
		Object[] newObjArray = null;
		// set the nextLength value
		nextLength = objArray.length * 2;
		// create new Object[] object with this nextLenth
		newObjArray = new Object[nextLength];
		// copy each element from old object[] object
		for (int i = 0; i < objArray.length; ++i) {
			newObjArray[i] = objArray[i];
		}
		// then newObjArray reference is store into old Object[] reference variale which
		// is now point to new object[] object
		objArray = newObjArray;
	}// method

	/**
	 * This Method is used to get size of the collection
	 * @return int
	 */
	public int size() {
		return elementCount;
	}

	/**
	 * This method is used to get capacity of the collection
	 * @return int
	 */
	public int capacity() {
		return objArray.length;
	}
	/**
	 * This method is used for searching element in a collection object
	 * @param obj
	 * @return
	 */
	public boolean isAvailable(Object obj) {
		for(int i=0;i<=size();++i) {
			if(objArray[i]==obj) {
				return true;
			}
		}//for loop
		return false;
	}
	/**
	 * This method is use to retrive an element vale based on given index number
	 * @param indexNum
	 * @return
	 */
	public Object get(int indexNum) {
	/*	Object obj=null;
		if(indexNum < 0 || indexNum >= size()) {
			throw new IndexOutOfBoundsException("Invalid Index number");
		}
		for(int i=0;i<objArray.length;++i) {
			if(objArray[i]==objArray[indexNum]) {
				obj=objArray[indexNum];
			}
		}
		return obj;
		*/
		if(indexNum < 0 || indexNum >= size()) {
			throw new IndexOutOfBoundsException("Invalid Index number");
		}
		return objArray[indexNum];
	}
	public String getAll() {
		Object[] obj=new Object[size()];
		for(int i=0;i<size();++i) {
			obj[i]=objArray[i];
		}
		return Arrays.toString(obj);
	}
	/**
	 * This method is used to replace the element based on given index number
	 * @param indexNum
	 * @param obj
	 */
	public void replace(int indexNum,Object obj) {
		if(indexNum < 0 || indexNum >= size()) {
			throw new IndexOutOfBoundsException("Invalid Index Number");
		}
		objArray[indexNum]=obj;
	}
	/**
	 * This Method is used to remove the element from a collection
	 * @param indexNum
	 */
	public void remove(int indexNum) {
		if(indexNum < 0 || indexNum >=size()) {
    		throw new IndexOutOfBoundsException("Invalid index number");
    	}
		while(indexNum<=size()-1) {
			if(indexNum==size()-1){
				objArray[indexNum]=null;
			}else {
			objArray[indexNum]=objArray[indexNum+1];
			}
			//increase index number
			indexNum++;
		}
		//decrease array size
		elementCount--;
	}
	/**
	 * This method is used to insert an object to a colection object
	 * @param indexNum
	 * @param obj
	 */
    public void insert(int indexNum,Object obj) {
    	if(indexNum < 0 || indexNum >=size()) {
    		throw new IndexOutOfBoundsException("Invalid index number");
    	}
    	if(size()==capacity()) {
    		increaseLength();
    	}
    	for(int i=size()-1;i>=indexNum;--i) {
    		objArray[i+1]=objArray[i];
    	}
    	objArray[indexNum]=obj;
    	elementCount++;
    }
	@Override
	public String toString() {
		return "CustomCollection [objArray=" + Arrays.toString(objArray) + "]";
	}
	
}// class
