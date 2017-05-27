FROM openjdk
RUN echo "Buidling simple Docker image for hello-service"
VOLUME /tmp
ADD target/hello-service-0.0.1-SNAPSHOT.jar /hello-service.jar
RUN sh -c 'touch /hello-service.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /hello-service.jar" ]
