package br.digital.com

class Fatorial(var num: Int) {

    fun fatorial() {
        var vezes = num-1
        while (vezes >= 1) {
            num *= vezes
            vezes--
        }
        print(num)
    }
}