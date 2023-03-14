public class LeapYear {

  public static void main(String[] args) {
    // The desired year to check.
    int year = 2024;

    String result;

    result =
      (
        (year % 4 == 0 && year % 100 != 0)
          ? "is a leap year."
          : (year % 400 == 0) ? "is a leap year." : "is not a leap year."
      );

    System.out.println(year + " " + result);
  }
}
