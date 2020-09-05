class Car {
  private Integer id;
  private String license;
  private Account driver;
  protected Integer passenger;

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

  // ID
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  // License
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  // Driver
  public Account getDriver() {
    return driver;
  }

  public void setDriver(Account driver) {
    this.driver = driver;
  }
}
