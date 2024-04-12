package br.edu.puccampinas.targetsistemas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}
//1) Observe o trecho de código abaixo:
//
//int INDICE = 13, SOMA = 0, K = 0;
//
//enquanto K < INDICE faça
//
//{
//
//K = K + 1;
//
//SOMA = SOMA + K;
//}
//imprimir(SOMA);

//Ao final do processamento, qual será o valor da variável SOMA?
// resposta 78

//fun main() {
//    var indice:Int = 13
//    var soma:Int = 0
//
//
//    for( k in  0 until indice ){
//
//        soma += k
//
//    }
//
//    println(soma)}
//




//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos
// 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
// escreva um programa na linguagem que desejar onde, informado um número,
// ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se
// o número informado pertence ou não a sequência.

//fun main(){
//    println("---- Sequencia Fibonacci ----")
//    var x:Int=1;
//    var y:Int =0
//    var soma:Int
//    var resultado:Boolean = false
//    val lista = mutableListOf<Int>(0,1)
//    println("Digite o numero que deseja encontrar na sequência ")
//    val input_numero = readLine()?.toInt()
//    println("Digite o indice da sequência Fibonacci")
//    val indice = readLine()?.toInt()
//    //criando o fibonacci
//    for( k in 1 until indice!!){
//
//        soma = x + y
//        lista.add(soma)
//        y = x
//        x = soma
//    }
//
//    //varrendo lista procurando número escolhido
//    for (i in lista){
//        if(input_numero==i){
//            resultado = true
//            break
//        }
//    }
//
//    //imprimindo a lista
//    println("Sequencia Fibonacci: $lista")
//    //imprimindo varredura
//    if(resultado==true){
//        println("Número $input_numero pertence a sequência Fibonacci ")
//    }else{println("Número $input_numero não pertence a sequência Fibonacci")}
//}

//
//fun main(){
//    println("Digite o Ultimo numero do indice para todas as sequências")
//
//
//    var lista1= mutableListOf<Int>()
//    var lista2= mutableListOf<Int>()
//    var lista3= mutableListOf<Int>()
//    var lista4= mutableListOf<Int>()
//    var lista5= mutableListOf<Int>()
//
//
//
//    val indice:Int? = readLine()?.toInt()
//    println(" --- 1 ---")
//    var x:Int=-1
//    var y:Int
//    for(k in 0 until indice!! ){
//        x=x+2
//        lista1.add(x)
//    }
//    println(lista1)
//
//    println(" --- 2 ---")
//    for(k in 1 until indice!!){
//        x=2
//        x *= k
//        lista2.add(x)
//    }
//    println(lista2)
//    println(" --- 3 ---")
//    for(k in 1 until indice!!){
//        x=0
//        x = k*k
//        lista3.add(x)
//    }
//    println(lista3)
//    println(" --- 4 ---")
//    for(k in 2 until indice!!){
//        if(k%2==0) {
//            x = k * k
//            lista4.add(x)
//        }
//    }
//    println(lista4)
//    println(" --- 5 ---")
//    x=1
//    y=0
//    for(k in 0 until indice!!){
//        var soma = x + y
//        lista5.add(soma)
//        y = x
//        x = soma
//    }
//    println(lista5)
//    println(" --- 6 --- ")
//    //não consegui descobrir o padrão :(
//}
//4)
// ligaria dois interruptores e deixaria ligado por um tempo, entraria numa sala,
// caso esteja desligado eu saberia um interruptor
// apagaria outro, entraria em outra sala,caso esteja ligado, então descobri deste e dos outros dois
// caso desligado eu colocaria a mao na lampada para saber se esta quente, caso esteja quente
// saberia que foi oq eu apaguei, entao decobriria os dois outros, se nao, foi o q eu não liguei.
//

//5)
// fun inverterString(string: String): String {
//    var stringInvertido = ""
//    for (i in string.length - 1 downTo 0) {
//        stringInvertido += string[i]
//        //println(stringInvertido)
//    }
//    return stringInvertido
//}
//
//fun main() {
//    println("Digite alguma palavra ou pequena frase")
//    var string = readLine()?.toString()
//    val Stringeinvertida = inverterString(string!!)
//    println(Stringeinvertida)
//}
