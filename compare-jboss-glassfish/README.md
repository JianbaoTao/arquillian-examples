##About
This repository `compare-jboss-glassfish` is intended to investigate the difference between Glassfish and JBoss/WildFly
in terms of robustness, speed, and complexity of project configurations when they are used together with Arquillian for
testing.

## Run the tests

Below are commands to run the tests for various configurations. Current status is marked if not success.

```
# run glassfish 4 embedded with Java EE 7 API
./gradlew test     

# run glassfish 4 remote with Java EE 7 API (outcome unknown, to be investigated)
./gradlew test -Premote

# run glassfish 3 embedded with Java EE 6 API (outcome unknown, to be investigated)
./gradlew test -Pjee6

# run glassfish 3 remote with Java EE 6 API (outcome unknown, to be investigated)
./gradlew test -Premote -Pjee6

# run wildfly 8 embedded with Java EE 7 API (currently failing)
./gradlew test -Pjboss     

# run wildfly 8 remote with Java EE 7 API (outcome unknown, to be investigated)
./gradlew test -Pjboss -Premote

# run JBoss EAP 6.1 embedded with Java EE 6 API (outcome unknown, to be investigated)
./gradlew test -Pjboss -Pjee6

# run JBoss EAP 6.1 remote with Java EE 6 API (outcome unknown, to be investigated)
./gradlew test -Pjboss -Premote -Pjee6
```

