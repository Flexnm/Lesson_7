package abstractions;

public class Intro {

	/*
	 * Types: primitives, Objects.
	 * 
	 * Objects: Class type Abstract class Interface Enum Those are different ways to
	 * create complex types.
	 * 
	 * Concrete class: + Is ready for use. + Can be used to create objects. + Can be
	 * used as reference.
	 * 
	 * 
	 * Abstract Class is assinged the symbol '#'. Abstract Class: - Is not ready for
	 * use. - Can not be used to create objects. + Can be used as reference.
	 * 
	 * 
	 * 
	 * 	
	 * 					Object
	 * 
	 * 
	 * 					Animal
	 * 
	 * 
	 * 	Mammal		 	Bird		 Insect
	 * 
	 * 
	 * Cow Cat Bat    Hawk Ostrich     Ant Butterfly
	 * 
	 * 
	 * Object a = new Cat()
	 * 
	 * a is a reference of type Object that points towards an object of type Cat.
	 * 
	 * Cat c = (Cat)a
	 * 
	 * c is a reference of type Cat that points towards an object of type Cat (the
	 * same Cat object that a points towards).
	 * 
	 * If the reference is of a more general type it is up-casting (and it is
	 * implicit). If the reference is of a more specific type it is down-casting
	 * (and it is explicit). Important to remember that the Objects have to be on
	 * the same line of inheritence. It can be checked by using: if(a instanceof
	 * Cat){ this checks for true or false. Cat c = (Cat) a; }
	 * 
	 * Can be seen with the logic of mathematical sets.
	 * 
	 * ============= All of these are true - this is polymorphism. a Cat is a Cat
	 * Cat m = new Cat() a Cat is a Mammal Mammal m = new Cat() a Cat is an Animal
	 * Animal m = new Cat() a Cat is an Object Object m = new Cat() up casting is
	 * "all 'new Object()' (what is to the right side) is also 'Object x' (what is to the left side)"
	 * - Object x = new Object() left right
	 * 
	 * If two objects are equals (.equals() >> true) = their hashCode is identical.
	 * If not, it doesnt mean that the hashCode is different.
	 * 
	 * ===============
	 * 
	 * Static - belongs to class. non-static (dynamic) - belongs to object.
	 * 
	 * When creating a class and an object: the the Stack the reference is created
	 * in the Heap - two things are created: 1) the Class itself 2) an instance of
	 * the Class (an Object) (below are inaccurate): The reference in the Stack
	 * points towards the instance of the Class. In the Heap, the Class is a
	 * "Class Object" that is static. The Instance of the Class, is an
	 * "Instance Object" that is non-static.
	 * 
	 */

}
