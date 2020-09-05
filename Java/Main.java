class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    Car car = new Car("AMG564", new Account("Darcy Bartolome", "Dar17"));
    car.printData();

    Car car2 = new Car("HJL778", new Account("Zeus Amenadiel", "Zes17"));
    car2.printData();
  }
}