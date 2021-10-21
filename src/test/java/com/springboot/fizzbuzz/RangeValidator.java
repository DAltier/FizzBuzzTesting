package com.springboot.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fizzbuzz.IRangeVal;
import fizzbuzz.RangeVal;

class RangeValidator {

	@Test
    public void Given0GetFalse() {
        //Given: I am a user
        //When: I enter the integer 0
		IRangeVal Range = new RangeVal();
		boolean result = Range.getResult(0);
        //Then: I get back false
        assertEquals(false, result);
    }
	
	@Test
    public void Given1GetTrue() {
        //Given: I am a user
        //When: I enter the integer 1
		IRangeVal Range = new RangeVal();
		boolean result = Range.getResult(1);
		// IRangeVal Range = mock(RangeVal.class);
			//when(Range.getResult(1)).thenReturn(true);
        //Then: I get back true
        assertEquals(true, result);
    }
	
	@Test
    public void Given300GetTrue() {
        //Given: I am a user
        //When: I enter the integer 300
		IRangeVal Range = new RangeVal();
		boolean result = Range.getResult(300);
        //Then: I get back true
        assertEquals(true, result);
    }
	
	@Test
    public void Given400GetFalse() {
        //Given: I am a user
        //When: I enter the integer 400
		IRangeVal Range = new RangeVal();
		boolean result = Range.getResult(400);
        //Then: I get back false
        assertEquals(false, result);
    }

}
