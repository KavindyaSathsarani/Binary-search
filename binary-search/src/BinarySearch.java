import java.util.Scanner;

class BinarySearch {

    public static void main(String[] args) {
      int counter, num, item, array[], first, last, middle;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = input.nextInt();
      array = new int[num];
      System.out.println("Enter " + num + " integers");
      //Loop to store each numbers in array
      for (counter = 0; counter < num; counter++)
        array[counter] = input.nextInt();
    }
    
}
