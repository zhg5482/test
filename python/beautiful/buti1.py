from bs4 import BeautifulSoup

html = """
<html><head><title>The Dormouse's story</title></head>
<body>
<p class="title" name="dromouse"><b>The Dormouse's story</b></p>
<p class="story">Once upon a time there were three little sisters; and their names were
<a href="http://example.com/elsie" class="sister" id="link1"><!-- Elsie --></a>,
<a href="http://example.com/lacie" class="sister" id="link2">Lacie</a> and
<a href="http://example.com/tillie" class="sister" id="link3">Tillie</a>;
and they lived at the bottom of a well.</p>
<p class="story">...</p>
"""
soup = BeautifulSoup(html,'html.parser')
#结构化输出
print(soup.prettify())

#soup.title
#--- <title>The Dormouse's story</title>

#soup.title.name
#--- u'title'

#soup.title.string
#--- u'The Dormouse's story'

#soup.title.parent.name
#--- u'head'

#soup.p
#--- <p class="title">The Dormouse's story</p>

#soup.p['class']
#--- u'title'

#soup.a
#<a class="sister" href="http://example.com/elsie"></a>

#soup.find_add('a')
#多个a 标签

#soup.find(id="link3")
#搜索id = link3的标签

#从文档中找到所有<a>标签的链接
for link in soup.find_all('a'):
	    print(link.get('href'))
	        # http://example.com/elsie
		    # http://example.com/lacie
		        # http://example.com/tillie

#从文档中获取所有文字内容
print(soup.get_text())
# The Dormouse's story
#
# The Dormouse's story
#
# Once upon a time there were three little sisters; and their names were
# Elsie,
# Lacie and
# Tillie;
# and they lived at the bottom of a well.
#
# ...

