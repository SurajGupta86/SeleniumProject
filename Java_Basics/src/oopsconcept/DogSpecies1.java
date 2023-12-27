package oopsconcept;

public class DogSpecies1 extends Animal_InheritanceCode{   //Hierarchical Inheritance Animal Class having 2 sub class(DogSpecies & DogSpecies1).

	public void Type(String s) {
		System.out.println(s+" is a breed of a dog");
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal_InheritanceCode obj = new Animal_InheritanceCode();
		obj.Type("Bull Dog");         //(Call type method from DogSpecies since no method name "Type" in DogSpecies class Therefore, it prints from the Superclass Animal)
		//obj.Breed();  //Method exists in DogSpecies Class 
	}
}
