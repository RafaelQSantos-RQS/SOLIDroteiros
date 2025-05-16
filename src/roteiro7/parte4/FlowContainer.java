package roteiro7.parte4;

import java.util.ArrayList;
import java.util.List;

public class FlowContainer extends Container {
    protected List<Component> elements;

    public FlowContainer() {
        this.elements = new java.util.ArrayList<Component>();
    }

    public FlowContainer(Borda borda) {
        super(borda);
        this.elements = new ArrayList<Component>();
    }

    @Override
    public void addComponent(Component component) {
        this.elements.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        this.elements.remove(component);
    }

    @Override
    public void doLayout() {
        System.out.println("O container utilizado é o FlowContainer");
        if (this.borda != null) this.borda.gerarBorda();
        System.out.println("Estes são os elementos presentes no container:");
        System.out.println(elements);
        System.out.println("Usando o método dispose como herança oara fechar o container");
        this.dispose();
        System.out.println("---------------------------------------------------");
    }
}
