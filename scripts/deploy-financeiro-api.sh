killall -9 financeiro-api
sudo chown -R ec2-user:ec2-user /home/ec2-user/projetos/financeiro-api
cd /home/ec2-user/projetos/financeiro-api
mvn clean install
screen -dm -S FINANCEIRO-API java -jar /home/ec2-user/projetos/financeiro-api/target/financeiro-api-0.0.1-SNAPSHOT.jar