package prjZoologico;

public class Aplicacao {

	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.atributoNome = "Dumbo";
		elefante.atributoRaca = "Africano";
		elefante.atributoSexo = "Macho";
		elefante.atributoPeso = 170;

		ClasseAnimal girafa = new ClasseAnimal("Cleide", "Russa", "Femia", 50);

		SubclasseCarnivoros leao = new SubclasseCarnivoros();

		leao.atributoNome = "Simba";
		leao.atributoRaca = "Australiano";
		leao.atributoSexo = "Neutro";
		leao.atributoPeso = 123;

		elefante.exibirInfo();

		elefante.metodoComer();

		elefante.exibirInfo();

		girafa.exibirInfo();

		System.out.println(elefante.atributoNome);
		System.out.println(elefante.atributoPeso);

		elefante.metodoComer();
		System.out.println(elefante.atributoNome);
		System.out.println(elefante.atributoPeso);

	}

}
