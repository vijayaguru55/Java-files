/* 
 * 8) Write a program to demonstrate the functionalities of static keyword.
 */
public class Q8 {
    static class Student{
        String name;
        int rollNo;
        static String college = "IIT"; //the college name is same for all students ,
                                //its also affect memory,so we can make this as a static variable 

        Student(String name,int roll){
            this.name=name;
            this.rollNo = roll;
        }

    }
    int k=5; 
    static int a=10;

    public void istanceMethod(){        //instance method
        System.out.println("Instance method Invoked");
    }

    public static void _staticMethod(){ //static method
        System.out.println("Static Method INvoked ");
    }
    public static void main(String[] args) {
        Q8 q = new Q8();
        System.out.println("K ="+ q.k + "is a instace variable");//we need object creation to access the instance variables and methods
        System.out.println("a = "+a+" is a class varible or static variable");
        q.istanceMethod();//Calling instance method only by object of the class

        _staticMethod();//we can access static method and variables directly ,without of object
        Student s = new Student("Vijay", 141);
        System.out.println(s.name+"   "+s.rollNo);
    }
}
