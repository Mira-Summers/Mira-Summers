import time
print(time.time())
print(time.strftime('%Y-%m-%d %X'))
print(time.localtime(time.time()))

#格式化时间->结构化时间
ft=time.strftime('%Y/%m/%d %H:%M:%S')
st=time.strptime(ft,'%Y/%m/%d %H:%M:%S')
print(st)

ft=time.strftime('%Y/%m/%d %H:%M:%S',st)
print(ft)
