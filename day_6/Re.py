import re
print(re.findall('\w','wwaa'))#匹配字母或下划线
print(re.findall('\W','wwaa $'))
print(re.findall('\s','    d'))
print(re.findall('\S','ssss    fff'))
print(re.findall('\d','ddd,1123'))
print(re.findall('a.b','ad abb abe'))
print(re.findall('a?b','ab b'))