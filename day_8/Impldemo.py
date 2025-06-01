class Animals:
    def __init__(self,name,age,sex):
        self.name=name
        self.age=age
        self.sex=sex
    def speak(self):
        print(f"{self.name}大声地叫")

class Dog(Animals):
    def __init__(self,dog_name,dog_age):
        self.dog_name=dog_name
        self.dog_age=dog_age
    def speak(self):
        print(f"{self.dog_name}吠")
class Cat(Animals):
    pass
class Preson(Animals):
    def __init__(self,name,age,job,sex):
        super().__init__(name,age,sex)
        self.job=job
dog=Dog("狗",500)
dog.speak()