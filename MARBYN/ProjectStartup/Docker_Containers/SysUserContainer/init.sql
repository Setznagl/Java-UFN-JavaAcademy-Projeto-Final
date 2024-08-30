CREATE TABLE SysUser (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(30) NOT NULL,
                          email VARCHAR(50) NOT NULL UNIQUE,
                          password VARCHAR(20) NOT NULL
);

INSERT INTO SysUser (name, email, password) VALUES
    ('TesteUser', 'TesteEmail', '12345');
