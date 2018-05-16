package com.java8.fundamentals;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String[] str = {"yash","dave", "nahi fatega be bsdk!!!" ,null};

		// It returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional.
		Optional<String> option = Optional.ofNullable(str[2]); //str[3] 
		
		// Return true if there is a value present, otherwise false
		if(option.isPresent()) { 

			//If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.
			System.out.println(option.get());
		}
		else {
			System.out.println("Fatega be chutiye !!!");
		}
	}

}
