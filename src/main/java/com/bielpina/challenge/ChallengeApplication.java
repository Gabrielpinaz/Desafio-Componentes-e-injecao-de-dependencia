package com.bielpina.challenge;

import com.bielpina.entities.Order;
import com.bielpina.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.bielpina"})
public class ChallengeApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("(dados do pedido: código, valor básico, porcentagem de desconto)%n");
		System.out.println();
		Integer code = sc.nextInt();
		System.out.println();
		double basic = sc.nextDouble();
		System.out.println();
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.println();
		System.out.printf("Pedido código %d%n", code);
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));
	}
}
