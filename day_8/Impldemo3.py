class Dog:
    def __init__(self,name):
        self.name=name
    def game(self):
        print("%s蹦蹦跳跳地玩耍"%self.name)
class xiaotian(Dog):
    def game(self):
        print("%s飞到天上玩耍"%self.name)
class Person:
    def __init__(self,name):
        self.name=name
    def geme_dog(self,dog):
        print("%s和%s快乐地")