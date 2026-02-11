package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;

public class OrderService {

	private ShippingService shippingService;
	
	public double total(Order order) {
		return order.getBasic()*(1-order.getDiscount()/100)+shippingService.shipment(order);
	}
}
