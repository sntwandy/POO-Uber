class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    UberX uberX = new UberX("AMG564", new Driver("Darcy Bartolome", "Dar17"), "Tesla", "Model 3");
    uberX.setPassenger(4);
    uberX.printData();

    UberVan uberVan = new UberVan("GEH870", new Driver("Atenas Elizabeth", "ELI"));
    uberVan.setPassenger(6);
    uberVan.printData();
    /*
     * Car car2 = new Car("HJL778", new Account("Zeus Amenadiel", "Zes17"));
     * car2.printData();
     */
  }
}