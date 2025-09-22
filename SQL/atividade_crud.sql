-- 1-CREATE (INSERT)
-- Insira uma nova venda de 2 Monitores com preço unitário de 1150.00 realizada em 2025-03-15.

INSERT INTO vendas (produto, quantidade, preco_unitario, data_venda) VALUES
('Monitor', 2, 1150.00, '2025-03-15');

-- 2-CREATE (INSERT - múltiplos registros)
-- Insira duas novas vendas de uma só vez:
-- 1 Cadeira Gamer por 990.00 em 2025-03-20
-- 2 Headsets por 210.00 em 2025-03-22

INSERT INTO vendas (produto, quantidade, preco_unitario, data_venda) VALUES
('Cadeira Gamer', 1, 990.00, '2025-03-20'),
('Headset', 2, 210.00, '2025-03-22');

-- 3-READ (SELECT)
-- Liste todos os registros da tabela vendas.
SELECT * FROM vendas;

-- READ (SELECT + WHERE)
-- Mostre todas as vendas realizadas do produto "Mouse".
SELECT * FROM vendas 
WHERE produto = 'Mouse';

-- READ (SELECT + ORDER BY)
-- Liste as vendas ordenadas pela coluna data_venda em ordem decrescente (da mais recente para a mais antiga).
SELECT * FROM vendas 
ORDER BY data_venda DESC;

-- READ (SELECT + filtro numérico)
-- Selecione todas as vendas cujo preco_unitario seja maior que 1000.00.
SELECT * FROM vendas
WHERE preco_unitario > 1000.00;

-- 4-UPDATE (um campo)
-- Atualize a venda com id_venda = 3 para corrigir a quantidade de 5 para 6 unidades.
UPDATE vendas
SET quantidade = 6
WHERE id_venda = 3;

-- 5-UPDATE (múltiplos campos)
-- Atualize a venda com id_venda = 6, alterando a quantidade para 3 unidades e o preco_unitario para 165.00.
UPDATE vendas
SET quantidade = 3, preco_unitario = 165.00
WHERE id_venda = 6;

-- 6-DELETE (um registro específico)
-- Exclua a venda com id_venda = 9.
DELETE FROM vendas
WHERE id_venda = 9;

-- 7-DELETE (condicional)
-- Exclua todas as vendas do produto "Headset" realizadas em março de 2025.
DELETE FROM vendas
WHERE produto = 'Headset' 
    AND MONTH(data_venda) = 3 
    AND YEAR(data_venda) = 2025;

-- 8-O Ciclo de Vida de uma Venda (CRUD Completo)

-- Passo 1: CREATE (Criar) - Registrando uma Nova Venda
INSERT INTO vendas (produto, quantidade, preco_unitario, data_venda) VALUES
('SSD 512GB', 2, 250.00, '2025-03-18');

-- Passo 2: READ (Ler) - Verificando o Registro Inserido
SELECT * FROM vendas 
WHERE produto = 'SSD 512GB';

-- Passo 3: UPDATE (Atualizar) - Corrigindo a Venda
UPDATE vendas
SET quantidade = 1, preco_unitario = 265.00
WHERE id_venda = 16;

-- Passo 4: DELETE (Excluir) - Cancelando a Venda
DELETE FROM vendas
WHERE id_venda = 16;