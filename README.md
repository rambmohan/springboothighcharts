# Spring boot, MySQL and Highcharts

Bunch of examples on Spring boot and Highcharts

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

4. Highcharts library - latest

5. jQuery library - latest

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/scbushan05/spring-boot-highcharts.git
```

**2. Create Mysql database**

```bash
create database analytics
```

**3. Run the script file**

```bash
Run the script file queries.sql attached to the project
```

**4. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**5. Build and run the app using maven**

```bash
mvn package
java -jar target/highcharts-0.0.1-SNAPSHOT.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following Highcharts

1. Line chart

2. Multiple line chart

3. Pie chart

## Learn more

You can find the tutorial for this application on my blog -

<https://bushansirgur.in/web-technologies/spring-boot-and-highcharts/>


Post Man:
http://localhost:8080/searchChatGPT
body:
{
"query":"how to get DBS account"
}


Graph:
http://localhost:8080/


==========================================
1) 
logging CGP console"
select compute engine
create new vpc
give name
allow full access
allow http
create button

2) once created then click ssh

sudo apt-get update

3) install git:

sudo apt-get install git -y

4) install mvn:

sudo apt-get install git -yq maven

5) configure ip tables:

sudo iptables -t nat -A PREROUTING -p tcp --dport 80 -j REDIRECT --to-port 8080

6)
export GCLOUD_PROJECT ="$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/project/project-id)"

7)
check java version
java --version

8)
clone from hithub

git clone https://github.com/rambmohan/sayHello.git

9) 
create a soft link
ln -s ~/spring-boot-hello-world-example/src/main/java/com/javatpoint  ~/devenv

10)
mvn clean install -DskipTests

11)
mvn spring-boot:run

12) Test
http://34.136.74.31/cmd?name=rama
http://34.136.74.31:8080/cmd?name=rama

