# !/bin/bash
echo "ENTRANDO EN FASE DE VERIFICACION DE FORMATO DE CODIGO"
[ -d ".run-google-java-format" ] && [ ! -L ".run-google-java-format" ] || make
make check-format > .run-google-java-format/check_format.log 
make reformat > .run-google-java-format/reformat.log

echo "ENTRANDO EN FASE DE COMPILACION"
cd src
javac -sourcepath . -d ../target/ -cp .:../lib/* ./main/java/p04/Main.java
cp -r ./main/resources ../target/main/

echo "ENTRANDO EN FASE DE EJECUCION"
cd ../target
java -cp .:../lib/* main.java.p04.Main