-- Criando o banco de dados para estudo
CREATE DATABASE empresa;
USE empresa;

-- Criando tabela de funcionários
CREATE TABLE funcionario (
    matricula INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT,
    salario DECIMAL(10,2),
    cod_departamento INT
);

-- Crie 10 funcionarios diferentes: 
INSERT INTO funcionario (nome, idade, salario, cod_departamento) 
VALUES 
    ('Ana Souza', 29, 3500.00, 1), 
    ('Rafael Oliveira', 30, 3600.00, 1), 
    ('Gustavo Fernandes', 45, 6000.00, 2), 
    ('Sara Almada', 32, 8000.00, 2), 
    ('Carlos Eduardo', 35, 4200.00, 2), 
    ('Mariana Silva', 27, 3100.00, 1), 
    ('João Pereira', 40, 5000.00, 3), 
    ('Fernanda Costa', 32, 3900.00, 2), 
    ('Lucas Almada', 25, 2800.00, 4), 
    ('Patrícia Ramos', 38, 4700.00, 3);

-- 1. Listar todas as colunas da tabela
-- Crie uma consulta que mostre todos os dados da tabela funcionario.
-- Dica: use o atalho que retorna todas as colunas de uma tabela sem precisar escrevê-las uma por uma.

SELECT * FROM `funcionario`;

-- 2. Listar apenas nome e salário dos funcionários
-- Crie uma consulta que retorne somente as colunas nome e salario de todos os funcionários cadastrados.

SELECT nome, salario FROM `funcionario`;

-- 3. Filtrar funcionários com salário maior que 4000
-- Liste o nome e o salário de todos os funcionários que ganham mais de R$ 4000,00.
-- O resultado deve mostrar apenas aqueles que atendem à condição.

SELECT nome, salario FROM `funcionario` WHERE salario > 4000;

-- 4. Filtrar funcionários com idade entre 25 e 35 anos
-- Crie uma consulta que mostre nome e idade dos funcionários que possuem idade entre 25 e 35 anos, inclusive.
-- Use operadores lógicos no WHERE.

SELECT nome, idade FROM `funcionario` WHERE idade >= 25 AND idade <= 35;

-- 5. Ordenar funcionários pelo salário em ordem decrescente
-- Liste nome e salario dos funcionários, mas mostre do maior salário para o menor.

SELECT nome, salario FROM `funcionario` ORDER BY `salario` DESC;

-- 6. Ordenar funcionários pelo departamento e depois pelo nome
-- Crie uma consulta que mostre nome e cod_departamento, ordenando primeiro pelo código do departamento (em ordem crescente).
-- Dentro de cada departamento, os nomes dos funcionários devem aparecer em ordem alfabética.

SELECT nome, cod_departamento FROM `funcionario` ORDER BY cod_departamento ASC, nome ASC;

-- 7. Mostrar apenas os 3 primeiros funcionários
-- Liste todos os dados da tabela funcionario, mas limite o resultado para apenas 3 registros.

SELECT * FROM `funcionario` LIMIT 3;

-- 8. Mostrar apenas os 2 funcionários mais novos (idade menor)
-- Liste nome e idade, mostrando apenas os dois funcionários mais jovens.
-- Dica: combine ORDER BY com LIMIT.

SELECT nome, idade FROM `funcionario` ORDER BY idade ASC LIMIT 2;

-- 9. Mostrar do 4º ao 6º funcionário da tabela
-- Liste todos os dados da tabela funcionario, mas pule os 3 primeiros registros e mostre
-- os próximos 3. Ou seja, resultados da posição 4 até 6.

SELECT * FROM `funcionario` LIMIT 3 OFFSET 3;

-- 10. Mostrar do 6º ao 10º funcionário com maior salário
-- Liste nome e salario, mostrando os funcionários do 6º ao 10º lugar no ranking de salários (do maior para o menor).
-- Dica: use ORDER BY salario DESC, junto com LIMIT e OFFSET.

SELECT nome, salario FROM `funcionario` ORDER BY salario DESC LIMIT 5 OFFSET 5;

-- 11. Listar todas as idades distintas
-- Crie uma consulta que mostre apenas as idades cadastradas na tabela funcionario,
-- sem repetir valores.

SELECT DISTINCT idade FROM `funcionario`;

-- 12. Listar todos os departamentos distintos dos funcionários
-- Liste os códigos de departamento (cod_departamento) que
-- existem na tabela funcionario, mas sem repetir valores.

SELECT DISTINCT cod_departamento FROM `funcionario`;