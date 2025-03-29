CREATE TABLE User
(
    ID uuid UNIQUE PRIMARY KEY ,
    name CHARACTER(64),
    surname CHARACTER(64),
    email CHARACTER(128) UNIQUE,
    data DATE
)