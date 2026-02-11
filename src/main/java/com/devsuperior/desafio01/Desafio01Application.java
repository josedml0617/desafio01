package com.devsuperior.desafio01;

import java.util.Locale;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		
		Order order = new Order(5533, 120.00, 10.);
		OrderService os = new OrderService();
		System.out.println("Pedido código "+order.getId());
		System.out.println("Valor total: R$"+String.format("%.2f", os.total(order)));
		
	}
}
