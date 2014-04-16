##About
This repository `compare-jboss-glassfish` is intended to investigate the difference between Glassfish and JBoss/WildFly
in terms of robustness, speed, and complexity of project configurations when they are used together with Arquillian for
testing.

##Status Tracker Matrix

           |GF 4 (JEE 7) | WF 8 (JEE 7) | GF 3 (JEE 6) | JBoss EAP 6.1 (JEE 6) |
-----------|-------------|--------------|--------------|-----------------------|
Embedded   |PASS         | FAIL         | TBD          | TBD                   |
Remote     |TBD          | TBD          | TBD          | TBD                   |

###Notes
  1. According to references below  
http://stackoverflow.com/questions/20895332/arquillian-wildfly-embedded  
http://blog.progs.be/585/wildfly-integration-arquillian-maven  
Embedded WildFly is problematic to be used with Arquillian for testing. Therefore, the investigation for using embedded
WildFly + Arquillian is suspended indefinitely.

## Run the tests

Below are commands to run the tests for various configurations. Current status is marked if not success.

```
# run glassfish 4 embedded with Java EE 7 API
./gradlew test     

# run glassfish 4 remote with Java EE 7 API
./gradlew test -Premote

# run glassfish 3 embedded with Java EE 6 API
./gradlew test -Pjee6

# run glassfish 3 remote with Java EE 6 API
./gradlew test -Premote -Pjee6

# run wildfly 8 embedded with Java EE 7 API
./gradlew test -Pjboss     

# run wildfly 8 remote with Java EE 7 API
./gradlew test -Pjboss -Premote

# run JBoss EAP 6.1 embedded with Java EE 6 API
./gradlew test -Pjboss -Pjee6

# run JBoss EAP 6.1 remote with Java EE 6 API
./gradlew test -Pjboss -Premote -Pjee6
```


