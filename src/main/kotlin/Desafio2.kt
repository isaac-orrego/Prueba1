class Desafio2 {

    fun cardinales(){

        var c1 = 0
        var c2 = 0
        var c3 = 0
        var c4 = 0
        print("ingresa numero de coordenadas")

        var num = readLine()!!.toInt()
        for (i in 1..num) {
            println("ingresa la coordenada X")
            var x = readLine()!!.toInt()
            println("ingresa la coordenada Y")
            var y = readLine()!!.toInt()
            if (x > 0 && y > 0) {
                c1++
            } else if (x > 0 && y < 0) {
                c2++
            } else if (x < 0 && y < 0) {
                c3++
            } else if (x < 0 && y > 0) {
                c4++
            }
        }
        println("El total de coordenadas en el primer cuadrante es $c1")
        println("El total de coordenadas en el segundo cuadrante es $c2")
        println("El total de coordenadas en el tercer cuadrante es $c3")
        println("El total de coordenadas en el pcuarto cuadrante es $c4")



    }

}