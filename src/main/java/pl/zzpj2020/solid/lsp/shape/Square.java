package pl.zzpj2020.solid.lsp.shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Square implements Shape {
    private double side;

    @Override
    public double calcPerimeter() {
        return 4 * this.side;
    }

    @Override
    public double calcArea() {
        return this.side * this.side;
    }
}
