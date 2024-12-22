
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM alpine:latest

CMD ["/bin/sh"]
# Utiliser l'image OpenJDK comme base
FROM openjdk:17-jdk-alpine

# Définir le répertoire de travail
WORKDIR /app

# Copier le fichier JAR généré dans le conteneur
COPY target/MicroServices-1.0-SNAPSHOT.jar /app/Microservices_Patient.jar


# Exposer le port sur lequel le service écoute
EXPOSE 8087

# Commande pour lancer l'application
ENTRYPOINT ["java", "-jar", "/app/Microservices_Patient.jar"]
