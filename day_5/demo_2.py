import json
data={
    "name":"Mira",
    "age":18,
    "hobby":"games"
}
data_string=json.dumps(data)
print(data_string)