FROM openjdk
WORKDIR  /sam
COPY  . /sam
RUN javac Test.java
CMD ["java","Test"]