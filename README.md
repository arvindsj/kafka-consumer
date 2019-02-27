# kafka-consumer
kafka consumer in springboot

Prerequsites:
1) Install Kakfa and start 
2) Create a topic "weborders_1"
3) Using command line or using a producer application, input this json
{"name":"apples","description":"crispy apples","units":"20","price":"1.5"}

Synopsys:
This application is a Kafka consumer application built in Springboot.
It consumes the FACT from the topic and inserts into the In-Memory database (H2)
