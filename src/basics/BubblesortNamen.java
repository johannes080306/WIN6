package basics;

public class BubblesortNamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String liste[] = { "Max", "Adrian", "Tom", "Felix", "Niko" };
		System.out.println("Unsortier: ");
		for (int a = 0; a < liste.length; a++) {

			System.out.println(liste[a]);
		}

		String temp;

		for (int j = 0; j < liste.length; j++) {
			for (int i = j + 1; i < liste.length; i++) {
				if (liste[i].compareTo(liste[j]) < 0) {
					temp = liste[j];
					liste[j] = liste[i];
					liste[i] = temp;
				}
			}
		}
		System.out.println("Sortiert: ");
		for (int a = 0; a < liste.length; a++) {

			System.out.println(liste[a]);
		}

	}
}