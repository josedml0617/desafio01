package com.devsuperior.desafio01;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=3;i++) {
		System.out.println("-----------------------------");
		System.out.println("EXEMPLO "+i);	
			
		System.out.println("==========ENTRADA==========");
		System.out.print("Código: ");
		int id = sc.nextInt();
		System.out.print("Valor básico: ");
		double basic = sc.nextDouble();
		System.out.print("Porcentagem de Desconto: ");
		double discount = sc.nextDouble();
		System.out.println();
		
		Order order = new Order(id, basic, discount);
		
		System.out.println("===========SAÍDA===========");
		System.out.println("Pedido código "+order.getId());
		System.out.println("Valor total: R$ "+String.format("%.2f", orderService.total(order)));
		System.out.println("-----------------------------");
		System.out.println();
		}
		sc.close();
	}
}
