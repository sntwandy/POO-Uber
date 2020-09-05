<?php
  require_once('Car.php');
  require_once('UberX.php');
  require_once('UberPool.php');
  require_once('Account.php');

  $uberX = new UberX("SDF789", new Account("Darcy Bartolome", "DAR"), "Tesla", "Model 3");
  $uberX->printDataCar();

  $uberPool = new UberPool("HGT097", new Account("Atenas Elizabeth", "ELI"), "Tesla", "Model S");
  $uberPool->printDataCar();
?>