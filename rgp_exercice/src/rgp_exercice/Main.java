package rgp_exercice;

public class Main {
	public static void main(String[]  args) {
		personnage personnage= new personnage();		
		System.out.println(personnage.point_de_vie);
		personnage.attaqué(160);
		System.out.println(personnage.point_de_vie);
		personnage.recevoir_soins(150);
		System.out.println(personnage.point_de_vie);
	}
}
