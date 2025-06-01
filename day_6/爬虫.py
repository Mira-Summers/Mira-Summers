from urllib.request import urlopen, Request
import os
import re

# 初始化变量
user_agent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Safari/537.36 Edg/130.0.0.0"
url = 'https://movie.douban.com/chart'
req = Request(url, headers={'User-Agent': user_agent})

# 获取网页内容
content = urlopen(req).read().decode('utf-8')

# 提取链接
links = re.findall(r'<img src="(.*?)".*?alt="(.*?)"', content)
print(links)
for link in links:
    # 确保链接有效
    if link:
        print(f'Processing: {link}')
        req = Request(link, headers={'User-Agent': user_agent})

# 创建保存目录
path = os.getcwd() + '/' + 'movie'
if not os.path.isdir(path):
    os.makedirs(path)

# 下载图片
for link ,alt in links:
    jpgname = f"{alt}.jpg".replace(' ', '_')   # 从链接中提取文件名
    req = Request(link, headers={'User-Agent': user_agent})
    with open(f'{path}/{jpgname}.jpg', 'wb') as f:
        f.write(urlopen(req).read())
        print(f"{jpgname}.jpg 下载完毕")

input("下载成功")






