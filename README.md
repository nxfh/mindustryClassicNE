![Imgur](https://i.imgur.com/JBJt6Y7.png)

A modded version of an old, classic version of the pixelated sandbox tower defense game known as [Mindustry](https://github.com/Anuken/Mindustry).

### Building

First, make sure you have Java 8 and JDK 8 installed. Open a terminal in the root directory, and run the following commands:


**_Windows_**

_Running:_ `gradlew.bat desktop:run`  
_Building:_ `gradlew.bat desktop:dist`


**_Linux_**

_Running:_ `./gradlew desktop:run`  
_Building:_ `./gradlew desktop:dist`

Gradle may take up to several minutes to download files. Be patient. <br>
After building, the output .JAR file should be in `/desktop/build/libs/` and should be named as `desktop-nE.jar`.
