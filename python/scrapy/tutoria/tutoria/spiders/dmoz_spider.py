import scrapy

class DmozSpider(scrapy.Spider):
	name = "dmoz"
	allowed_domains = ["dmoz.org"]
	start_url = [
			"http://www.dmoz.org/Computers/Programming/Languages/Python/Books/",
			"http://www.dmoz.org/Computers/Programming/Languages/Python/Books/"]

#	def parse(self,response):
#		filename = response.url.split("/")[-2]
#		with open(filename,'wb') as f:
#			f.write(response.body)

	def parse(self,reponse):
		for sel in response.xpath('//ul/li'):
			title = sel.xpath('a/text()').extract()
			link = sel.xpath('a/@href').extract()
			desc = sel.xpath('text()').extract()
			print (title)
			print(link)
			print(desc)
