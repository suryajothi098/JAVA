public class ExceptionDemo
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception: " + e);
        }

        try
        {
            int a[] = {1, 2, 3};
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception: " + e);
        }

        try
        {
            System.out.println(Integer.parseInt("ABC"));
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number Format Exception: " + e);
        }

        System.out.println("Program executed successfully.");
    }
}
