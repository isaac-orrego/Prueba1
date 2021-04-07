import java.util.*

class Desafio3 {


    fun numeros() {
        var pos = 0
        var neg = 0
        var mquince = 0
        var sumpares = 0
        val ingreso = Scanner(System.`in`)

        for (i in 1..10) {
            println("Ingrese un numero ")

            var ningreso = ingreso.nextInt()


            if (ningreso > 0) {
                pos++
            } else {
                neg++
            }
            if (ningreso % 15 == 0) {
                mquince++
            }
            if (ningreso % 2 == 0) {
                sumpares += ningreso
            }
        }
        println("El numero de positivos es $pos")
        println("El numero de negativos es $neg")
        println("El numero de multiplos de 15 es $mquince")
        println("La suma de pares es $sumpares")
    }

}