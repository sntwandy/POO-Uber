from Python.account import Account


class Car:
    id = int
    licence = str
    driver = Account("", "")
    passenger = int

    def __init__(self, license, driver):
        super().__init__()
        self.license = license
        self.driver = driver
