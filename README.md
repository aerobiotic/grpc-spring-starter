A quick and dirty hello world implemtation using grpc-spring-boot as it relates to a stack overflow answer for:

https://stackoverflow.com/questions/71184542/running-grpc-server-and-client-in-junit-test-sometimes-leads-to-a-deadlock

stack_over.proto is from that post and is a contrived scenario for the purposes of discussion of the problem.  

In the above there was a question about integration tests for grpc. 

Below is a description of how to implement integration tests when using grpc-spring-boot.

https://yidongnan.github.io/grpc-spring-boot-starter/en/server/testing.html#integration-tests

And this project is my taking that information and appling it to:
# learn something about grpc-spring-boot
# hopefully help answer the stack overflow question and help the person asking it.
