#!/bin/bash
sudo chown -R ec2-user:ec2-user /home/ec2-user/projetos/financeiro-api
cd /home/ec2-user/projetos/financeiro-api
sudo mvn clean install
sudo java -jar /home/ec2-user/projetos/financeiro-api/target/mfinanceiro-api-0.0.1-SNAPSHOT.jar