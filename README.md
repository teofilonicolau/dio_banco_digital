# Banco Digital com Java e Orientação a Objetos

Este projeto é uma simulação de um banco digital desenvolvido em Java utilizando os conceitos de Programação Orientada a Objetos (POO). O projeto é um desafio do bootcamp da Digital Innovation One (DIO), que consiste em implementar as funcionalidades de um banco que oferece contas correntes e poupança para seus clientes, com as operações de depósito, saque e transferência entre contas.

## 📜 Descrição

O objetivo do projeto é aplicar os conceitos de POO, tais como abstração, encapsulamento, herança e polimorfismo, em um contexto prático. O banco oferece dois tipos de contas: Corrente e Poupança. As funcionalidades implementadas são:

- **Depósito:** Permite que o cliente deposite um valor em sua conta.
- **Saque:** Permite que o cliente retire um valor de sua conta.
- **Transferência:** Permite que o cliente transfira um valor de sua conta para outra conta do mesmo banco.
- ![image](https://github.com/teofilonicolau/dio_banco_digital/assets/97030160/ed596fb9-4acd-43cf-b347-e0987ee3ed33)


## 📂 Estrutura do Projeto

O projeto está organizado da seguinte maneira:


### Principais Classes

- **Banco:** Representa o banco e contém a lista de clientes e contas.
- **Cliente:** Representa um cliente do banco.
- **Conta:** Classe abstrata que define uma conta bancária. Contém os métodos de depósito, saque e transferência.
- **ContaCorrente:** Representa uma conta corrente e herda da classe Conta.
- **ContaPoupanca:** Representa uma conta poupança e herda da classe Conta.
- **Main:** Classe principal que contém o método `main` para execução do programa.

## 🚀 Tecnologias Utilizadas

- **Java 11:** Linguagem de programação utilizada para o desenvolvimento do projeto.
- **Maven:** Ferramenta de automação de compilação e gerenciamento de dependências.
- **Spring Boot:** Framework utilizado para facilitar a criação de aplicações Java.

## 📝 Conceitos de POO Aplicados

### Abstração

A classe `Conta` é uma abstração das características e comportamentos comuns a todos os tipos de contas do banco. Os detalhes específicos de cada tipo de conta (corrente e poupança) são implementados nas classes `ContaCorrente` e `ContaPoupanca`.

### Encapsulamento

Os atributos das classes são privados e acessados através de métodos públicos, garantindo a proteção dos dados e a integridade das operações.

### Herança

A classe `ContaCorrente` e a classe `ContaPoupanca` herdam da classe `Conta`, reutilizando e estendendo suas funcionalidades.

### Polimorfismo

Os objetos das classes `ContaCorrente` e `ContaPoupanca` são tratados como objetos da classe `Conta`, permitindo a utilização de métodos polimórficos.

## 📥 Instalação

1. Clone o repositório:
   ```sh
   git clone https://github.com/teofilonicolau/dio_banco_digital.git
   ```
## Testando,com o Insomnia  
1 .  (http://localhost:8080/clientes) 
![image](https://github.com/teofilonicolau/dio_banco_digital/assets/97030160/2b994a35-938f-47f0-a643-8ff6b1edff38)

## Testando com o H2 :
1. Abra seu navegador e digite http://localhost:8080/h2-console.
2. Configure o Console H2
3. Preencha os campos de conexão com as seguintes informações:



``` JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: (deixe em branco ou insira password se especificado no application.properties) 
```
![image](https://github.com/teofilonicolau/dio_banco_digital/assets/97030160/0319bb94-abae-4558-8ef9-0c9cfbcd8da5)

## Passo 3: Insira Dados na Tabela cliente
1. Após conectar-se ao console H2, você verá um editor SQL.
2. Use o seguinte comando SQL para inserir clientes na tabela cliente:
``` INSERT INTO cliente (id, nome, cpf) VALUES (1, 'João Silva', '12345678900');
INSERT INTO cliente (id, nome, cpf) VALUES (2, 'Maria Oliveira', '98765432100');
```
3. Clique no botão "Run" (ícone de play) para executar os comandos.
   
## Passo 4: Verifique os Dados Inseridos
1.Para verificar se os dados foram inseridos corretamente, use o seguinte comando SQL para selecionar todos os registros da tabela cliente:

 SELECT * FROM cliente;
### 📚 Documentação
A documentação completa do projeto, incluindo diagramas de classes e exemplos de uso, pode ser encontrada na pasta docs do repositório.
![image](https://github.com/teofilonicolau/dio_banco_digital/assets/97030160/e2b6dc4d-d4c2-4660-9d32-986231f544b4)


### 🤝 Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

### 📄 Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

 
 










   


