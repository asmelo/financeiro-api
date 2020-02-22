sudo systemctl stop financeiro-api
cd /home/ec2-user/projetos/financeiro-api
mvn clean package
sudo systemctl start financeiro-api