# Projeto de Serialização em Java

Este projeto é um exemplo prático de como utilizar a serialização de objetos em Java. Ele demonstra como persistir objetos em arquivos binários e recuperá-los posteriormente.

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

*   **model**: Contém as classes de domínio que implementam a interface `Serializable`.
    *   `Cidade`: Representa uma cidade, contendo um nome e uma referência para um `Estado`.
    *   `Estado`: Representa um estado, contendo nome e sigla.
*   **serializacao**: Contém classes utilitárias e classes de teste para demonstrar o processo de serialização e desserialização.
    *   `SerializadorUtil`: Classe utilitária com métodos genéricos para serializar e desserializar objetos.
    *   `TestaSerializadorUtil`: Exemplo de uso da classe utilitária para serializar um objeto.
    *   `TestaDesserializa`: Exemplo de uso para desserializar um objeto.

## Funcionalidades

*   **Serialização**: Converte objetos Java em uma sequência de bytes para serem salvos em arquivos (ex: `estado.dat`, `cidade.dat`).
*   **Desserialização**: Reconstrói objetos Java a partir dos arquivos salvos.

## Tecnologias Utilizadas

*   Java
*   Maven (gerenciamento de dependências e build)

---
Este projeto foi desenvolvido como parte da disciplina de Desenvolvimento de Aplicações Distribuídas (DAD).
