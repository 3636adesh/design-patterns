package com.example;

import com.example.app.DwarvenGoldmineFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class FacadeApplication {

	public static void main(String[] args) {
		var facade = new DwarvenGoldmineFacade();
		facade.startNewDay();
		facade.digOutGold();
		facade.endDay();
	}

}
