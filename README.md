# AFD Exercício 1

Implementação java iterativo de um AFD A1, que reconhece a linguagem:

aba, abba, abbba, abbbba, .... 

Definição da linguagem:
- x &isin; {a,b}
- A1 = <{a, b}, {s0, s1, s2}, s0, δ, {s2}>, 
- onde δ é:
    - δ{s0,a) = s1
    - δ{s1,b) = s1
    - δ{s1,a) = s2

AFD:
![AFD imagem](afdex1.png)

Arquivo JFlap:
[AF_ex1_v1.jff](AF_ex1_v1.jff)