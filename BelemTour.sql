CREATE DATABASE BelemTour;
use BelemTour;


CREATE TABLE Cliente (
idCliente INT AUTO_INCREMENT PRIMARY KEY,
Nome VARCHAR(255) NOT NULL,
Cpf VARCHAR(11) UNIQUE NOT NULL, 
Telefone VARCHAR(20) NOT NULL,
Endereco TEXT NOT NULL,
Email VARCHAR(80) NOT NULL
);

CREATE TABLE Pedido (
idpedido INT AUTO_INCREMENT PRIMARY KEY,
DataPedido DATETIME,
FormaPag ENUM ('Debito','Credito','Pix','Boleto'),
StatusPedido VARCHAR(10),
idCliente INT NOT NULL,
FOREIGN KEY(idCliente) REFERENCES Cliente (idCliente)
);



CREATE TABLE Destino (
iddestino INT AUTO_INCREMENT PRIMARY KEY,
nomeDestino VARCHAR(50) NOT NULL,
categoriaDestino ENUM ('Tur','Passeios Regulares'),
tempo ENUM('Dias, Semanas, Meses'),
Valor VARCHAR(10) NOT NULL,
idPedido INT NOT NULL,
FOREIGN KEY(idpedido) REFERENCES pedido (idPedido)
)
