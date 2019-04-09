# micros-sample1
First Sample "helloWorld" for OpenAPIv3 using OpenLiberty v18.0.0.3

Demonstration how to generate swagger free stubs out of a openAPI V3 yaml. Have a look to the pom.xml how to use openapi-generator. 


## Run

To start the Open Liberty server you can use this maven command:

```
mvn install liberty:start-server
```

Try the Jax-RS `/helloworld` endpoint:

```
http://localhost:9080/helloworld/alice
http://localhost:9080/helloworld/bob
```

The OpenAPI specification is available at:

```
http://localhost:9080/openapi
```

A UI for this OpenAPI Specification is available at:

```
http://localhost:9080/openapi/ui
```

When you are done stop Open Liberty with:

```
mvn liberty:stop-server
```
