class Desafio1 {

    var suma = 0


    fun saldos() {
        do {
            println("Ingrese cuenta")
          var  cuenta = readLine()!!.toInt()

            if (cuenta >=0){
            println("Ingrese Saldo")
         var   saldo = readLine()!!.toInt()
            if (saldo < 0) {
                println("Deudor")
            } else if (saldo > 0) {
                println("Acreedor")
              suma += saldo
            } else {
                println("saldo nulo")
            }
        } }while (cuenta > 0)
        println("la suma de las cuentas acreedoras es $suma")
    }
}