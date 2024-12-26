package Clase_Sellada;

public sealed class animal permits Perro, Gato  {
    // Solo la clase Perro y gato podran heredar
}

final class Perro extends animal {
    // Esta clase no puede ser extendida por NINGUNA otra clase
}

sealed class Gato extends animal permits GatoSiames {
    // Gato extiende de animal, pero la palabra sealed indica 
    // que solo la clase GatoSiames, podra ser heredada  de gato
}

non-sealed class GatoSiames extends Gato  {
    // Esta clase puede ser extendida libremente
}
