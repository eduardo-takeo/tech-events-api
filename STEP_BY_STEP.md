# Step-by-step Guide

1. Create ***domain*** package, and create entities inside
2. Create ***repositories*** package, and create repositories inside
3. Fill ***application.properties*** file with database connection data
4. Create folder src/resources/db/migration and create the first migration (create table)
5. Install flyway dependency on pom.xml
6. Initialize Postgres db (via docker preferably)
7. Create DTOs inside each entity (use Record instead of Class)
8. Under api package -> create services folder and create Services (http methods)
9. 