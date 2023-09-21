# The code is solving a programming problem related to ordering and printing a list of shirt orders.
# https://www.beecrowd.com.br/judge/pt/problems/view/1258

from Blusa import Blusa
from Pedido import Pedido

if __name__ == '__main__':
    # This code is creating a list called `pedidos` and initializing a variable `n` with an integer
    # value obtained from user input.
    pedidos = []
    n = int(input())
    while True:
        if n == 0:
            size = len(pedidos)
            for i in range(size):
                [print(j) for j in pedidos[i]]
                if i < size-1:
                    print()
            break
        for i in range(n):
            nome = input()
            comandline = input().split(" ")
            camisa = Blusa(comandline[0], comandline[1])
            Pedido.addPedido(Pedido(nome, camisa))
        pedidos.append(sorted(Pedido.pedidos, key=lambda x: (
            x.getCamisa().getCor(), x.getCamisa().getTamanho().value, x.getNome())))
        Pedido.clearList()
        cmd = input()
        n = int(cmd)
