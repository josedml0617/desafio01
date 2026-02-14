# Desafio 01 – Componentes e Injeção de Dependência

## Sobre o projeto
Este repositório faz parte do curso **Spring Professional** da **DevSuperior** (Módulo 1).  
O **Desafio 01** foi proposto como **avaliação prática** para aplicar conceitos de **componentes no Spring** e **injeção de dependência** utilizando a anotação `@Autowired`.

O projeto não utiliza banco de dados nesta etapa. O foco é apenas **mapear os componentes com `@Service`** e realizar a **injeção automática** pelo Spring, garantindo o funcionamento da arquitetura básica.

---

## Desafio proposto

As imagens abaixo representam o **comando oficial do Desafio 01 – Componentes e Injeção de Dependência**, parte da **avaliação do primeiro módulo do curso Spring Professional da DevSuperior**:

<img width="853" height="215" alt="image" src="https://github.com/user-attachments/assets/0cefed63-7864-44c0-bbf4-03fd15242d63" />
<img width="848" height="318" alt="image" src="https://github.com/user-attachments/assets/dc6e0f5e-d98b-4fc0-b559-15ac8a69ef92" />
<img width="869" height="267" alt="image" src="https://github.com/user-attachments/assets/549aceba-4d1a-4946-9fc9-82f2382378af" />

## Minha implementação
**Classe OrderService**

``` java
@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public double total(Order order) {
		return order.getBasic()*(1-order.getDiscount()/100)+shippingService.shipment(order);
	}
}
```

**Classe ShippingService**

```java
@Service
public class ShippingService {
	
	public double shipment(Order order) {
		if(order.getBasic()<100.00) {
			return 20.00;
		}
		else if (order.getBasic()<200.00) {
			return 12.00;
		}
		else {
			return 0;
		}
	}
}
```
### Exemplo de execução

<img width="213" height="518" alt="image" src="https://github.com/user-attachments/assets/795546ff-af2e-4a4f-a903-b6737057c597" />

---

## Objetivos do desafio
- Criar componentes de serviço com a anotação `@Service`  
- Utilizar a anotação `@Autowired` para realizar a injeção de dependência  
- Testar a execução dos serviços de forma integrada  
- Consolidar os conceitos iniciais de **IoC (Inversion of Control)** e **DI (Dependency Injection)** no Spring Boot  

---

## Tecnologias utilizadas
<p align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" 
       alt="Java" width="30" height="30" title="Java"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" 
       alt="Spring Boot" width="30" height="30" title="Spring Boot"/>
</p>

---

## Objetivo pessoal
Este desafio foi desenvolvido como parte da **avaliação do primeiro módulo** do curso **Spring Professional** da DevSuperior.  
Serviu para consolidar conceitos fundamentais de **injeção de dependência** e **componentização**, preparando o terreno para desafios mais avançados com **JPA/Hibernate** e **modelagem de domínio**.

---

✍️ Projeto concluído — feito para estudo, prática e avaliação.
