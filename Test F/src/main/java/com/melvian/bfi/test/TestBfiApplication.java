package com.melvian.bfi.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.melvian.bfi.test.Entity.Cities;
import info.debatty.java.stringsimilarity.Levenshtein;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

//@SpringBootApplication
public class TestBfiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TestBfiApplication.class, args);
		FindByCityName();
	}

	public static void FindByCityName(){
		Scanner scan = new Scanner(System.in);
		ObjectMapper mapper = new ObjectMapper();
		Levenshtein lv = new Levenshtein();
		String country = "ID";

		try {
			Cities[] city = mapper.readValue(new URL("https://raw.githubusercontent.com/lutangar/cities.json/master/cities.json"), Cities[].class);

			System.out.println("Type City Name: ");
			String input = scan.nextLine();

			for (Cities cities : city){
				if(cities.getCountry().equals(country) && lv.distance(cities.getName(), input)<=5 ){
					System.out.println(cities.getName());
				}
			}


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
