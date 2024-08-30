-- Creating smartphone Model table
--(Must be executed after "databaseCreationSmartphoneScript.sql" and "databaseCreationSystemUserScript.sql")

-- This script can be used directly on PostgreSQL or here, with runner tools

CREATE TABLE SystemUser(
    id SERIAL PRIMARY KEY,
    name VARCHAR(30) not null,
    email VARCHAR(50) not null unique,
    password VARCHAR(20) not null
);

select * from SystemUser