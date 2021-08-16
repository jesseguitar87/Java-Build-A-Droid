public class Droid {

  int batteryLevel;
  int name;
  public Droid(String droidName) {
    batteryLevel = 100;
  }

  public String toString() {
    return "Hello, I'm the droid: " + name;
  }

  public void performTask(String task) {
    System.out.println("Codey is performing task: " + "dancing");
    batteryLevel--;
  }

  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    System.out.println(codey.name);
    codey.performTask("dancing");
    codey.performTask("levitating");
  }
}
