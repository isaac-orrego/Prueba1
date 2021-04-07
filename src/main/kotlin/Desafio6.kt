class Desafio6 {


    fun TresNumeros() {


        print("Ingrese el valor del primer numero")
      val  num1 = readLine()!!.toInt()
        println("Ingrese el valor del segundo numero")
      val  num2 = readLine()!!.toInt()
        println("Ingrese el valor del tercer numero")
      val  num3 = readLine()!!.toInt()
        if (num1 < num2 && num1 < num3) {
            println("el valor menor es $num1")
          } else if (num2 > num3) {
            println("el valor menor es $num3")
               } else {
                   println("el valor menor es $num2")
                    }
    }

}