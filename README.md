# testy-kontraktowe
Przykład do demonstracji testów kontraktowych z wykorzystaniem Pact JVM / Maven

## Przed szkoleniem

1. Upewnij się, że masz zainstalowane:

* Java JDK 8+
* InteliiJ IDEA Community Edition
* Git
* curl / Postman

2. Ściągnij **mockserver-netty-5.11.2-jar-with-dependencies.jar** ze strony [mock-server.com](https://mock-server.com/where/downloads.html)

3. Ściągnij / sklonuj kody z tego repozytorium

## Zadanie

Stwórz parę klient <-> serwer, która komunikuje się przez Rest API

![Alt text](kontrakt-uml.png?raw=true "Kontrakt UML")

**request**

```json
GET /userDetails
Headers:
   Accept: "application/json"`
```

**response**

```json
HTTP 200 OK
Headers:
   Content-type: "application/json"

{
    "firstName": "Jan",
    "lastName": "Kowalski",
    "age": 39
}

```
