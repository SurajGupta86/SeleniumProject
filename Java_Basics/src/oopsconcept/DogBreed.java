package oopsconcept;

public class DogBreed extends DogSpecies{ //multilevel inheritance  Animal_InheritanceCode-> DogSpecies->DogBreed
	
	public void Type(String s) {
		System.out.println(s+" is a breed of a dog");
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DogBreed obj = new DogBreed();
		obj.Type("Bull Dog");
		obj.Breed();  //Single Inheritance 

	}

}
