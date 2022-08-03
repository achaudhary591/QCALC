package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalcApplication.class, args);
			System.out.println("Hello world!");

			StandardCalculator calc = new StandardCalculator();
			calc.multiply(4,4);
			//System.out.println(calc.getResult());
			calc.printResult();

			LogicCalculator calc1 = new LogicCalculator();
			calc1.OR(8, 6);
			calc1.printResult();

	}

}
