#!/bin/bash

MODE=$1

./mvnw package

if [ "$MODE" = "server" ]; then
    :
else
    if [ "$MODE" = "client" ]; then
        true
    else
        echo "Introduzca un modo de ejecucion (client/server)"
        exit 1
    fi
    
fi

java -jar ./target/proyecto_1-0.0.1-executable.jar $MODE
