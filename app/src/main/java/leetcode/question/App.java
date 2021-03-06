/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode.question;

import java.io.File;

public class App {

  public static void main(String[] args) {
    var resource = Thread.currentThread()
        .getContextClassLoader()
        .getResource("text.txt");

    if (resource != null) {
      var file = new File(resource.getPath());
      System.out.println(resource.getPath());
      System.out.println(file.exists());
      System.out.println(new App().getGreeting());
    } else {
      System.out.println("Resource is null");
    }
  }

  public String getGreeting() {
    return "Hello World!";
  }
}
