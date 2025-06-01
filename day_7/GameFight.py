class GameRole:
    def __init__(self,name,ad,hp,weapon=None):
        name=self.name
        ad=self.ad
        hp=self.hp
        weapon=self.weapon
    def attack(self,p1):
        p1.hp-=self.ad
        print("%s攻击了%s,使其掉了%s血，还剩%s血"%self.name,p1.name,)