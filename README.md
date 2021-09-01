# IndigitalCustomer

#Levantar el proyecto con docker-compose:

1 desde el parent hacer mvn clean install -DskipTests
2 vamos a ir a los proyectos a construir las imagenes 
  adminServer --> mvn dockerfile:build
  configServer --> mvn dockerfile:build
  customer       --> mvn dockerfile:build
  eureka             --> mvn dockerfile:build
3 ) Vamos donde tenemos el docker compose y ejecutamos:
      docker-compose up -d registry-discovery---->levanta en http://localhost:8761/
      docker-compose up -d configuration ----> levanta en http://localhost:8888/
     *acá ya se puede ejecutar* docker-compose up -d o sseguimos servicio por servicios
      docker-compose up -d administration---->levanta en http://localhost:8762/
      docker-compose up -d customer ----> levanta en http://localhost:8081/swagger-ui/


     

