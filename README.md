This demo application is a back-end microservice.
It integrates with Twitch New API.
The data fetched, is exposed through its own REST API interface.

The following API calls are available.
* Get Top Games [api reference](https://dev.twitch.tv/docs/api/reference#get-top-games)
* Get Streams [api reference](https://dev.twitch.tv/docs/api/reference#get-streams)

Following design and technologies have been used.
Category | Details
------------ | -------------
Containers Orchestration | [Amazon Elastic Kubernetes Service](https://aws.amazon.com/eks/) , [kubernetes](https://kubernetes.io/)
Container Compute | [AWS Fargate](https://aws.amazon.com/fargate/) 
Container Image Registry | [Amazon Elastic Container Registry](https://aws.amazon.com/ecr/)
Container Tools | [Jib](https://github.com/GoogleContainerTools/jib), 
Architecture | [microservice](https://en.wikipedia.org/wiki/Microservices) 
Frameworks | [Spring Boot](https://spring.io/projects/spring-boot)
Language | [Java](https://www.oracle.com/java/)
Build Tools | [Gradle](https://gradle.org/)

