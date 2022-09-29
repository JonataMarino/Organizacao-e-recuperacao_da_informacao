-- selecione todas as colunas da tabela tb_aula
SELECT * FROM db_acervom.tb_acervom;

-- selecione a coluna ID e NAME  `NAME` <- para palavras reservadas use a crase
select ID, NOME from  db_acervom.tb_acervom;

-- para inserir uma informação na tabela
INSERT INTO db_acervom.tb_acervom (NOME, PAIS) VALUES ('Jonatã', 'Brasil');

-- para atualizar informação na tabela
UPDATE db_acervom.tb_acervom
	SET NOME = "",
		PAIS = "",
        ESTADO = "",
        CIDADE = "",
        BAIRRO = "",
        LOGRADOURO = "",
        NUMERO = "",
        COMPLEMENTO = ""
	WHERE ID = 1;
    
delete from db_acervom.tb_acervom where ID = NULL;