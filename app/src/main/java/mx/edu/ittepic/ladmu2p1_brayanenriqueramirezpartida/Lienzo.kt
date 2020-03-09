package mx.edu.ittepic.ladmu2p1_brayanenriqueramirezpartida

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p: MainActivity) : View(p) {


    var puntero = p //se requiere en que actobity trabajara


    var ventana = FiguraGeometrica(160, 550, 25)
    var puerta = FiguraGeometrica(200, 575, 50, 75)//todo

    var casa = FiguraGeometrica(130, 500, 200, 150)//todo
    var piso = FiguraGeometrica(0, 650, 600, 1)//todo
    var bolitas1 = FiguraGeometrica(30, 488, 25)
    var bolitas2 = FiguraGeometrica(30, 518, 25)

    var copos = FiguraGeometrica(20, 1, 10)
    var copos2 = FiguraGeometrica(50, 10, 10)
    var copos3 = FiguraGeometrica(80, 20, 10)
    var copos4 = FiguraGeometrica(110, 30, 10)
    var copos5 = FiguraGeometrica(200, 40, 5)
    var copos6 = FiguraGeometrica(230, 10, 15)
    var copos7 = FiguraGeometrica(300, 20, 15)
    var copos8 = FiguraGeometrica(400, 30, 10)

    var tronco = FiguraGeometrica(15, 540, 30, 70)
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.WHITE);

        //todo: dibujar piso
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        piso.pintar(canvas, paint)

        //todo: dibujando balita1

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        bolitas1.pintar(canvas, paint)

        //todo: dibujar bolita 2

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        bolitas2.pintar(canvas, paint)

        //todo: dibujar tronco

        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        tronco.pintar(canvas, paint)
        //TODO: ventana
        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        ventana.pintar(canvas, paint)

//todo: puerta

        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        puerta.pintar(canvas, paint)
        //todo : dibujar casa
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        casa.pintar(canvas, paint)
//todo:nieve

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copos.pintar(canvas, paint)
//copo2
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copos2.pintar(canvas, paint)

        //copo3
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copos3.pintar(canvas, paint)
//copo4
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copos4.pintar(canvas, paint)



        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copos5.pintar(canvas, paint)


        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copos6.pintar(canvas, paint)

        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copos7.pintar(canvas, paint)


        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 2f
        copos8.pintar(canvas, paint)
    }

    fun animarNieve() {
        copos.nieve(600)
        copos2.nieve(600)
        copos3.nieve(400)
        copos4.nieve(600)
        copos5.nieve(800)
        copos6.nieve(600)
        copos7.nieve(500)
        copos8.nieve(600)
        invalidate()


    }
}