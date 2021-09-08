CREATE  DATABASE Jaegers;
\c jaegers;
CREATE TABLE Jaegers (id serial primary key, modelName text, mark text, height decimal, weight decimal, status text, origin text, launch integer, kaijuKill integer);