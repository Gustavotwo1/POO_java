-- Cria��o do banco de dados
CREATE DATABASE ecommerce;
GO

-- Seleciona o banco de dados
USE ecommerce;


-- Tabela de clientes
CREATE TABLE cliente (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    endereco VARCHAR(50),
    telefone VARCHAR(20)
);
GO

-- Tabela de produtos
CREATE TABLE produto (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(MAX), 
    preco FLOAT NOT NULL,
    estoque INT NOT NULL
);
GO

-- Tabela de pedidos
CREATE TABLE pedido (
    id INT IDENTITY(1,1) PRIMARY KEY,
    id_cliente INT NOT NULL,
    data_pedido DATE NOT NULL,
    valor_total FLOAT,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);
GO

-- Tabela de itens do pedido
CREATE TABLE item_pedido (
    id INT IDENTITY(1,1) PRIMARY KEY,
    id_pedido INT NOT NULL,
    id_produto INT NOT NULL,
    quantidade INT NOT NULL,
    preco_unitario FLOAT NOT NULL,
    FOREIGN KEY (id_pedido) REFERENCES pedido(id),
    FOREIGN KEY (id_produto) REFERENCES produto(id)
);
GO

-- Inser��o de dados na tabela cliente
INSERT INTO cliente (nome, email, endereco, telefone) 
VALUES 
('Jo�o Silva', 'joao@email.com', 'Rua das Flores, 123', '99999-1111'),
('Maria Oliveira', 'maria@email.com', 'Av. Brasil, 456', '98888-2222'),
('Pedro Santos', 'pedro@email.com', 'Rua Central, 789', '97777-3333');
GO

