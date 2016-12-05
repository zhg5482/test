url = 'http://i.qq.com/'
data = {'name': 'username','password': '123456'}
post_data = urllib.urlencode(data) 
req = urllib2.Request(url, post_data)
response = urllib2.urlopen(req)
page_content = response.read()
