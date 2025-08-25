# CadastroBanco_POO

Este projeto é um sistema de cadastro bancário desenvolvido em Java utilizando Swing para a interface gráfica. Ele foi criado como trabalho escolar para demonstrar conceitos de Programação Orientada a Objetos (POO) e manipulação de interfaces gráficas.

## Funcionalidades Principais

- **Consultar Conta:** Permite buscar os dados de uma conta existente informando o número da agência e o número da conta.
- **Atualizar Conta:** Após consultar uma conta, é possível editar seus dados e salvar as alterações.
- **Criar Conta:** Permite cadastrar uma nova conta bancária informando todos os dados necessários.
- **Fechar Aplicação:** Encerra o programa.

## Contas já cadastradas

O sistema já possui algumas contas pré-cadastradas para testes. Para visualizar os dados de uma conta, basta informar o número da agência e o número da conta nos campos correspondentes e clicar em Consultar.

Contas disponíveis:

| Agência | Conta  | Nome               |
|---------|--------|--------------------|
| 1234    | 56789  | Sara Lamari        |
| 2345    | 67890  | Thiago Mattos      | 
| 3456    | 78901  | Pedro Marinho      | 
| 4567    | 89012  | Beatriz Vinguerti  | 
| 5678    | 90123  | Felipe Dinnouti    | 
| 6789    | 01234  | Vitor Paiva        | 

## Como usar

1. **Executar o arquivo `Main.java`.**
2. **Para consultar uma conta:** Preencha os campos "Código da Agência" e "Número da Conta" e clique em **Consultar**.
3. **Para atualizar dados:** Após consultar, edite os campos desejados e clique em **Atualizar**.
4. **Para criar nova conta:** Preencha todos os campos e clique em **Criar**.

## Estrutura do Projeto

- `Componentes/` - Componentes visuais do formulário.
- `Functions/` - Lógica de manipulação das contas.
- `Janela.java` - Janela principal do sistema.
- `Main.java` - Ponto de entrada do programa.
