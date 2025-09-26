-- 1
CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    preco DECIMAL(10, 2)
)

-- 2
INSERT INTO produtos (nome, preco) VALUES
('Webcam', 300.00),
('Placa de Vídeo', 2500.00),
('SSD', 600.00);

-- 3
SELECT * FROM produtos;

-- 4
SELECT * FROM produtos
WHERE preco > 50.00;

-- 5
UPDATE produtos
SET preco = 99.90
WHERE id = 1;

-- 6
DELETE FROM produtos
WHERE id = 2;

-- 7
SELECT COUNT(id), MIN(preco), MAX(preco) FROM produtos;

-- 8
CREATE TABLE novas_vendas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    produto_id INT,
    quantidade INT NOT NULL,
    FOREIGN KEY (produto_id) REFERENCES produtos(id)
);

INSERT INTO novas_vendas (produto_id, quantidade) VALUES
(1, 5),
(3, 10),
(1, 2);

SELECT produto_id, SUM(quantidade) AS total_vendido
FROM novas_vendas
GROUP BY produto_id;

-- 9
SELECT p.nome, v.quantidade
FROM produtos AS p
INNER JOIN novas_vendas AS v
ON p.id = v.produto_id; 

-- 10
-- Monte um banco de dados loja_online com as tabelas:

--clientes (id, nome, email)

--produtos (id, nome, preco)

--pedidos (id, cliente_id, data)

--itens_pedido (id, pedido_id, produto_id, quantidade)

CREATE DATABASE loja_online;
USE loja_online;

CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

CREATE TABLE produtos (
    id_produto INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL
);

CREATE TABLE pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT,
    data DATETIME NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id_cliente)
);

CREATE TABLE itens_pedido (
    id_item INT AUTO_INCREMENT PRIMARY KEY,
    pedido_id INT,
    produto_id INT,
    quantidade INT NOT NULL,
    FOREIGN KEY (pedido_id) REFERENCES pedidos(id_pedido),
    FOREIGN KEY (produto_id) REFERENCES produtos(id_produto)
);

INSERT INTO clientes (nome, email) VALUES
('Sara', 'sara@email.com'),
('Wilson', 'wilson@email.com'),
('Mayuka', 'mayuka@email.com'),
('Akira', 'akira@email.com');

INSERT INTO produtos (nome, preco) VALUES
('Protetor solar', 120.00),
('Hidratante facial', 99.00),
('Sabonete', 25.00),
('Shampoo', 39.00);

INSERT INTO pedidos (cliente_id, data) VALUES
(1, '2024-09-27'),
(2, '2024-09-03'),
(1, '2023-10-15'),
(3, '2023-10-11');

INSERT INTO itens_pedido (pedido_id, produto_id, quantidade) VALUES
(1, 1, 1),
(1, 2, 2),
(2, 3, 1),
(2, 4, 1),
(3, 2, 3),
(4, 1, 1),
(4, 4, 2);

