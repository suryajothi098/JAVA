interface Student
{
    void display();
}

class Details implements Student
{
    @Override
    public void display()
    {
        System.out.println("Student Details");
        System.out.println("================");
        System.out.println("Name       : MUNEESWARI");
        System.out.println("Roll No    : 25");
        System.out.println("Marks 1    : 93");
        System.out.println("Marks 2    : 84");
        System.out.println("Percentage : 88.8%");
    }
}

public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Details obj = new Details();
        obj.display();
    }
}
