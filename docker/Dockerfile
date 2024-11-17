FROM openjdk:11-jre-slim

RUN mkdir ms-product-app

EXPOSE 8080

COPY ./*.jar ms-product-cid/product-app.jar

CMD java -jar ms-product-cid/product-app.jar