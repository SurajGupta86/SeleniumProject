package oopsconcept;

public class DogSpecies extends Animal_InheritanceCode {      //Single Level Inheritance Animal_InheritanceCode->DogSpecies
	public void Breed() {
		System.out.println("Breed: Bull Dog");
	}
	
	public void Type1(String s) {
		System.out.println(s+" is a type of an animal");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_InheritanceCode obj = new Animal_InheritanceCode();
		obj.Type("Dog");  //Single Inheritance 
	}

}
