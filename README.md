##About
This repo is dedicated to simple code examples that use Arquillian in tests, along with spock, gradle, and Java EE
technologies (JPA/CDI/EJB, to name a few). Each top-level folder contain one example with main features indicated by the
folder name. For example, the folder weld-cdi-spock contains an example that uses Java CDI technology with Weld as the
implementation and spock as the test framework. Of cource, the tests will be run with ArquillianSputnik. (Don't know
what ArquillianSputnik is? Check [this](https://github.com/arquillian/arquillian-testrunner-spock) out.

##Instruction
It is quite easy to check if these examples actually work. Take the weld-cdi-spock folder for example:
    
    $ cd /some/path/arquillian-examples/weld-cdi-spock
    $ ./gradlew test

That's it. 
