fun main(){
    val aulaFisica = Fisica ()


    println("Digite a massa:")
    val num1: Float = readLine()!!.toFloat()
    println("Digite a gravidade:")
    val num2: Float = readLine()!!.toFloat()
    println("Digite a velocidade:" )
    val num3:Float = readLine()!!.toFloat()
    println("Digite o raioDaCurva:")
    val num4:Float = readLine()!!.toFloat()
    println("Digite a forcaNewton:")
    val num5:Float = readLine()!!.toFloat()
    println("Digite o tempoFinal:")
    val num6:Float = readLine()!!.toFloat()
    println("Digite o deslocamentoEmMetros:")
    val num7:Float = readLine()!!.toFloat()
    println("Digite o deslocamento?")
    val num8:Float = readLine()!!.toFloat()
    println("Digite o intervaloDeTempo:")
    val num9:Float = readLine()!!.toFloat()
    println("Digite o espacoInicial:")
    val num10:Float = readLine()!!.toFloat()
    println("Digite o tempo:")
    val num11:Float = readLine()!!.toFloat()
    println("Digite o tempoInicial:")
    val num12:Float = readLine()!!.toFloat()
    println("Digite a aceleracao:")
    val num13:Float = readLine()!!.toFloat()
    println("Digite a velocidadeInicial:")
    val num14:Float = readLine()!!.toFloat()
    println("Digite o tempoFinal:")
    val num15:Float = readLine()!!.toFloat()

    val calForcaPeso = aulaFisica.calForcaPeso(num1,num2)
    val calForcaCentripeta = aulaFisica.calForcaCentripeta(num1,num3,num4)
    val calImpulso = aulaFisica.calImpulso(num5,num6,num12)
    val calForcaElastica = aulaFisica.calForcaElastica(num5,num7)
    val calVelocidadeMedia = aulaFisica.calVelocidadeMedia(num8,num9)
    val calMru = aulaFisica.calMru(num3,num11,num10,num15)
    val calMruv = aulaFisica.calMruv(num10,num11,num13,num14)

    println("O resultado da calForcaPeso é $calForcaPeso")
    println("O resultado da calForcaCentripeta é $calForcaCentripeta")
    println("O resultado da calImpulso é $calImpulso")
    println("O resultado da calForcaElastica é $calForcaElastica")
    println("O resultado da calVelocidadeMedia é $calVelocidadeMedia")
    println("O resultado da calMru é $calMru")
    println("O resultado da calMruv é $calMruv")






}