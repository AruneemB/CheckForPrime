import java.util.Random;
public class CheckForPrime
{
    public static boolean checkPrime(int number)
    {
        if(number <= 1) return false;
        if(number == 2 || number == 3) return true;
        if(number % 2 == 0 || number % 3 == 0) return false;
        for(int i = 5; i * i <= number; i+= 6)
        {
            if(number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        //Segment of code to generate 100 random integers between 1 and 1000
        //Saves it to an array of integers to check
        Random random = new Random();
        int [] integersToCheck = new int[100];
        for(int i = 0; i < integersToCheck.length; i++)
        {
            integersToCheck[i] = random.nextInt(1000) + 1;
        }

        //Segment of code to individually check each integer to see if it is prime or composite
        for(int i = 0; i < integersToCheck.length; i++)
        {
            if(checkPrime(integersToCheck[i])) System.out.println("Number " + (i + 1) + ": " + integersToCheck[i] + " is prime.");
            else System.out.println("Number " + (i + 1) + ": " + integersToCheck[i] + " is composite.");
        }
    }
}