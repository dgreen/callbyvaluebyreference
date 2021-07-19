/*
 * Author: David Green <DGreen@uab.edu>
 * Assignment:  callByValueReference - EE333
 */
package edu.uab.dgreen.callbyvaluereference;

/** Demo Objects */
public class DemoObject {
  private int demoInt;
  private String demoString;

  public DemoObject(int i, String s) {
    demoInt = i;
    demoString = s;
  }

  public int getDemoInt() {
    return demoInt;
  }

  public void setDemoInt(int demoInt) {
    this.demoInt = demoInt;
  }

  public String getDemoString() {
    return demoString;
  }

  public void setDemoString(String demoString) {
    this.demoString = demoString;
  }
}
