# teste-repodriller
Faz o teste do repodriller para extrair dados de um repositório de software.

Este projeto tem como objetivo usar o framework repodriller para extrair informações de um repositório de software. 

Os seguintes passos foram adaptados do manual do ripodriller:

1. Criar um projeto java teste no padrão maven.

2. Adicione a dependência do repodriller no pom.xml do projeto.

3. Crie uma classe MyStudy que implementa a interface Study do Repodriller.

4. É necessário fazer a configuração da classe MyStudy informando o repositório que será analisado, os dados que serão extraídos e onde serão armazenados os dados extraídos. 

5. É recomendado que seja criada uma classe para cada tipo de extração de dados. Por exemplo, nesse projeto foi criada a classe DevelopersVisitor para extrair informações registradas pelos developers do repositório analisado. 

Mais informações sobre o repodriller em https://github.com/mauricioaniche/repodriller
