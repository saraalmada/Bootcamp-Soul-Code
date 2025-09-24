CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);


CREATE TABLE pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT,
    data_pedido DATE NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id_cliente)
);

-- Atividade 1: INNER JOIN Básico
-- "Liste todos os pedidos realizados, mostrando o nome do cliente e a data do pedido."
SELECT 
    c.nome, p.data_pedido
FROM clientes AS c
INNER JOIN pedidos AS p 
    ON c.id_cliente = p.cliente_id;

-- Atividade 2: LEFT JOIN com Análise
-- "Identifique quais clientes nunca fizeram pedidos na empresa."
SELECT c.nome 
FROM clientes c
LEFT JOIN pedidos p 
    ON c.id_cliente = p.cliente_id
WHERE p.id_pedido IS NULL;

-- Atividade 3: Múltiplos JOINS
-- "Crie um relatório que mostre: nome do cliente, data do pedido, produto vendido e valor total da venda."
SELECT 
    c.nome,
    p.data_pedido,
    v.produto,
    (v.quantidade * v.preco_unitario) AS valor_total
FROM clientes c
INNER JOIN pedidos p 
    ON c.id_cliente = p.cliente_id
INNER JOIN vendas v 
    ON p.data_pedido = v.data_venda;

-- Atividade 4: JOIN com Agregação
-- "Calcule o valor total gasto por cada cliente em pedidos."
SELECT 
    c.nome,
    SUM(v.quantidade * v.preco_unitario) AS total_gasto
FROM clientes c
INNER JOIN pedidos p 
    ON c.id_cliente = p.cliente_id
INNER JOIN vendas v 
    ON p.data_pedido = v.data_venda
GROUP BY c.nome
ORDER BY total_gasto DESC;

-- Atividade 5: JOIN com Filtros Avançados
-- "Liste todas as vendas realizadas em março de 2024, mostrando o produto, a data da venda e o nome do cliente que fez o pedido."
SELECT 
    v.produto,
    v.data_venda,
    c.nome
FROM vendas v
INNER JOIN pedidos p 
    ON v.data_venda = p.data_pedido 
INNER JOIN clientes c 
    ON p.cliente_id = c.id_cliente 
WHERE v.data_venda BETWEEN '2024-03-01' AND '2024-03-31';

-- Atividade 6: LEFT JOIN para Análise de Dados
-- "Liste todas as vendas, incluindo aquelas que não estão associadas a nenhum pedido, mostrando o produto, a data da venda e o nome do cliente (se houver)."
SELECT 
    v.produto,
    v.data_venda,
    c.nome AS cliente_do_pedido_na_data
FROM vendas v
LEFT JOIN pedidos p 
    ON v.data_venda = p.data_pedido 
LEFT JOIN clientes c 
    ON p.cliente_id = c.id_cliente
ORDER BY v.data_venda;