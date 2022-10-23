# !/bin/bash

cd src
javac -sourcepath . -d ../target/ -cp .:../lib/* ./p02/Main.java
cd ../target
java -cp .:../lib/* p02.Main