class Car {
  constructor(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
  }

  printData() {
    console.log(`Driver: ${this.driver.name}, License: ${this.license}`);
  }
}
