from flask import Flask
from flask import render_template
from flask import request
import sqlalchemy
app = Flask(__name__)
@app.route('/')
def login():
    return login.html   #登录界面

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql://root:07162021@localhost/logindata'  # SQLite数据库
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False  # 关闭警告
db=sqlalchemy(app)
def do_login():#登录验证
    sql_login="select logindata where(uname='{uname}',passward='{upassward}';)"

@app.route('/login',method=['GET','POST'])
def login():
    if request.method=='POST':
        return do_login()
    else:
        return show_login_from()
if __name__ == '__main__':
    app.run(debug=True)
