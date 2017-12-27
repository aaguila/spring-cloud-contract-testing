[![N|Solid](http://qajungle.com/wp-content/uploads/2016/01/logo2.png)](http://qajungle.com)

# Spring-cloud-contract-testing

Spring cloud contract testing project
[In progress]

### Blog post url
[In progress]

### Generate contract tests
```sh
./gradlew generateContractTests
```

### Build app and stubs
```sh
./gradlew clean install
```

### Test execution
For contract verifier (in each project):
```sh
./gradlew test
```

For remote contract verifier (in inventory-service):`
```sh
./gradlew -Dtest.single=InventoryService test 
```