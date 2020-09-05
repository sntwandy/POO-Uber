class Car {
  Integer id;
  String license;
  Account driver;
  Integer passenger;

  void printData() {
    System.out.println("Driver: " + driver.name);
    System.out.println("License: " + license);
    System.out.println("Passengers: " + passenger);
    System.out.println("----------------------------");
  }

  public Car(String license, Account driver) {
    this.license = license;
    this.driver = driver;
  }
}
