CREATE DATABASE nf_cadastro;
USE nf_cadastro;

-- Nr_Nota, Cliente, Data_Emissao
CREATE TABLE nota (
	nr_nota INT AUTO_INCREMENT PRIMARY KEY,
    cliente VARCHAR(200) NOT NULL,
    dt_emissao DATE NOT NULL
);

-- Id_Item, Descricao, Valor, Quantidade, 
CREATE TABLE itens (
	id_item INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    preco FLOAT NOT NULL,
    qtd INT NOT NULL,
    nr_nota INT NOT NULL,
    CONSTRAINT fk_nr_nota FOREIGN KEY (nr_nota) REFERENCES nota (nr_nota) ON DELETE CASCADE
);

INSERT INTO item (descricao, valor, qtd, nr_nota) VALUES ('Item teste3', 300.00, 15, 3);

INSERT INTO nota (cliente, dt_emissao) VALUES ('Xaxa', date('2021-07-03'));

SELECT * FROM nota;
SELECT * FROM item;