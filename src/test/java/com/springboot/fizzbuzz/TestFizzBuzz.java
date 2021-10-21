package com.springboot.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fizzbuzz.GetFizzBuzz;
import fizzbuzz.IGetFizzBuzz;

public class TestFizzBuzz {
    @Test
    public void Given1Get1() {
        //Given: I am a user
        //When: I enter the integer 1
        IGetFizzBuzz IGBF = new GetFizzBuzz();
        String result = IGBF.getResult(1);
        //Then: I get back the string "1"
        assertEquals("1", result);
    }

    @Test
    public void Given2GetOneTwo() {
        //Given: I am a user
        //When: I enter the integer 2
        IGetFizzBuzz IGBF = new GetFizzBuzz();
        String result = IGBF.getResult(2);
        //Then: I get back the string "1,2"
        assertEquals("1,2", result);
    }

    @Test
    public void Given3GetOneTwoFizz() {
        //Given: I am a user
        //When: I enter the integer 3
        IGetFizzBuzz IGBF = new GetFizzBuzz();
        String result = IGBF.getResult(3);
        //Then: I get back the string "1,2,Fizz"
        assertEquals("1,2,Fizz", result);
    }

    @Test
    public void Given5GetOneTwoFizzFourBuzz() {
        //Given: I am a user
        //When: I enter the integer 5
        IGetFizzBuzz IGBF = new GetFizzBuzz();
        String result = IGBF.getResult(5);
        //Then: I get back the string "1,2,Fizz,4,Buzz"
        assertEquals("1,2,Fizz,4,Buzz", result);
    }
    
    @Test
    public void Given6GetOneTwoFizzFourBuzzFizz() {
        //Given: I am a user
        //When: I enter the integer 6
        IGetFizzBuzz IGBF = new GetFizzBuzz();
        String result = IGBF.getResult(6);
        //Then: I get back the string "1,2,Fizz,4,Buzz,Fizz"
        assertEquals("1,2,Fizz,4,Buzz,Fizz", result);
    }
    
    @Test
    public void Given10GetStringEndingInBuzz() {
        //Given: I am a user
        //When: I enter the integer 10
        IGetFizzBuzz IGBF = new GetFizzBuzz();
        String result = IGBF.getResult(10);
        //Then: I get back the string ending in Buzz
        assertEquals(true,result.endsWith("Buzz"));
    }
    
    @Test
    public void Given15GetStringEndingInFizzBuzz() {
        //Given: I am a user
        //When: I enter the integer 15
        IGetFizzBuzz IGBF = new GetFizzBuzz();
        String result = IGBF.getResult(15);
        //Then: I get back the string ending in FizzBuzz
        assertEquals(true,result.endsWith("FizzBuzz"));
    }
    
    @Test
    public void Given30GetStringEndingInFizzBuzz() {
        //Given: I am a user
        //When: I enter the integer 30
        IGetFizzBuzz IGBF = new GetFizzBuzz();
        String result = IGBF.getResult(30);
        //Then: I get back the string ending in FizzBuzz
        assertEquals(true,result.endsWith("FizzBuzz"));
    }
}

