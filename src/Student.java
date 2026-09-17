// Student class will inherit Person class
// How to inherit: extends
// How many class can a class inherit: 1

// Student is the child class and Person is the parent class
// Student is the sub class and person is the super class
// Person is the base class
public class Student extends Person{
// Attributes are inherited - Not the private attributes
    // Setters and getters are inherited - Not the private methods
    // Methods are inherited - Not the private methods

    // Constructors are not inherited but you can use the constructors
    int student_id;
    double gpa;

    Student (){

    }
}
