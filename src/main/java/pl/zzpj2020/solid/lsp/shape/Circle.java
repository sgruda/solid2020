package pl.zzpj2020.solid.lsp.shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Circle implements Shape {
    private double radius;

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * this.radius * this.radius;
    }
}
