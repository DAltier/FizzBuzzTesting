package com.springboot.fizzbuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fizzbuzz.AppConfig;
import fizzbuzz.IFizzBuzzFlow;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
		AppConfig app = new AppConfig();
		IFizzBuzzFlow test = app.createFizzBuzzFlow();
		System.out.println("I am a user. When I enter the string 0, FizzBuzz test flow returns " + test.getResult("0"));
		System.out.println("I am a user. When I enter the string 1, FizzBuzz test flow returns " + test.getResult("1"));
		System.out.println("I am a user. When I enter the string 2, FizzBuzz test flow returns " + test.getResult("2"));
		System.out.println("I am a user. When I enter the string 3, FizzBuzz test flow returns " + test.getResult("3"));
		System.out.println("I am a user. When I enter the string 5, FizzBuzz test flow returns " + test.getResult("5"));
		System.out.println("I am a user. When I enter the string 6, FizzBuzz test flow returns " + test.getResult("6"));
		System.out.println("I am a user. When I enter the string 10, FizzBuzz test flow returns " + test.getResult("10"));
		System.out.println("I am a user. When I enter the string 15, FizzBuzz test flow returns " + test.getResult("15"));
		System.out.println("I am a user. When I enter the string 30, FizzBuzz test flow returns " + test.getResult("30"));
		System.out.println("I am a user. When I enter the string 300, FizzBuzz test flow returns " + test.getResult("300"));
		System.out.println("I am a user. When I enter the string 400, FizzBuzz test flow returns " + test.getResult("400"));
		System.out.println("I am a user. When I enter the string five, FizzBuzz test flow returns " + test.getResult("five"));
	}

}
