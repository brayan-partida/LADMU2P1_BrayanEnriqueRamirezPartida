package mx.edu.ittepic.ladmu2p1_brayanenriqueramirezpartida

class HiloAnimacion(p: MainActivity) : Thread() {


    var puntero = p

    override fun run() {
        super.run()

        while (true) {

            sleep(10)
            puntero.runOnUiThread {
                puntero.lienzo!!.animarNieve()
            }
        }
    }

}