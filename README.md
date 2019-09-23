# minis-service-sample

java -jar -Dserver.port=9092 -Dspring.cloud.consul.host=slc08acz.us.oracle.com -Dspring.cloud.consul.discovery.healthCheckPath=/rest/config/health demo2-1.0.jar

Startup Application:
java -jar -Dserver.port=9090 demo2-1.0.jar

Rest webservice:

Return all Employees
http://localhost:9090/rest/employees

Return employee by EmployeeID
http://localhost:9090/rest/employees/10006

POST(Insert)
{
"empNo":100000,
"birthDate":"1979-10-22",
"firstName":"Alex",
"lastName":"Chen",
"gender":"M",
"hireDate":"2012-04-10"
}