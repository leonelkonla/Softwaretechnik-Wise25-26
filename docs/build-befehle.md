#Build-Befehle Übersicht

## Setup
java -version
mvn -version
git clone https://github.com/leonelkonla/Softwaretechnik-Wise25-26
cd softwaretechnik-projekt

## Standard-Workflows

### Clean Build
mvn clean package

### Tests ausführen
mvn test

### Anwendung bauen
mvn package

### Anwendung ausführen
mvn javafx:run

## Build-Zeiten
Clean Build: ca. 10 Sekunden
Nur Tests: ca. 15 Sekunden
