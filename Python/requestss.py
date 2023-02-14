import requests

request = requests.get('https://pippo.com/')
print(request.text)
if request.status_code == 200:
    print("Request is ok")
else:
    print("Request is not ok")