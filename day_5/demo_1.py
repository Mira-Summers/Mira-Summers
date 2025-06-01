def sum(n):
    sum_total=0
    for i in range(1,1+n):
        sum_total+=i
    return sum_total
print(sum(100))

def move_books(n):
    if n==1:
        print("搬走最后一本书")
    else:
        print(f"搬走第{n}本书")
        move_books(n-1)

move_books(7)

def move(n,A,B,C):
    if n==1:
        print(A,"-->",C)
    else:
        #将n-1个全部移动到B上
        move(n-1,A,C,B)
        print(A,"-->",C)
        move(n-1,B,A,C)
n=int(input("输入层数"))
move(n,'A','B','C')

l = [2,3,5,10,15,16,18,22,26,30,32,35,41,42,43,55,56,66,67,69,72,76,82,83,88]
aim=int(input("请输入一个数"))
num=0
def func(l,aim):
    global num
    num+=1
    mid=(len(l)-1)//2
    if l:
        if aim>l[mid]:
            func(l[mid+1:],aim)
        elif aim<l[mid]:
            func(l[:mid-1],aim)
        elif aim==l[mid]:
            print(f"已经找到，查找了{num}次")
        else:
            print("没有这个数")
func(l,aim)