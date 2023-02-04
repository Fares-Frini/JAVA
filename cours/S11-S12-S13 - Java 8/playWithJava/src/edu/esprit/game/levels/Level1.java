package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import edu.esprit.game.utils.Data;

import java.util.List;

public class Level1 {
	public static void main(String[] args) {
		List<Employee> employees = Data.employees();

		/* TO DO 1: Afficher tous les employés */
		employees.stream().forEach(/* TO DO 1 */);

		/*
		 * TO DO 2: Afficher les employés dont le nom commence par la lettre n
		 */
		employees.stream().filter(/* TO DO 2 */).forEach(/* TO DO 2 */);

		/*
		 * TO DO 3: Afficher les employés dont le nom commence par la lettre n
		 * et le salaire> 1000
		 */
		employees.stream().filter(/* TO DO 3 */).filter(/* TO DO 3 */)
				.forEach(/* TO DO 3 */);

		/*
		 * TO DO 4: Afficher les employés dont le nom commence par la lettre s
		 * triés par salaire
		 */
		employees.stream().filter(/* TO DO 4 */).sorted(/* TO DO 4 */)
				.forEach(/* TO DO 4 */);

		/*
		 * TO DO 5: Afficher les noms des employés dont le salaire > 600 avec 2
		 * maniéres différentes
		 */
		/* First Way */
		employees.stream().filter(/* TO DO 5 */).forEach(/* TO DO 5 */);
		/* Second Way */
		employees.stream().filter(/* TO DO 5 */).map(/* TO DO 5 */)
				.forEach(/* TO DO 5 */);

		/*
		 * TO DO 6: Ajouter 200 D pour les employés dont le nom commence avec m
		 * et les affichés ensuite
		 */
		employees.stream().filter(/* TO DO 6 */).forEach(/* TO DO 6 */);

	}
}
