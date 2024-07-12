import requests

url = "https://vast-dusk-16065.herokuapp.com/memes"

payload="{\r\n\"name\": \"ashok kumar\",\r\n\"url\": \"https://images.pexels.com/photos/3573382/pexels-photo-3573382.jpeg\",\r\n\"caption\": \"This is a meme\"\r\n}"
headers = {
  'Content-Type': 'application/json'
}

response = requests.request("GET", url, headers=headers, data=payload)

print(response.text)
