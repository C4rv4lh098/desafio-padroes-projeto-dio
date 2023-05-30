CREATE TABLE endereco
(
    id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    cep VARCHAR(9),
    rua VARCHAR(255),
    bairro VARCHAR(255),
    numero INT,
    cidade VARCHAR(255),
    uf     VARCHAR(255),
    CONSTRAINT pk_endereco PRIMARY KEY (id)
);