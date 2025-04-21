package exerciciosHerança;

public class Forma {
    protected double area;
    protected double perimetro;

    public void mostra() {
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}

// Subclasse Circunferencia que herda de Forma
class Circunferencia extends Forma {
    protected double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
        this.area = Math.PI * Math.pow(raio, 2);
        this.perimetro = 2 * Math.PI * raio;
    }

    public void mostra() {
        System.out.println("Circunferência:");
        System.out.println("Raio: " + raio);
        super.mostra();
    }
}

// Classe base Triangulo
class Triangulo {
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void mostra() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}

// Subclasse Retangulo que herda de Triangulo
class Retangulo extends Triangulo {
    protected double area;
    protected double perimetro;

    public Retangulo(double base, double altura) {
        super(base, altura);
        this.area = base * altura;
        this.perimetro = (base * altura) * 2;
    }

    public void mostra() {
        System.out.println("Retângulo:");
        super.mostra();
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}