import requests

# r = requests.get('https://xkcd.com/353/')
# r = requests.get('https://imgs.xkcd.com/comics/python.png')

payload = {'count': 24, 'paging': 1}
r = requests.get('https://techmart.bg/%D0%A2%D0%B5%D0%BB%D0%B5%D0%B2%D0%B8%D0%B7%D0%BE%D1%80%D0%B8/paging/0', params=payload)

# payload = {'username': 'user', 'password': 'testing'}
# r = requests.post('https://httpbin.org/post', data=payload)
# print(r.text)
# print(r.content)

# r = requests.get('https://httpbin.org/basic-auth/corey/testing', auth=('corey', 'testing'))
# print(r)



# with open('comic.png', 'wb') as f:
# 	f.write(r.content)

print(r.status_code)
print(r.ok)
# print(r.headers)
print(r.text)
# print(r.json())
#
# r_dict = r.json()
# print(r_dict['form'])