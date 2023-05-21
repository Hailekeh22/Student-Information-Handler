
package abs;

abstract class person{
       String name;
       int id;
       char gender;
       String departmnet;
    abstract public void display();
    
    public void getinput(String n, int i , char g, String d){
        name = n;
        id = i;
        gender = g;
        departmnet = d;
    }
    
}

class student extends person { 
    double gpa;
    int creditcompleted;
    public void studdata(double g, int c ) {
        gpa = g;
        creditcompleted = c;
    }
   
      public void display(){
        System.out.println("______Student Information______");
        System.out.println("This Student Name is " + name );
        System.out.println("This Student Departmnet is " + departmnet );
        System.out.println("This Student gpa is " + gpa );
        System.out.println("This Student Credit Hour Completed is is " + creditcompleted );
        System.out.println("This Student id is " + id );
        System.out.println("This Student Gender is " + gender );
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_* ");

 
    }
}

public class Abs {

    public static void main(String[] args) {
        student a = new student();
        a.getinput("Alex",1234,'M',"Computer SCience");
        a.studdata(3.97, 234);
        a.display();
        
        student b = new student();
        b.getinput("marry",9867,'F',"Information Systems");
        b.studdata(3.27, 254);
        b.display();
        
        student c = new student();
        b.getinput("benjamin",1878,'M',"Information Technology");
        b.studdata(3.25, 294);
        b.display();
        
        student d = new student();
        d.getinput("simon", 1231, 'M', "Nursing");
        d.studdata(3.25, 294);
        d.display();
    }
    
}