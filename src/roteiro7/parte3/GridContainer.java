package roteiro7.parte3;

import java.util.Arrays;

public class GridContainer extends Container {
    protected Component[][] elements;
    private int lineCounter = 0;
    private int columnCounter = 0;
    private int ColumnMax;
    private int LineMax;

    public GridContainer(int columnMax, int lineMax) {
        ColumnMax = columnMax;
        LineMax = lineMax;

        this.elements = new Component[LineMax][ColumnMax];
    }

    @Override
    public void addComponent(Component component) {
        if (this.lineCounter == this.LineMax && this.columnCounter == this.ColumnMax) {
            System.out.println("Não é possivel adicionar mais componentes");
        } else {
            this.elements[this.lineCounter][this.columnCounter] = component;
            this.columnCounter++;
            if (this.columnCounter == this.ColumnMax) {
                this.lineCounter++;
                if (this.lineCounter < this.LineMax) {
                    this.columnCounter = 0;
                }
            }
        }
    }

    @Override
    public void removeComponent(Component component) {
        for (int i = 0; i < this.LineMax; i++) {
            for (int j = 0; j < this.ColumnMax; j++) {
                if (this.elements[i][j] == component) {
                    this.elements[i][j] = null;
                }
            }
        }

    }

    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o GridContainer");
        System.out.println("Estes são os elementos presentes no container");
        System.out.println(Arrays.deepToString(elements));
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("---------------------------------------------------");

    }
}
