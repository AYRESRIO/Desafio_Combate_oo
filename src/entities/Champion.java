package entities;

public class Champion {

	private String nameChamp1, nameChamp2;
	private int lifeChamp1, lifeChamp2;
	private int attackChamp1, attackChamp2;
	private int armorChamp1, armorChamp2, i;

	public Champion(String name, int life, int attack, int armor, int i) {
		if (i == 0) {

			nameChamp1 = name;
			lifeChamp1 = life;
			attackChamp1 = attack;
			armorChamp1 = armor;
			this.i = i;

		} else if (i == 1) {

			nameChamp2 = name;
			lifeChamp2 = life;
			attackChamp2 = attack;
			armorChamp2 = armor;
			this.i = i;

		}

	}

	public int getLifeChamp1() {
		return lifeChamp1;
	}

	public void setLifeChamp1(int lifeChamp1) {
		this.lifeChamp1 = lifeChamp1;

	}

	public int getArmorChamp1() {
		return armorChamp1;
	}

	public int getAttackChamp2() {
		return attackChamp2;
	}

	public int getLifeChamp2() {
		return lifeChamp2;
	}

	public void setLifeChamp2(int lifeChamp2) {
		this.lifeChamp2 = lifeChamp2;

	}

	public int getArmorChamp2() {
		return armorChamp2;
	}

	public int getAttackChamp1() {
		return attackChamp1;
	}

	public String getNameChamp1() {
		return nameChamp1;
	}

	public String getNameChamp2() {
		return nameChamp2;
	}

}
