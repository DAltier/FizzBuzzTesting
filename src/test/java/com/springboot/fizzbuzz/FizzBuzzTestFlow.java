package com.springboot.fizzbuzz;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import fizzbuzz.ConvertString;
import fizzbuzz.FizzBuzzFlow;
import fizzbuzz.IFizzBuzzFlow;
import fizzbuzz.IGetFizzBuzz;
import fizzbuzz.IRangeVal;

class FizzBuzzTestFlow {

	@Mock
    ConvertString mockConvertString = mock(ConvertString.class);
	@Mock
    IRangeVal mockRangeVal = mock(IRangeVal.class);
	@Mock
    IGetFizzBuzz mockGetFizzBuzz = mock(IGetFizzBuzz.class);

    @Test
    public void givenOneCallConvertStringOneTime() {
        //Given: I am a user
    	given(mockConvertString.getResult("1")).willReturn(true);
    	given(mockRangeVal.getResult(1)).willReturn(true);
    	given(mockGetFizzBuzz.getResult(1)).willReturn("1");
    	
        //When: I enter the number 1
        IFizzBuzzFlow IFBF = new FizzBuzzFlow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFBF.getResult("1");
        
        //Then: ConvertString.getResult() will be called one time
        verify(mockConvertString, times(1)).getResult("1");
    }
    
    @Test
    public void givenOneCallRangeValOneTime() {
    	//Given: I am a user
    	given(mockConvertString.getResult("1")).willReturn(true);
    	given(mockRangeVal.getResult(1)).willReturn(true);
    	given(mockGetFizzBuzz.getResult(1)).willReturn("1");
    	
    	//When: I enter the string 1
    	IFizzBuzzFlow IFBF = new FizzBuzzFlow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
    	IFBF.getResult("1");
    	
    	//Then: ConvertString.getResult() will be called one time
    	verify(mockRangeVal, times(1)).getResult(1);
    }

    @Test
    public void givenOneCallGetFizzBuzzOneTime() {
        //Given: I am a user
    	given(mockConvertString.getResult("1")).willReturn(true);
    	given(mockRangeVal.getResult(1)).willReturn(true);
    	given(mockGetFizzBuzz.getResult(1)).willReturn("1");
    	
        //When: I enter the string 1
        IFizzBuzzFlow IFBF = new FizzBuzzFlow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFBF.getResult("1");
        
        //Then: ConvertString.getResult() will be called one time
        verify(mockGetFizzBuzz, times(1)).getResult(1);
    }
    
    @Test
    public void givenZeroCallConvertStringOneTime() {
        //Given: I am a user
        given(mockConvertString.getResult("0")).willReturn(true);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("");
        
        //When: I enter the string 0
        IFizzBuzzFlow IFBF = new FizzBuzzFlow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFBF.getResult("0");
        
        //Then: ConvertString.getResult() will be called one time
        verify(mockConvertString, times(1)).getResult("0");
    }
    
    @Test
    public void givenZeroCallRangeValOneTime() {
    	//Given: I am a user
    	given(mockConvertString.getResult("0")).willReturn(true);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("");
        
    	//When: I enter the string 0
    	IFizzBuzzFlow IFBF = new FizzBuzzFlow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
    	IFBF.getResult("0");
    	
    	//Then: ConvertString.getResult() will be called one time
    	verify(mockRangeVal, times(1)).getResult(0);
    }
    
    @Test
    public void givenZeroCallGetFizzBuzzZeroTimes() {
    	//Given: I am a user
    	given(mockConvertString.getResult("0")).willReturn(true);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("0");
        
    	//When: I enter the string 0
    	IFizzBuzzFlow IFBF = new FizzBuzzFlow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
    	IFBF.getResult("0");
    	
    	//Then: ConvertString.getResult() will be called zero times
    	verify(mockGetFizzBuzz, times(0)).getResult(0);
    }

    @Test
    public void givenWordFiveCallConvertStringOneTime() {
        //Given: I am a user
        given(mockConvertString.getResult("five")).willReturn(false);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("");
        
        //When: I enter the string five
        IFizzBuzzFlow IFBF = new FizzBuzzFlow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
        IFBF.getResult("five");
        
        //Then: ConvertString.getResult() will be called one time
        verify(mockConvertString, times(1)).getResult("five");
    }
    
    @Test
    public void givenStringFiveCallRangeValZeroTimes() {
    	//Given: I am a user
    	given(mockConvertString.getResult("0")).willReturn(false);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("");
        
    	//When: I enter the string five
    	IFizzBuzzFlow IFBF = new FizzBuzzFlow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
    	IFBF.getResult("five");
    	
    	//Then: ConvertString.getResult() will be called zero times
    	verify(mockRangeVal, times(0)).getResult(0);
    }
    
    @Test
    public void givenStringFiveCallGetFizzBuzzZeroTimes() {
    	//Given: I am a user
    	given(mockConvertString.getResult("0")).willReturn(false);
        given(mockRangeVal.getResult(0)).willReturn(false);
        given(mockGetFizzBuzz.getResult(0)).willReturn("");
        
    	//When: I enter the string five
    	IFizzBuzzFlow IFBF = new FizzBuzzFlow(mockConvertString, mockRangeVal, mockGetFizzBuzz);
    	IFBF.getResult("five");
    	
    	//Then: ConvertString.getResult() will be called zero times
    	verify(mockGetFizzBuzz, times(0)).getResult(0);
    }
}
