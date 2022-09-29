SELECT * FROM db_acervom.tb_acervom;

-- para inserir uma informação na tabela
INSERT INTO db_acervom.tb_acervom (NOME, PAIS, ESTADO, CIDADE, BAIRRO, LOGRADOURO, NUMERO, COMPLEMENTO ) VALUES ('', '', '', '', '', '', '', '');

-- para atualizar informação na tabela
UPDATE db_acervom.tb_acervom
	SET NOME = "",
		PAIS = "",
        CIDADE = "",
        ESTADO = "",
        BAIRRO = "",
        LOGRADOURO = "",
        NUMERO = "",
        COMPLEMENTO = ""
        
	WHERE ID = ID;
    
delete from db_acervom.tb_acervom where idtb_acervom = 1;