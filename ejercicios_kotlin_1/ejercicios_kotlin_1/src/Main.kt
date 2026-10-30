//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    ejercicio01()
    ejercicio02()
    ejercicio03()
    ejercicio04()
    ejercicio05()
    ejercicio06()
    ejercicio07()
    ejercicio08()
    ejercicio09()
    ejercicio10()
    ejercicio11()
    ejercicio12()
    ejercicio13()
    ejercicio14()
    ejercicio15()
    ejercicio16()
    ejercicio17()
    ejercicio18()
    ejercicio19()
    ejercicio20()
    ejercicio21()
    ejercicio22()
    ejercicio23()
    ejercicio24()
}

fun ejercicio01() {
    val num1 = 10
    val num2 = 3

    println("Suma: ${num1 + num2}")
    println("Resta: ${num1 - num2}")
    println("Multiplicacion: ${num1 * num2}")
    println("Division: ${num1.toDouble() / num2}")
    println("Modulo: ${num1 % num2}")
}

fun ejercicio02() {
    val nombre = "Pedro"
    println("Bienvenido, $nombre")
}

fun ejercicio03() {
    print("Introduce tu nombre: ")
    val nombre = readln()
    println("Bienvenido, $nombre")
}

fun ejercicio04() {
    print("Introduce el primer numero: ")
    val num1 = readln().toInt()

    print("Introduce el segundo numero: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        println("$num1 es mayor")
    } else if (num2 > num1) {
        println("$num2 es mayor")
    } else {
        println("Los dos numeros son iguales")
    }
}

fun ejercicio05() {
    print("Introduce un numero: ")
    val num = readln().toInt()

    if (num % 2 == 0) {
        println("Es divisible entre 2")
    } else {
        println("No es divisible entre 2")
    }
}

fun ejercicio06() {
    var respuesta = ""

    while (respuesta.lowercase() != "c") {
        println("¿Cual es la capital de España?")
        println("a) Barcelona")
        println("b) Sevilla")
        println("c) Madrid")
        println("d) Valencia")
        print("Tu respuesta: ")

        respuesta = readln()

        if (respuesta.lowercase() == "c") {
            println("Respuesta correcta")
        } else {
            println("Respuesta incorrecta. Intentalo de nuevo")
        }
    }
}

fun ejercicio07() {
    for (i in 1..100) {
        println(i)
    }
}

fun ejercicio08() {
    var i = 1

    while (i <= 100) {
        println(i)
        i++
    }
}

fun ejercicio09() {
    for (i in 100 downTo 1) {
        if (i % 2 == 0 && i % 3 == 0) {
            println(i)
        }
    }
}

fun ejercicio10() {
    var num: Int

    do {
        print("Introduce un numero mayor o igual que cero: ")
        num = readln().toInt()
    } while (num < 0)

    println("El numero introducido es $num")
}

fun ejercicio11() {
    val contraseña = "kotlin"
    var intentos = 3
    var acertado = false

    while (intentos > 0 && !acertado) {
        print("Introduce la contraseña: ")
        val respuesta = readln()

        if (respuesta == contraseña) {
            println("Enhorabuena, acertaste")
            acertado = true
        } else {
            intentos--

            if (intentos > 0) {
                println("Has fallado. Te quedan $intentos intentos")
            } else {
                println("Has agotado los intentos")
            }
        }
    }
}

fun ejercicio12() {
    print("Introduce un mes (con numero del 1 al 12): ")
    val mes = readln().toInt()

    when (mes) {
        1 -> println("El mes de enero tiene 31 dias")
        2 -> println("El mes de febrero tiene 28 o 29 dias")
        3 -> println("El mes de marzo tiene 31 dias")
        4 -> println("El mes de abril tiene 30 dias")
        5 -> println("El mes de mayo tiene 31 dias")
        6 -> println("El mes de junio tiene 30 dias")
        7 -> println("El mes de julio tiene 31 dias")
        8 -> println("El mes de agosto tiene 31 dias")
        9 -> println("El mes de septiembre tiene 30 dias")
        10 -> println("El mes de octubre tiene 31 dias")
        11 -> println("El mes de noviembre tiene 30 dias")
        12 -> println("El mes de diciembre tiene 31 dias")
        else -> println("Mes no valido")
    }
}

fun ejercicio13() {
    print("Introduce un dia de la semana: ")
    val dia = readln().lowercase()

    if (dia == "lunes" || dia == "martes" || dia == "miercoles" ||
        dia == "jueves" || dia == "viernes"
    ) {
        println("Es un dia laborable")
    } else if (dia == "sabado" || dia == "domingo") {
        println("Es fin de semana")
    } else {
        println("Dia no valido")
    }
}

fun ejercicio14() {
    print("¿Cuantas ventas has realizado? ")
    val cantidad = readln().toInt()

    var suma = 0.0

    for (i in 1..cantidad) {
        print("Introduce el importe de la venta $i: ")
        val venta = readln().toDouble()
        suma += venta
    }

    println("La suma total de las ventas es: %.2f".format(suma))
}

fun ejercicio15() {
    var cantidadVentas = 0
    var suma = 0.0

    while (true) {
        print("Introduce una venta o * para terminar: ")
        val entrada = readln()

        if (entrada == "*") {
            break
        }

        val venta = entrada.toDouble()
        suma += venta
        cantidadVentas++
    }

    println("Numero de ventas: $cantidadVentas")
    println("Suma total: %.2f".format(suma))
}

fun ejercicio16() {
    print("Introduce el primer numero: ")
    val num1 = readln().toInt()

    print("Introduce el segundo numero: ")
    val num2 = readln().toInt()

    val menor = minOf(num1, num2)
    val mayor = maxOf(num1, num2)

    for (i in 1..10) {
        println((menor..mayor).random())
    }
}

fun ejercicio17() {
    print("Introduce una cadena de texto: ")
    val texto = readln()

    var vocales = 0
    var consonantes = 0
    var numeros = 0
    var espacios = 0

    for (caracter in texto) {
        if (caracter.lowercaseChar() in "aeiouáéíóú") {
            vocales++
        } else if (caracter.lowercaseChar() in 'a'..'z' ||
            caracter in "ñÑ"
        ) {
            consonantes++
        } else if (caracter in '0'..'9') {
            numeros++
        } else if (caracter == ' ') {
            espacios++
        }
    }

    println("Vocales: $vocales")
    println("Consonantes: $consonantes")
    println("Numeros: $numeros")
    println("Espacios en blanco: $espacios")
}

fun ejercicio18() {
    val texto = "La lluvia en Sevilla es una maravilla"
    val resultado = texto.replace('a', 'e')

    println(resultado)
}

fun ejercicio19() {
    var salir = false

    print("Introduce el primer operando: ")
    var num1 = readln().toDouble()

    print("Introduce el segundo operando: ")
    var num2 = readln().toDouble()

    while (!salir) {
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Potencia")
        println("6. Modulo")
        println("7. Introducir nuevos operandos")
        println("8. Salir")
        print("Elige una opcion: ")

        val opcion = readln().toInt()

        when (opcion) {
            1 -> println("Resultado: ${num1 + num2}")
            2 -> println("Resultado: ${num1 - num2}")
            3 -> println("Resultado: ${num1 * num2}")
            4 -> {
                if (num2 != 0.0) {
                    println("Resultado: ${num1 / num2}")
                } else {
                    println("No se puede dividir entre cero")
                }
            }
            5 -> println("Resultado: ${Math.pow(num1, num2)}")
            6 -> {
                if (num2 != 0.0) {
                    println("Resultado: ${num1 % num2}")
                } else {
                    println("No se puede calcular el modulo entre cero")
                }
            }
            7 -> {
                print("Introduce el primer operando: ")
                num1 = readln().toDouble()

                print("Introduce el segundo operando: ")
                num2 = readln().toDouble()
            }
            8 -> salir = true
            else -> println("Opcion no valida")
        }
    }
}

fun ejercicio20() {
    var num: Int

    do {
        print("Inserta un numero entero mayor que 1: ")
        num = readln().toInt()
    } while (num <= 1)

    var suma = 0

    for (i in 1..num) {
        suma += i
    }

    println("La suma desde 1 hasta $num es: $suma")
}

fun ejercicio21() {
    print("Introduce una frase: ")
    val frase = readln()

    println(frase.replace(" ", ""))
}

fun ejercicio22() {
    var resultado = ""

    while (true) {
        print("Introduce una frase (vacio para terminar): ")
        val frase = readln()

        if (frase.isEmpty()) {
            break
        }

        resultado += frase
    }

    println("Cadena resultante: $resultado")
}

fun ejercicio23() {
    print("Introduce una frase: ")
    val frase = readln()

    val palabras = frase.split(" ")

    for (palabra in palabras) {
        if (palabra.isNotEmpty()) {
            println(palabra)
        }
    }
}

fun ejercicio24() {
    var mayor = 0
    var menor = 0
    var suma = 0
    var sumaPositivos = 0
    var sumaNegativos = 0
    var cantidad = 0

    while (true) {
        print("Introduce un numero (-1 para terminar): ")
        val num = readln().toInt()

        if (num == -1) {
            break
        }

        if (cantidad == 0) {
            mayor = num
            menor = num
        } else {
            if (num > mayor) {
                mayor = num
            }

            if (num < menor) {
                menor = num
            }
        }

        suma += num

        if (num > 0) {
            sumaPositivos += num
        } else if (num < 0) {
            sumaNegativos += num
        }

        cantidad++
    }

    if (cantidad > 0) {
        println("El menor es: $menor")
        println("El mayor es: $mayor")
        println("La suma es: $suma")
        println("La suma de los positivos es: $sumaPositivos")
        println("La suma de los negativos es: $sumaNegativos")
    } else {
        println("No se han introducido numeros")
    }
}