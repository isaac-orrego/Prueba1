class Desafio4 {

        fun Triangulos(){


            var numt = 0
            var iso = 0
            var esca = 0
            var equi = 0
            println("Ingrese el numero de triangulos")
            numt = readLine()!!.toInt()
            for (i in 1..numt) {
                println("Ingrese lado 1")
                var  la1 = readLine()!!.toInt()
                println("Ingrese lado 2")
                var la2 = readLine()!!.toInt()
                println("Ingrese lado 3")
                var la3 = readLine()!!.toInt()
                if (la1 == la2 && la1 == la3) {
                    equi++
                } else if (la1 == la2 || la1 == la3) {
                    iso++
                } else {
                    esca++
                }
            }
            println("el numero de equilateros es $equi")
            println("el numero de isosceles es $iso")
            println("el numero de escalenos es $esca")
        }
    }




