# Cálculos com Datas e Horários em Java

Este projeto consiste em um programa Java simples que demonstra como realizar cálculos com datas e horários utilizando as classes do pacote `java.time`. O código mostra como adicionar e subtrair unidades de tempo (neste caso, dias) de objetos `LocalDate` (data), `LocalDateTime` (data e hora) e `Instant` (ponto na linha do tempo), além de calcular a duração entre dois instantes de tempo utilizando a classe `Duration`.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, onde as diversas operações de cálculo com datas e horários são demonstradas.

## Como Usar

1.  **Salve o arquivo:** Salve o código fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile o arquivo Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Resultado:** O programa exibirá no console os resultados de várias operações de cálculo com datas e horários, incluindo:
    * Datas uma semana antes e uma semana depois de uma data base (`LocalDate`).
    * Datas e horas uma semana antes e uma semana depois de uma data e hora base (`LocalDateTime`).
    * Instantes uma semana antes e uma semana depois de um instante base (`Instant`).
    * A duração em dias entre diferentes instantes de tempo (`Duration`).

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa e demonstra cálculos com datas e horários.

* **Método `main`:**
    1.  **Criação de objetos de data e hora base:** São criados objetos de diferentes classes do `java.time` para servirem como ponto de partida para os cálculos:
        * `LocalDate d01 = LocalDate.parse("2022-07-20")`: Cria um objeto `LocalDate` representando a data de 20 de julho de 2022.
        * `LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26")`: Cria um objeto `LocalDateTime` representando 20 de julho de 2022 às 01:30:26.
        * `Instant d03 = Instant.parse("2022-07-20T01:30:26Z")`: Cria um objeto `Instant` representando 20 de julho de 2022 às 01:30:26 UTC.
    2.  **Cálculos com `LocalDate`:**
        * `LocalDate pasWeekLocalDate = d01.minusDays(7)`: Subtrai 7 dias da data `d01`.
        * `LocalDate nextWeekLocaDate = d01.plusDays(7)`: Adiciona 7 dias à data `d01`.
    3.  **Cálculos com `LocalDateTime`:**
        * `LocalDateTime pasWeekLocalDateTime = d02.minusDays(7)`: Subtrai 7 dias da data e hora `d02`.
        * `LocalDateTime nextWeekLocaDateTime = d02.plusDays(7)`: Adiciona 7 dias à data e hora `d02`.
    4.  **Cálculos com `Instant`:**
        * `Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS)`: Subtrai 7 dias do instante `d03` utilizando a unidade de tempo `ChronoUnit.DAYS`.
        * `Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS)`: Adiciona 7 dias ao instante `d03` utilizando `ChronoUnit.DAYS`.
    5.  **Cálculo de `Duration`:** A classe `Duration` representa uma duração de tempo.
        * `Duration t1 = Duration.between(pasWeekLocalDateTime, d02)`: Calcula a duração entre a data e hora da semana passada e a data e hora base.
        * `Duration t2 = Duration.between(pasWeekLocalDate.atStartOfDay(), d01.atStartOfDay())`: Calcula a duração entre a data da semana passada (convertida para o início do dia) e a data base (convertida para o início do dia). `atStartOfDay()` retorna um `LocalDateTime` representando o início do dia da `LocalDate`.
        * `Duration t3 = Duration.between(pastWeekInstant, d03)`: Calcula a duração entre o instante da semana passada e o instante base.
        * `Duration t4 = Duration.between(d03, pastWeekInstant)`: Calcula a duração entre o instante base e o instante da semana passada (resultando em uma duração negativa).
    6.  **Impressão dos resultados:** Os resultados de todas as operações são impressos no console, mostrando as novas datas, horas e instantes, bem como as durações calculadas em dias utilizando o método `toDays()` da classe `Duration`.
