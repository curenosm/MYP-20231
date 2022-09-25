# !/bin/bash
echo "ENTRANDO EN FASE DE VERIFICACION DE FORMATO DE CODIGO"
make
make check-format > .run-google-java-format/check_format.log 
make reformat > .run-google-java-format/reformat.log
rm -rdf .run-google-java-format

echo "ENTRANDO EN FASE DE COMPILACION"
cd src
javac -sourcepath . -d ../target/ -cp .:../lib/* ./main/java/p03/Main.java

echo "ENTRANDO EN FASE DE EJECUCION"
cd ../target
java -cp .:../lib/* main.java.p03.Main