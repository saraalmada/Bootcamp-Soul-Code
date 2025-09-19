CREATE TABLE vendas (
    id_venda INT AUTO_INCREMENT PRIMARY KEY,
    produto VARCHAR(100) NOT NULL,
    quantidade INT NOT NULL,
    preco_unitario DECIMAL(10,2) NOT NULL,
    data_venda DATE NOT NULL
);

-- Inserindo registros de exemplo 
INSERT INTO vendas (produto, quantidade, preco_unitario, data_venda) VALUES
('Notebook', 2, 3500.00, '2025-01-10'),
('Notebook', 1, 3600.00, '2025-01-15'),
('Mouse', 5, 80.00, '2025-01-12'),
('Mouse', 3, 75.00, '2025-02-01'),
('Teclado', 4, 150.00, '2025-02-05'),
('Teclado', 2, 160.00, '2025-02-07'),
('Monitor', 1, 1200.00, '2025-02-10'),
('Monitor', 2, 1100.00, '2025-03-02'),
('Cadeira Gamer', 1, 950.00, '2025-03-05'),
('Cadeira Gamer', 3, 980.00, '2025-03-08'),
('Headset', 6, 200.00, '2025-03-10'),
('Headset', 4, 220.00, '2025-03-12');

--Exercício 1: COUNT() Liste a quantidade de vendas realizadas para cada produto. (NÃO USAR GROUP BY)
SELECT
    (SELECT COUNT(quantidade) FROM vendas WHERE produto = 'Notebook') AS Notebook,
    (SELECT COUNT(quantidade) FROM vendas WHERE produto = 'Mouse') AS Mouse,
    (SELECT COUNT(quantidade) FROM vendas WHERE produto = 'Teclado') AS Teclado,
    (SELECT COUNT(quantidade) FROM vendas WHERE produto = 'Monitor') AS Monitor,
    (SELECT COUNT(quantidade) FROM vendas WHERE produto = 'Cadeira Gamer') AS Cadeira_Gamer,
    (SELECT COUNT(quantidade) FROM vendas WHERE produto = 'Headset') AS Headset;

--Exercício 2: Mostre quantas datas diferentes de venda existem para cada produto. (NÃO USAR GROUP BY)
SELECT
    (SELECT COUNT(DISTINCT data_venda) FROM vendas WHERE produto = 'Notebook') AS Notebook,
    (SELECT COUNT(DISTINCT data_venda) FROM vendas WHERE produto = 'Mouse') AS Mouse,
    (SELECT COUNT(DISTINCT data_venda) FROM vendas WHERE produto = 'Teclado') AS Teclado,
    (SELECT COUNT(DISTINCT data_venda) FROM vendas WHERE produto = 'Monitor') AS Monitor,
    (SELECT COUNT(DISTINCT data_venda) FROM vendas WHERE produto = 'Cadeira Gamer') AS Cadeira_Gamer,
    (SELECT COUNT(DISTINCT data_venda) FROM vendas WHERE produto = 'Headset') AS Headset;

--Exercício 3: SUM() Exiba o faturamento total (quantidade × preço) de cada produto. (NÃO USAR GROUP BY)
SELECT
    (SELECT SUM(quantidade * preco_unitario) FROM vendas WHERE produto = 'Notebook') AS Notebook,
    (SELECT SUM(quantidade * preco_unitario) FROM vendas WHERE produto = 'Mouse') AS Mouse,
    (SELECT SUM(quantidade * preco_unitario) FROM vendas WHERE produto = 'Teclado') AS Teclado,
    (SELECT SUM(quantidade * preco_unitario) FROM vendas WHERE produto = 'Monitor') AS Monitor,
    (SELECT SUM(quantidade * preco_unitario) FROM vendas WHERE produto = 'Cadeira Gamer') AS Cadeira_Gamer,
    (SELECT SUM(quantidade * preco_unitario) FROM vendas WHERE produto = 'Headset') AS Headset;

--Exercício 4: Mostre a quantidade total de itens vendidos por produto. (NÃO USAR GROUP BY)
SELECT
    (SELECT SUM(quantidade) FROM vendas WHERE produto = 'Notebook') AS Notebook,
    (SELECT SUM(quantidade) FROM vendas WHERE produto = 'Mouse') AS Mouse,
    (SELECT SUM(quantidade) FROM vendas WHERE produto = 'Teclado') AS Teclado,
    (SELECT SUM(quantidade) FROM vendas WHERE produto = 'Monitor') AS Monitor,
    (SELECT SUM(quantidade) FROM vendas WHERE produto = 'Cadeira Gamer') AS Cadeira_Gamer,
    (SELECT SUM(quantidade) FROM vendas WHERE produto = 'Headset') AS Headset;

--Exercício 5: AVG() Calcule o preço médio unitário de cada produto. (NÃO USAR GROUP BY)
SELECT
    ROUND((SELECT AVG(preco_unitario) FROM vendas WHERE produto = 'Notebook'),2) AS Notebook,
    ROUND((SELECT AVG(preco_unitario) FROM vendas WHERE produto = 'Mouse'),2) AS Mouse,
    ROUND((SELECT AVG(preco_unitario) FROM vendas WHERE produto = 'Teclado'),2) AS Teclado,
    ROUND((SELECT AVG(preco_unitario) FROM vendas WHERE produto = 'Monitor'),2) AS Monitor,
    ROUND((SELECT AVG(preco_unitario) FROM vendas WHERE produto = 'Cadeira Gamer'),2) AS Cadeira_Gamer,
    ROUND((SELECT AVG(preco_unitario) FROM vendas WHERE produto = 'Headset'),2) AS Headset;

--Exercício 6: Mostre a média de valor de venda (quantidade × preço) de cada produto. (NÃO USAR GROUP BY)
SELECT
    ROUND((SELECT AVG(quantidade * preco_unitario) FROM vendas WHERE produto = 'Notebook'),2) AS Notebook,
    ROUND((SELECT AVG(quantidade * preco_unitario) FROM vendas WHERE produto = 'Mouse'),2) AS Mouse,
    ROUND((SELECT AVG(quantidade * preco_unitario) FROM vendas WHERE produto = 'Teclado'),2) AS Teclado,
    ROUND((SELECT AVG(quantidade * preco_unitario) FROM vendas WHERE produto = 'Monitor'),2) AS Monitor,
    ROUND((SELECT AVG(quantidade * preco_unitario) FROM vendas WHERE produto = 'Cadeira Gamer'),2) AS Cadeira_Gamer,
    ROUND((SELECT AVG(quantidade * preco_unitario) FROM vendas WHERE produto = 'Headset'),2) AS Headset;

--Exercício 7: MIN() Liste o menor preço unitário registrado para cada produto. (NÃO USAR GROUP BY)
SELECT
    (SELECT MIN(preco_unitario) FROM vendas WHERE produto = 'Notebook') AS Notebook,
    (SELECT MIN(preco_unitario) FROM vendas WHERE produto = 'Mouse') AS Mouse,
    (SELECT MIN(preco_unitario) FROM vendas WHERE produto = 'Teclado') AS Teclado,
    (SELECT MIN(preco_unitario) FROM vendas WHERE produto = 'Monitor') AS Monitor,
    (SELECT MIN(preco_unitario) FROM vendas WHERE produto = 'Cadeira Gamer') AS Cadeira_Gamer,
    (SELECT MIN(preco_unitario) FROM vendas WHERE produto = 'Headset') AS Headset;

--Exercício 8: Mostre a data da primeira venda registrada de cada produto. (NÃO USAR GROUP BY)
SELECT
    (SELECT MIN(data_venda) FROM vendas WHERE produto = 'Notebook') AS Notebook,
    (SELECT MIN(data_venda) FROM vendas WHERE produto = 'Mouse') AS Mouse,
    (SELECT MIN(data_venda) FROM vendas WHERE produto = 'Teclado') AS Teclado,
    (SELECT MIN(data_venda) FROM vendas WHERE produto = 'Monitor') AS Monitor,
    (SELECT MIN(data_venda) FROM vendas WHERE produto = 'Cadeira Gamer') AS Cadeira_Gamer,
    (SELECT MIN(data_venda) FROM vendas WHERE produto = 'Headset') AS Headset;

--Exercício 9: MAX()Liste o maior preço unitário praticado em cada produto. (NÃO USAR GROUP BY)
SELECT
    (SELECT MAX(preco_unitario) FROM vendas WHERE produto = 'Notebook') AS Notebook,
    (SELECT MAX(preco_unitario) FROM vendas WHERE produto = 'Mouse') AS Mouse,
    (SELECT MAX(preco_unitario) FROM vendas WHERE produto = 'Teclado') AS Teclado,
    (SELECT MAX(preco_unitario) FROM vendas WHERE produto = 'Monitor') AS Monitor,
    (SELECT MAX(preco_unitario) FROM vendas WHERE produto = 'Cadeira Gamer') AS Cadeira_Gamer,
    (SELECT MAX(preco_unitario) FROM vendas WHERE produto = 'Headset') AS Headset;

--Exercício 10: Mostre o maior valor de venda (quantidade × preço) registrado em cada produto. (NÃO USAR GROUP BY)
SELECT
    (SELECT MAX(quantidade * preco_unitario) FROM vendas WHERE produto = 'Notebook') AS Notebook,
    (SELECT MAX(quantidade * preco_unitario) FROM vendas WHERE produto = 'Mouse') AS Mouse,
    (SELECT MAX(quantidade * preco_unitario) FROM vendas WHERE produto = 'Teclado') AS Teclado,
    (SELECT MAX(quantidade * preco_unitario) FROM vendas WHERE produto = 'Monitor') AS Monitor,
    (SELECT MAX(quantidade * preco_unitario) FROM vendas WHERE produto = 'Cadeira Gamer') AS Cadeira_Gamer,
    (SELECT MAX(quantidade * preco_unitario) FROM vendas WHERE produto = 'Headset') AS Headset;

--Funções + Agrupamento

--Exercício 11 – Ticket médio por mês
--Mostre a média do valor das vendas (quantidade × preco_unitario) em cada mês do ano de 2025.
SELECT 
    MONTH(data_venda) AS mes, 
    ROUND(AVG(quantidade * preco_unitario), 2) AS media_vendas
FROM vendas 
WHERE YEAR(data_venda) = 2025 
GROUP BY mes
ORDER BY mes ASC;

--Exercício 12 – Produto mais barato e mais caro (por produto)
--Liste, para cada produto, o menor e o maior preço unitário praticado.
SELECT 
    produto, 
    MIN(preco_unitario) AS menor_preco,
    MAX(preco_unitario) AS maior_preco
 FROM vendas
 GROUP BY produto
 ORDER BY menor_preco ASC;

--Exercício 13 – Quantidade de vendas acima de R$ 1000 (por produto)
SELECT 
    produto, 
    COUNT(*) AS qtde_vendas
 FROM vendas
 WHERE (quantidade * preco_unitario) > 1000
 GROUP BY produto
 ORDER BY qtde_vendas ASC;

--Exercício 14 – Faturamento total por mês
SELECT
    MONTH(data_venda) AS mes,
    SUM(quantidade * preco_unitario) AS faturamento_total
FROM vendas
GROUP BY mes
ORDER BY mes ASC;

--Exercício 15 – Média de itens vendidos por produto
SELECT
    produto,
    ROUND(AVG(quantidade),0) AS media_itens
FROM vendas
GROUP BY produto
ORDER BY media_itens ASC;