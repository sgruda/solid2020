package pl.zzpj2020.solid.lsp.shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Rectangle implements Shape {
    private double height;
    private double width;

    @Override
    public double calcPerimeter() {
        return 2 * this.height + 2 * this.width;
    }

    @Override
    public double calcArea() {
        return this.height * this.width;
    }
}
