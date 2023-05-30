CREATE TABLE cliente
(
    id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    cpf VARCHAR(14),
    nome VARCHAR(50),
    sexo VARCHAR(1),
    nascimento  TIMESTAMP,
    endereco_id BIGINT,
    CONSTRAINT pk_cliente PRIMARY KEY (id)
);

ALTER TABLE cliente
    ADD CONSTRAINT FK_CLIENTE_ON_ENDERECO FOREIGN KEY (endereco_id) REFERENCES endereco (id);