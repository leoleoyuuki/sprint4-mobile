# README do Projeto Kotlin

## Introdução

Este projeto Kotlin é um aplicativo Android desenvolvido com o objetivo de fornecer uma interface para a visualização e o cadastro de informações de empresas. O projeto utiliza diversas tecnologias e bibliotecas para garantir um funcionamento eficiente e uma experiência de usuário agradável.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem principal utilizada para o desenvolvimento do aplicativo.
- **Android Studio**: Ambiente de desenvolvimento integrado (IDE) utilizado para criar e gerenciar o projeto.
- **Retrofit**: Biblioteca para requisições HTTP ao backend.
- **Oracle Database**: Banco de dados utilizado no backend para armazenar informações.
- **ConstraintLayout**: Layout usado para criar interfaces responsivas e flexíveis.
- **GSON**: Biblioteca para conversão entre objetos Java/Kotlin e JSON.
- **ExpressJs**: Backend para receber e enviar informações para o OracleDb, [repositório do ExpressJs](https://github.com/leoleoyuuki/expressSprint3Plussoft) para testes de inserção e listagem do banco de dados Oracle.

## Funcionalidades

O aplicativo permite aos usuários:
- Visualizar uma lista de empresas cadastradas.
- Cadastrar novas empresas com informações detalhadas.
- Navegar entre diferentes telas.

## Estrutura do Projeto

- **HomeFragment**: Tela principal que exibe informações sobre o aplicativo e permite navegação para outras seções.
- **CadastrarEmpresaFragment**: Tela para o cadastro de novas empresas, com campos para inserir detalhes da empresa.
- **EmpresasFragment**: Tela que exibe uma lista de empresas cadastradas.
- **InfoFragment**: Tela que fornece informações sobre o aplicativo.
- **ParticipantesFragment**: Tela que exibe informações sobre os desenvolvedores do projeto.

## Configuração

### Requisitos

- Android Studio instalado.
- JDK 8 ou superior.

### Configuração do Projeto

1. **Clone o Repositório**

   ````bash
   git clone https://github.com/leoleoyuuki/sprint3mobile.git
   ````

2. **Importe o Projeto**

   Abra o Android Studio e selecione "Open an existing project". Navegue até a pasta clonada e importe o projeto.

3. **Configuração do Retrofit**

   Atualize o arquivo `RetrofitClient.kt` com a URL do seu backend:

   ````kotlin
   private const val BASE_URL = "http://localhost:3000"
   ````

4. **Configuração do Oracle Database**

   Configure seu backend para se conectar ao banco de dados Oracle. Certifique-se de que as credenciais e a string de conexão estão corretas no arquivo de configuração do backend.

### Executando o Projeto

1. **Construa o Projeto**

   No Android Studio, vá para `Build` > `Make Project` para compilar o projeto.

2. **Execute no Emulador ou Dispositivo**

   Conecte um dispositivo Android ou inicie um emulador e clique em `Run` no Android Studio para iniciar o aplicativo.

## Desenvolvimento

Para contribuir com o projeto, siga estas diretrizes:

1. **Crie um Fork**

   Faça um fork do repositório no GitHub e clone-o para o seu ambiente local.

2. **Crie uma Branch**

   Crie uma branch para suas alterações:

   ````bash
   git checkout -b minha-feature
   ````

3. **Faça Suas Alterações**

   Adicione e modifique o código conforme necessário. Teste suas alterações localmente.

4. **Commit e Push**

   Faça commit das suas alterações e envie para o seu fork:

   ````bash
   git add .
   git commit -m "Descrição das alterações"
   git push origin minha-feature
   ````

5. **Abra um Pull Request**

   No GitHub, abra um pull request para que suas alterações possam ser revisadas e mescladas ao repositório principal.

## Documentação

Para mais informações sobre como usar o aplicativo e detalhes adicionais sobre o projeto, consulte a documentação incluída no repositório ou entre em contato com os desenvolvedores.

## Contato

Para dúvidas ou sugestões, entre em contato com os desenvolvedores:

- **Leonardo Yuuki Nakazone (RM: 550373)**
- **Leonardo Blanco Pérez Ribeiro (RM: 99119)**
- **Paulo Henrique Luchini Ferreira (RM: 98082)**
- **Gustavo Moreira Gonçalves (RM: 97999)**
- **Daniel Soares Delfin (RM: 552184)**

