<?php
  class Car {
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license, $driver){
      $this->license=$license;
      $this->driver=$driver;
  }

  public function printDataCar(){
      echo "la Licencia es: ".$this->license." El conductor es: ".$this->driver->name;
  }

  }
?>