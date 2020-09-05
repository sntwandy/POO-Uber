class Account:
    id = int
    name = str
    document = str
    email = str
    password = str

    def __init__(self, name, document):
        super().__init__()
        self.name = name
        self.document = document
