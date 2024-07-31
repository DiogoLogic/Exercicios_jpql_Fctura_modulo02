# Resolução de Exercícios JPQL - Segundo Módulo


# Resolução de Exercícios JPQL - Segundo Módulo


### 1. Banco de Dados Postgresql

Exercício de Fixação
Para cada comando de select abaixo solicite que o usuário digite o valor.

Selecionar todos os registros da tabela:

SELECT * FROM usuarios;
Selecionar apenas os códigos e nomes dos usuários:

SELECT codigo, nome FROM usuarios;
Selecionar todos os usuários com idade maior que 30:

SELECT * FROM usuarios WHERE idade > 30;
Selecionar todos os usuários com nome que começa com a letra 'A':

SELECT * FROM usuarios WHERE nome LIKE 'A%';
Selecionar todos os usuários ordenados por idade em ordem crescente:

SELECT * FROM usuarios ORDER BY idade ASC;
Selecionar todos os usuários ordenados por idade em ordem decrescente:

SELECT * FROM usuarios ORDER BY idade DESC;
Selecionar usuários com idade entre 20 e 40 anos:

SELECT * FROM usuarios WHERE idade BETWEEN 20 AND 40;
Selecionar usuários com idade exatamente igual a 25:

SELECT * FROM usuarios WHERE idade = 25;
Selecionar os 5 usuários mais recentes (considerando que o campo codigo é incremental):

SELECT * FROM usuarios ORDER BY codigo DESC LIMIT 5;
Selecionar usuários que não têm CPF nulo:

SELECT * FROM usuarios WHERE cpf IS NOT NULL;
Selecionar usuários com CPF que termina com '1234':

SELECT * FROM usuarios WHERE cpf LIKE '%1234';
Selecionar a média das idades dos usuários:

SELECT AVG(idade) AS media_idade FROM usuarios;
Selecionar o usuário mais velho:

SELECT * FROM usuarios ORDER BY idade DESC LIMIT 1;
Selecionar o usuário mais jovem:

SELECT * FROM usuarios ORDER BY idade ASC LIMIT 1;
Selecionar a quantidade total de usuários na tabela:

SELECT COUNT(*) AS total_usuarios FROM usuarios;
Selecionar usuários cujo nome contém a substring 'Silva':

SELECT * FROM usuarios WHERE nome LIKE '%Silva%';
Selecionar todos os usuários e agrupar por idade, mostrando a quantidade de usuários em cada faixa etária:

SELECT idade, COUNT(*) AS quantidade FROM usuarios GROUP BY idade;
Selecionar todos os usuários e exibir apenas o nome e o CPF, mas apenas para aqueles com idade menor que 30:

SELECT nome, cpf FROM usuarios WHERE idade < 30;
Selecionar todos os usuários com nome e CPF, excluindo aqueles com nome 'João':

SELECT nome, cpf FROM usuarios WHERE nome != 'João';
Selecionar todos os usuários com idade que é um número par:

SELECT * FROM usuarios WHERE idade % 2 = 0;
