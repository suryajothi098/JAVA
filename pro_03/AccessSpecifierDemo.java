class Student
{
    private String name = "MUNEESWARI";      // Private
    int rollNo = 17;                       // Default
    protected int marks = 96;              // Protected
    public String college = "XYZ College"; // Public

    public void display()
    {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks   : " + marks);
        System.out.println("College : " + college);
    }
}

public class AccessSpecifierDemo
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.display();
    }
}
