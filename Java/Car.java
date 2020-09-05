class Car {
  Integer id;
  String license;
  Account driver;
  private Integer passenger;

  void printData() {
    if (this.passenger != null) {
      System.out.println("Driver: " + driver.name);
      System.out.println("License: " + license);
      System.out.println("Passengers: " + passenger);
      System.out.println("----------------------------");
    }
  }

  public Car(String license, Account driver) {
    this.license = license;
    this.driver = driver;
  }

  public Integer getPassenger() {
    return passenger;
  }

  public void setPassenger(Integer passenger) {
    if (passenger == 4) {
      this.passenger = passenger;
    } else {
      System.out.println("You need to assing 4 passengers");
    }
  }
}
