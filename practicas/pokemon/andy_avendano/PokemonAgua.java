package practicas.pokemon.andy_avendano;

class PokemonAgua extends Pokemon implements Elemento {
    public PokemonAgua(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Agua";
    }

    @Override
    public int getEdad() {
        return 15;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un chorro de agua!");
    }
}
