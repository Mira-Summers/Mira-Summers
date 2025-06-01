import socket
import struct
ret =struct.pack('i',18334)
print(ret,type(ret))
phone=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
phone.bind(('127.0.0.1',8080))
phone.listen(5)
conn,addr=phone.accept()
#建立连接
msg=conn.recv(1024)
print(msg.decode('utf-8'))
back_msg=msg.decode('utf-8').upper()
conn.send(back_msg.encode('utf-8'))