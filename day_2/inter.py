from collections.abc import Iterable
a={1,2,3,4}
print(isinstance(a,Iterable))
list1=[1,2,3,'a','b','c']
list_iter=list1.__iter__()
item=list_iter.__next__()
print(item)
item=list_iter.__next__()
print(item)
item=list_iter.__next__()
print(item)
item=list_iter.__next__()
print(item)
item=list_iter.__next__()
print(item)
item=list_iter.__next__()
print(item)
l=[i ** 2  for i in range(20) if i %2 ==0]
print(l)
ret=eval("2"+"2")
print(ret)
#打印的是字符串