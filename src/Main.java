//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //created two person object
        Person p1 = new Person();

//        Person p2 = new Person(72, 25, "Black", "Barack Obama", 170);
//        System.out.println(p2.name);
        Person p2 = new Person(72, 70);
        System.out.println(p2.age);

        Person p3 = p2.Call_Private();

        Student s1 = new Student();
        s1.age = 20;
        s1.gpa = 4.00;
        System.out.println(s1.gpa);

        Instructor i1 = new Instructor(5.9, 30, 2343);
        i1.height = 5.9;
        i1.age = 30;
        i1.EID = 2343;
        System.out.println(i1.height + "" + i1.age + "" + i1.EID);
    }
}