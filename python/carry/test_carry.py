#coding=utf-8
import re
import urllib

def getHtml(url):
    page = urllib.urlopen(url)
    html = page.read()
    return html

def getImg(html):
#    reg = r'src="(.+?\.png)" pic_ext'
    reg = r'(?<=<img src=)"([^"]+\.*)"'
    imgre = re.compile(reg)
    imglist = re.findall(imgre,html)
#    return imglist
    x = 1
    for imgurl in imglist:
	print(imgurl)
	splitPath = imgurl.split('.')
        fTail = splitPath.pop()
	print fTail
#	fileName = name + "/" + str(number) + "." + fTail
# 	urllib.urlretrieve(imgurl,'upload/%s.jpg' % x)
        fileName =  "upload/" + str(x) + "." + fTail
	urllib.urlretrieve(imgurl,fileName)
        x+=1

html = getHtml("http://www.cnblogs.com/txw1958/articles/weixin-fangbei.html")
print getImg(html)



