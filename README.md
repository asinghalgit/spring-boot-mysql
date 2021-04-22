##### PreRequisite

##### Run mysql docker container via following command
```
sudo docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=test -e MYSQL_USER=sa -e MYSQL_PASSWORD=root -d mysql:latest
```

##### Endpoints exposed by this application
```
curl localhost:5001/user/all
curl localhost:5001/user/add -d name=First -d email=someemail@someemailprovider.com
```

##### Command to build and run docker image for this application
```
mvn clean install
sudo docker build -t spring-boot-mysql .
sudo docker run -p 5001:5001 --link mysql-standalone:mysql -d spring-boot-mysql
```