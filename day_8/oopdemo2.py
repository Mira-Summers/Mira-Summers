class Student(object):
    __num=0
    def __init__(self,name,age):
        self.name=name
        self.age=age
        Student.addnum()#调用类方法
    @classmethod
    def addnum(cls):
        cls.__num+=1
    @classmethod
    def getnum(cls):
        return cls.__num
Student("张三",19)
Student("李四",18)
print(Student.getnum())


class MyClass:
    @staticmethod
    def static_Method():
        return "static_method"
    
print(MyClass.static_Method())