# REST API

## Save Employee:

```
$ curl -H "Content-Type: application/json" -X POST -d '{"name": "Arpit","address": {"city": "Delhi","zipCode": "10098"}}' http://localhost:8000/employee/save
```

## List All

```
$ curl -X GET http://localhost:8000/employee/list/
```


## List One
```
$ curl -X GET http://localhost:8000/employee/list/1
```
