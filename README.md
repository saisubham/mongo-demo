# mongo-demo

## Requirements
- Docker
- Java 17

## Setup
- Pull and run mongo docker image
  ```shell
  docker run  -d --name mongo \
  -e MONGO_INITDB_ROOT_USERNAME=user \
  -e MONGO_INITDB_ROOT_PASSWORD=pass \
  -p 27017:27017 mongo:7.0.0
  ```
- Build the app
  ```shell
  ./gradlew clean build
  ```
- Run the app
  ```shell
  java -jar ./build/libs/mongo-demo-0.0.1-SNAPSHOT.jar
  ```
- Make a curl request to enter a user in mongo db
  ```shell
  curl -X POST --location "http://localhost:8080/persons" \
    -H "Content-Type: application/json" \
    -d "{
          \"name\": \"john\"
        }"
  ```
