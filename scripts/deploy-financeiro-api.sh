#!/bin/bash
cd /home/ec2-user/projetos/financeiro-api
sudo mvn clean install
sudo java -jar /home/ec2-user/projetos/financeiro-api/target/financeiro-api-0.0.1-SNAPSHOT.jar