public class Person {
    double height;
    int age;
    String color;
    String name;
    double weight;

    Person(){
        //default constructors can be empty
        height = 48;
        age = 18;
        color = "black";
        name = "";
        weight = 140;
    }

    Person(double height, int age, String color, String name, double weight){
        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }
}