create table Produto(
	id int not null primary key auto_increment,
	nome varchar(100) not null,
	preco numeric(18,2),
	quantidade_estoque int
);

insert into Produto (nome, preco, quantidade_estoque) 
values 
('Monitor Ultrawide', 1800.00, 25),
('Notebook', 3500.00, 10),
('Mouse Sem Fio', 120.99, 50);