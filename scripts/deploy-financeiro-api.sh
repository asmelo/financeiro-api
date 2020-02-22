sudo -b service financeiro-api stop
cd /home/ec2-user/projetos/financeiro-api
mvn clean package
sudo chmod 500 /home/ec2-user/projetos/financeiro-api/target/financeiro-api-0.0.1-SNAPSHOT.jar
sudo -b service financeiro-api start