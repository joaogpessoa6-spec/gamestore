## Estagio de compilação
## imagem do Linux para compilar o projeto
FROM ubuntu:latest AS build

## instalar o Java
RUN apt-get update
RUN apt-get install -y openjdk-21-jdk maven

## instalar o maven
RUN apt-get install -y maven

## COPY do projetopara o container
COPY . .

## compilar o projeto com o maven

RUN mvn clean install

## Execução do projeto
FROM eclipse-temurin:21-jdk-jammy

## Expor a porta 8080
EXPOSE 8080

## COpiar o Arquivo JAR da compilação para container de execusão
COPY --from=build /target/gamestore-0.0.1-SNAPSHOT.jar app.jar

## Definir o comando de inicialização do container
ENTRYPOINT ["java", "-jar", "app.jar"]