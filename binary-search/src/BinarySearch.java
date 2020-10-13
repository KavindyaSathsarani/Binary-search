import java.util.Scanner;

class BinarySearch {

    public static void main(String[] args) {
      int counter, num, item, array[], first, last, middle;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = input.nextInt();
      array = new int[num];
      item = input.nextInt();
      first = 0;
      last = num - 1;
      middle = (first + last)/2;
      System.out.println("Enter " + num + " integers");
      for (counter = 0; counter < num; counter++)
      array[counter] = input.nextInt();
    }
    
}
