package com.api.enumclasse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class EnumclasseApplication {
	static Scanner scInt = new Scanner(System.in);
	static Scanner scString = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(EnumclasseApplication.class, args);
		clearConsole();

		int input;
		boolean continua = true;

		do {
			System.out.print(
				"===== Estados do Brasil =====\n" +
				"1. Nomes dos Estados\n" +
				"2. Capitais dos Estados\n" +
				"3. Estados das Regiões\n" +
				"4. Sair\n" +
				"\n\n" +
				"Opção: "
			);

			try {
				input = scInt.nextInt();
				clearConsole();

				switch (input) {
					case 1:
						nomesDosEstados();
						System.out.println();
						break;
					case 2:
						capitaisDosEstados();
						System.out.println();
						break;
					case 3:
						estadosDasRegioes();
						System.out.println();
						break;
					case 4:
						continua = false;
						break;
					default:
						System.out.println("Digite uma opção válida.\n");
						break;
				}
			} catch (Exception e) {
				System.out.println("Digite o número de uma opção válida.\n");
				scInt.next();
			}
		} while (continua);
	}

	static void nomesDosEstados() {
		String input;

		System.out.println("Digite o código de uma Unidade Federativa para ver seu nome por extenso.");
		UF.lista();
		System.out.print("\n\nOpção: ");
		input = scString.nextLine();

		if (!UF.existe(input)) {
			System.out.println("Não existe uma UF com esse código no Brasil.");
			return;
		}

		System.out.println(input.toUpperCase() + " - " + UF.valueOf(input.toUpperCase()).getNome());
	}

	static void capitaisDosEstados() {
		String input;

		System.out.println("Digite o código de uma Unidade Federativa para ver sua capital.");
		UF.lista();
		System.out.print("\n\nOpção: ");
		input = scString.nextLine();

		if (!UF.existe(input)) {
			System.out.println("Não existe uma UF com esse código no Brasil.");
			return;
		}

		System.out.println(input.toUpperCase() + " - " + UF.valueOf(input.toUpperCase()).getCapital());
	}

	static void estadosDasRegioes() {
		int input;

		System.out.print(
			"Selecione uma região para ver uma lista de seus estados.\n" +
			"1. Norte\n" +
			"2. Nordeste\n" +
			"3. Centro-Oeste\n" +
			"4. Sudeste\n" +
			"5. Sul\n" +
			"\n\n" +
			"Opção: "
		);

		try {
			input = scInt.nextInt();
			input--;
			for (int i = 0; i < Regiao.Regioes[input].length; i++) {
				System.out.println(Regiao.Regioes[input][i].getNome());
			}
		} catch (Exception e) {
			System.out.println("Digite o número de uma opção válida.");
		}
	}

	static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (System.getProperty("os.name").contains("Linux")
                    || System.getProperty("os.name").contains("Mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando não funciona no seu sistema operacional.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
