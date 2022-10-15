package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		String player;
		int i;

		Champion champ1 = null, champ2 = null;

		Scanner sc = new Scanner(System.in);

		for (i = 0; i <= 1; i++) {

			if (i == 0) {
				player = "primeiro";
			} else {
				player = "segundo";
			}

			System.out.println("Digite os dados do " + player + " campeão: ");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Vida inicial: ");
			int life = sc.nextInt();
			System.out.print("Ataque: ");
			int attack = sc.nextInt();
			System.out.print("Armadura: ");
			int armor = sc.nextInt();
			sc.nextLine();

			if (i == 0) {

				champ1 = new Champion(name, life, attack, armor, i);

			} else if (i > 0) {

				champ2 = new Champion(name, life, attack, armor, i);

			}
		}

		System.out.print("Quantos turnos deseja executar ? ");

		int shift = sc.nextInt();
		int j = 0;

		for (j = 1; j <= shift; j++) {

			if (champ1.getLifeChamp1() > 0 && champ1.getArmorChamp1() < champ2.getAttackChamp2()) {

				champ1.setLifeChamp1(champ1.getLifeChamp1() - (champ2.getAttackChamp2() - champ1.getArmorChamp1()));

			} else if (champ1.getLifeChamp1() > 0 && champ1.getArmorChamp1() >= champ2.getAttackChamp2()) {
				champ1.setLifeChamp1(champ1.getLifeChamp1() - 1);
			}

			if (champ2.getLifeChamp2() > 0 && champ2.getArmorChamp2() < champ1.getAttackChamp1()) {

				champ2.setLifeChamp2(champ2.getLifeChamp2() - (champ1.getAttackChamp1() - champ2.getArmorChamp2()));

			} else if (champ2.getLifeChamp2() > 0 && champ2.getArmorChamp2() >= champ1.getAttackChamp1()) {

				champ2.setLifeChamp2(champ2.getLifeChamp2() - 1);
			}
			
			if (champ1.getLifeChamp1() <= 0 && champ2.getLifeChamp2()>0) {

				System.out.println("Resultado do " + j + "º turno: ");
				champ1.setLifeChamp1(0);
				System.out.println();
				System.out.println(champ1.getNameChamp1() + ": " + champ1.getLifeChamp1()+ " de vida (Morreu.)");
				System.out.println(champ2.getNameChamp2() + ": " + champ2.getLifeChamp2()+ " de vida.");
				System.out.println();
				System.out.println("FIM DO COMBATE!");
				j = shift;

			} else if (champ2.getLifeChamp2()<= 0 && champ1.getLifeChamp1()>0) {

				System.out.println("Resultado do " + j + "º turno: ");
				champ2.setLifeChamp2(0);
				System.out.println();
				System.out.println(champ2.getNameChamp2() + ": " + champ2.getLifeChamp2() + " de vida (Morreu.)");
				System.out.println(champ1.getNameChamp1() + ": " + champ1.getLifeChamp1() + " de vida.");
				System.out.println();
				System.out.println("FIM DO COMBATE!");
				j = shift;

			}
			
            if(champ1.getLifeChamp1()<=0 && champ2.getLifeChamp2()<=0) {
				
				System.out.println("Resultado do " + i + "º turno: ");
				champ1.setLifeChamp1(0);
				champ2.setLifeChamp2(0);
				System.out.println();
				System.out.println(champ2.getNameChamp2() + ": " + champ2.getLifeChamp2() + " de vida (Morreu.)");
				System.out.println(champ1.getNameChamp1() + ": " + champ1.getLifeChamp1() + " de vida.(Morreu.)");
				System.out.println();
				System.out.println("FIM DO COMBATE!");
				i = shift;
				
			}
			if (champ1.getLifeChamp1() > 0 && champ2.getLifeChamp2() > 0) {
				System.out.println("Resultado do " + j + "º turno: ");
				System.out.println();
				System.out.println(champ1.getNameChamp1() + ": " + champ1.getLifeChamp1() + " de vida.");
				System.out.println(champ2.getNameChamp2() + ": " + champ2.getLifeChamp2() + " de vida.");
				System.out.println();
			}

		}
		if(j>shift && champ1.getLifeChamp1()>0 && champ2.getLifeChamp2()>0) {
			
			System.out.println("FIM DO COMBATE");
		}
	

		sc.close();
}
}




