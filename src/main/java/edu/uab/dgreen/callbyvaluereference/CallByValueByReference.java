/* callByValueReference - EE333 */
package edu.uab.dgreen.callbyvaluereference;

/** Demonstrate call by value and call by reference */
public class CallByValueByReference {

  /** @param args the command line arguments */
  public static void main(String[] args) {
    int i = 10;
    String s = "this is initial string";
    var dObj = new DemoObject(i, s);
    theMethod(i, s, dObj);
    System.out.println("Back to main");
  }

  /*
   * A demo function
   * @param aInt is the int value being passed (not a reference)
   * @param aString is a reference to the string object
   * @param dObject is a reference to an object of type DemoObject
   */
  public static void theMethod(int anInt, String aString, DemoObject dObject) {
    System.out.println("in theFunction");
    anInt = 0; // changes the int value that was received
    aString = "new string"; // the reference value is changed to refer to a different object

    /* the reference to the object is unchanged but a part of the object is changed */
    dObject.setDemoInt(11); //
    dObject.setDemoString("New String in Object");
  }
}
