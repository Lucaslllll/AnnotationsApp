# AppLearn

- This app will help me to training some skills in gui java

## About Project

- You can add annotations, list and modify them

## compile

- mvn compile exec:java


## create a AppImage to linux

- mvn package

- jpackage --input target/ \
         --name SisConsumer \
         --main-jar sis-consumer-1.0-SNAPSHOT.jar \
         --main-class com.mycompany.sis.consumer.SisConsumer \
         --type app-image


