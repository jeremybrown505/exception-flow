package edu.cnm.deepdive;

public class ExceptionDemo {

  public static void main(String[] args) {
    try {
      System.out.println("Trying...");
      throw new RuntimeException("Testing the message");
    } catch (RuntimeException e) {
      System.out.println("Catching...");
      System.out.println(e.getMessage());
      throw e;
    } finally {
      System.out.println("Finally...");
    }
  }

}
