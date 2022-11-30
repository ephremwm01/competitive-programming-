import java.util.Scanner;
import java.util.Arrays;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int n = input.nextInt();
String[] array = new String[n];
for (int i = 1; i <=n; i++) {
  boolean fizz = i % 3 == 0;
  boolean buzz = i % 5 == 0;
  if (buzz && fizz) {
    array[i-1] = "fizzbuzz";}
  else if (fizz) {
    array[i-1] = "fizz";}
  else if (buzz) {
    array[i-1] = "buzz"; } 
  else{
    array[i-1] = String.valueOf(i); }
   }
System.out.println(Arrays.toString(array));
  }
 }
