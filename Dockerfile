FROM anapsix/alpine-java:8_server-jre
# 将jar包copy到容器里
COPY target/*.jar app.jar
RUN bash -c 'touch /app.jar'
# 为了缩短 Tomcat 启动时间，添加一个系统属性指向 “/dev/urandom” 作为 Entropy Source
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]