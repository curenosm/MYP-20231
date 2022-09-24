# !/bin/bash

cd src
javac -sourcepath . -d ../target/ -cp .:../lib/* ./main/java/p03/Main.java
cd ../target
java -cp .:../lib/* main.java.p03.Main