class HouseItem:
    def __init__(self,name,area):
        self.name=name
        self.area=area
    def __str__(self):
        return "[%s] 占地面积 %.2f "%(self.name,self.area)
bed=HouseItem("床",2)
chest=HouseItem("衣柜",2)

class House:
    def __init__(self,house_type,area):
        self.house_type=house_type
        self.area=area
        self.free_area=area
        self.item_list=[]
    def add_item(self,item):
        print(f"要添加的家具{item}")
        if item.area>self.free_area:
            print("%s面积太大，不能添加到房子中"%item.name)
    def __str__(self):
        return (f"户型：{self.house_type}\n总面积：{self.area}\n剩余面积：{self.free_area}")