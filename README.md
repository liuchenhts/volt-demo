# OAuth2 + Kafka Demo
* OAuth2 password grant type
* Get Access Token
* Use Access Token to call an api to send event to Kafka topic with 3 partitions
* Implemented 3 consumers to consume Kafka topic in a load balancing semantics


# How to run the Demo
* git clone the repo
* run runKafka.sh to start the Kafka service (make sure docker-compose installed)
* run runApp.sh to start the demo application (demo app context path is http://localhost:8030/volt)
* run the below curl command (or use postman) to get access token
    *curl -X POST -u "client:password" -d "grant_type=password&username=user&password=secret" http://localhost:8030/volt/oauth/token
* put the access token in the http header as bearer token to call api to send event to Kafka topic (use the below curl command with the latest access code)
    *curl -X GET --url http://localhost:8030/volt/v1/resource/producer?message=17 --header 'authorization: Bearer ae8e9433-be9a-4563-9eed-cb2bbad9a4b8'
* the demo app console will show the 3 processors to consume the events in load balancing way
