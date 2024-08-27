package prjPokemon;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Instanciamento de classe
		Pokemon pikachu = new Pokemon("Pikachu", "Elétrico", 2, 25);
		Pokemon Arcanine = new Pokemon("Arcanine", "Fogo", 4, 50);
		Pokemon Dugtrio = new Pokemon("Dugtrio", "Terra", 6, 75);
		Pokemon Golduck = new Pokemon("Golduck", "Água", 8, 100);
		Pokemon Persian = new Pokemon("Persian", "Normal", 10, 125);
		
		pikachu.evoluir();
		pikachu.atacar();
		pikachu.exibirInfo();
		
		Arcanine.evoluir();
		Arcanine.atacar();
		Arcanine.exibirInfo();
		
		Dugtrio.evoluir();
		Dugtrio.atacar();
		Dugtrio.exibirInfo();
		
		Golduck.evoluir();
		Golduck.atacar();
		Golduck.exibirInfo();
		
		Persian.evoluir();
		Persian.atacar();
		Persian.exibirInfo();
		
	}

}