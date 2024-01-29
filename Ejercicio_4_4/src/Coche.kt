class Coche(
    marca: String,
    modelo: String,
    color: String,
    numCaballos: Int,
    numPuertas: Int,
    matricula: String
) {
    val marca = marca.capitalize().also {
        require(it.isNotBlank()) { "Marca no puede ser blanca ni nula" }
    }

    val modelo = modelo.capitalize().also {
        require(it.isNotBlank()) { "Modelo no puede ser blanco ni nulo" }
    }

    var color: String = color
        set(value) {
            require(value.isNotBlank()) { "Color no puede ser blanco ni nulo" }
            field = value
        }

    var numCaballos: Int = numCaballos
        set(value) {
            require(value in 70..700) { "Número de caballos debe estar entre 70 y 700" }
            field = value
        }

    var numPuertas: Int = numPuertas
        set(value) {
            require(value in 3..5) { "Número de puertas debe estar entre 3 y 5" }
            field = value
        }

    var matricula: String = matricula
        set(value) {
            require(value.length == 7) { "La matrícula debe tener 7 caracteres" }
            field = value
        }

    override fun toString(): String {
        return "Coche(marca='$marca', modelo='$modelo', color='$color', numCaballos=$numCaballos, numPuertas=$numPuertas, matricula='$matricula')"
    }
}
