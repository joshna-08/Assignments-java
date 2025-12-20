import java.util.ArrayList;
class Student
{
      private String name;
      private int age;
      public String getName()
{

return name;
}
public void setName(String name)
{
this.name = name;
}
public int getAge()
{
return age;
}
public void setAge(int age)
{
this.age = age;
}
public Student(String name,int age)
{
super();
this.name = name;
this.age = age;
}
}
public class ExampleForArrayList{
public static void main (String[] args)
{
Student s1 = new Student("Joshna",20);
Student s2 = new Student("pandu",16);
ArrayList a = new ArrayList();
a.add(s1);
a.add(s2);
for(Object i : a)
{
System.out.println(i);
}
}
}

