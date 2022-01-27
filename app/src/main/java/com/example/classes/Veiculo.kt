package com.example.classes

class Veiculo {

    var velocity: Long = 0
    var acceleration: Long = 10
    lateinit var model: String

    //metodo de incremento
    fun increment(velocity: Long) {
        this.velocity = this.acceleration + velocity
        println("velocida: ${this.velocity}")
    }

    //metodo de decremento de velocidade
    fun decrement(velocity: Long): Long {
        this.velocity = this.velocity - velocity
        if (this.velocity <= 0 ) {
            println("Veículo parado") // quando veloidade for zero ou negativo veiculo para
        } else if (this.velocity > 0) {
            println("Velocidade atual: ${this.velocity}") //apos decremento imprimi a velocidade atual
        }
        return this.velocity
    }

    //metodo de velocidade atual
    fun currentSpeed() {
        return println("Velocidade Atual do veículo: ${this.velocity}")
    }
}