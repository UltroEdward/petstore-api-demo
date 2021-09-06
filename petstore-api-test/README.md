# petstore-rest-assured

The testing framework for petstore service: https://petstore.swagger.io/

### Tools
Used tools/frameworks:
* Spring
* REST Assured
* jUnit4
* Lombok
* OpenAPI generator [maven plugin](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-maven-plugin) - generates client models and api source
* AssertJ generator [maven plugin](https://github.com/assertj/assertj-assertions-generator-maven-plugin) - generates typed assertions for client models

### Run
Run tests:

- `mvn clean test`

Specify website:

- `mvn clean test -Dbase.uri="https://some.new.site"`


Specify scenario filters:

- `mvn clean test -Dcucumber.filter.tags="not @bug"`

### Test reports
Cucumber html report generated at `.\target\cucumber-report.html`