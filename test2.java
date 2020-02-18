// Create a MyClass class
public class test2 {
    int x; // Create a class attribute

    // Create a class constructor for the MyClass class
    public test2() {
        x = 5; // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        test2 myObj = new test2(); // Create an object of class MyClass (This will call the constructor)
      System.out.println(myObj.x); // Print the value of x
    }
  }
  
  // Outputs 5