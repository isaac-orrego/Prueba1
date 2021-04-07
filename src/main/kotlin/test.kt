class test {

    fun test () {
        var negativos = 0
        var positivos = 0
        var mult15 = 0
        var sumapares = 0
        for(i in 1..10) {
            println("Ingrese valor:")
            val valor = readLine()!!.toInt()
            if (valor < 0)
                negativos++
            else
                if (valor > 0)
                    positivos++
            if ( valor % 15 == 0)
                mult15++
            if (valor % 2 == 0)
                sumapares+=valor
        }
        println("Cantidad de valores negativos: $negativos")
        println("Cantidad de valores positivos: $positivos")
        println("Cantidad de valores múltiplos de 15: $mult15")
        println("Suma de los valores pares: $sumapares")
    }



}