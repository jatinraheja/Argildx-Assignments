import java.util.*;
class Student
{
   int id;
   String name;
   Student(int id,String name)
   {
      this.id = id;
      this.name = name;
   }
   static boolean isEqual(Student obj1,Student obj2)
    {
        if(obj1.id==obj2.id && obj1.name.equals(obj2.name))
          return true;
       return false;
    }
 public static void main(String args[])
 {

     Student s1 = new Student(Integer.valueOf(args[0]),args[1]);
     Student s2 = new Student(Integer.valueOf(args[2]),args[3]);
      
     if(isEqual(s1,s2))
     System.out.println("Both the objects are equal");
    else
      System.out.println("Both the objects are not equal");
 }
} 