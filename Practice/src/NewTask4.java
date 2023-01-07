public class NewTask4 {
  public static void main(String[] args) {
    // Use a StringBuffer to store the even and odd numbers
    StringBuffer evenNumbers = new StringBuffer("Even Numbers: ");
    StringBuffer oddNumbers = new StringBuffer("Odd Numbers: ");

    // Use a single loop to iterate from 1 to 100
    for (int i = 1; i <= 100; i++) {
      // Check if the number is even or odd
      if (i % 2 == 0) {
        evenNumbers.append(i + ", ");
      } else {
        oddNumbers.append(i + ", ");
      }
    }

    // Print the even and odd numbers
    System.out.println(evenNumbers);
    System.out.println(oddNumbers);
  }
}
