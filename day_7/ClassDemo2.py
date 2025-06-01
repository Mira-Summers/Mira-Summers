import time

class Soldier:
    def __init__(self,name,gun=None):
        self.name=name
        self.gun=gun

    def fire(self):
        if self.gun is None:
            print(f"{self.name}还没有枪，快去捡一把....")
        else:
            print(f"冲啊{self.name}")
            if self.gun.bullet_count<=0:
                print("枪里没有子弹了，快装弹")
                self.gun.add_buller(50)
                self.gun.shoot()


class Gun:
    def __init__(self,model):
        self.model=model
        self.bullet_count=0

    def add_buller(self,count):
        print("装弹中.....")
        time.sleep(1)
        self.bullet_count+=count

    def shoot(self):
        if self.bullet_count<=0:
            print("没有子弹了快装弹")
            return
        self.bullet_count-=1
        print(f"{self.model}发射子弹,剩余子弹{self.bullet_count}")
ak47=Gun("AK47步枪")
ak47.add_buller(44)
ak47.shoot()
ak47.shoot()

abc=Soldier('soldier1',ak47)
abc.fire
