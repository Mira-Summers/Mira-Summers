import socket
s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
s.connect(('127.0.0.1',8080))
msg=input(">>>:")
s.send(msg.encode('utf-8'))
data=s.recv(1024).decode('utf-8')
print(data)