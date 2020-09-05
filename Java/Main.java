class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    UberX uberX = new UberX("AMG564", new Driver("Darcy Bartolome", "Dar17", null, null), "Tesla", "Model 3");
    uberX.setPassenger(4);
    uberX.printData();

    /*
     * Car car2 = new Car("HJL778", new Account("Zeus Amenadiel", "Zes17"));
     * car2.printData();
     */
  }
}