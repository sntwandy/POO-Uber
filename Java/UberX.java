class UberX extends Car {
  String brand;
  String model;

  public UberX(String license, Account driver, String brand, String model) {
    super(license, driver);
    this.brand = brand;
    this.model = model;
  }

  @Override
  void printData() {
    // TODO Auto-generated method stub
    super.printData();
    System.out.println("Model: " + this.model + " Brand: " + this.brand);
  }
}
