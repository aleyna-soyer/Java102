package Package3;

import Package4.Animal;

public class Package3Main {
	public void main(String[] args) {
		
		Animal animal=new Animal("ANIMAL");
		//could not acces it here because the access modifier is protected
		//System.out.println(animal.name);
	}

}
