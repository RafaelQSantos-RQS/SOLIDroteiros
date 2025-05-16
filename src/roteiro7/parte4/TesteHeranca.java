package roteiro7.parte4;

public class TesteHeranca {
    public static void main(String[] args) {

        Component button = new Component("Button");
        Component textBox = new Component("TextBox");
        Component textField = new Component("TextField");
        Component checkBox = new Component("CheckBox");
        Component comboBox = new Component("ComboBox");
        Component label = new Component("Label");
        Component radioButton = new Component("RadioButton");

        // Criando um GridContainer para adicionar os elementos
        Container container1 = new GridContainer(2, 2);

        // Adicionando os elementos ao GridContainer
        container1.addComponent(button);
        container1.addComponent(textBox);
        container1.addComponent(textField);
        container1.addComponent(checkBox);

        container1.doLayout();

        System.out.println("***************************************");

        // Criando um FlowContainer para adicionar os elementos
        Container container2 = new FlowContainer();

        // Adicionando os elementos ao FlowContainer
        container2.addComponent(comboBox);
        container2.addComponent(label);
        container2.addComponent(radioButton);

        container2.doLayout();

        System.out.println("***************************************");

        // Criando um FlowContainerBordaPontilhada para adicionar os elementos
        Container container3 = new FlowContainer(new BordaPontilhada());

        // Adicionando os elementos ao FlowContainerBordaPontilhada
        container3.addComponent(comboBox);
        container3.addComponent(label);
        container3.addComponent(radioButton);

        container3.doLayout();

        System.out.println("***************************************");

        // Criando um FlowContainerBordaSolida para adicionar os elementos
        Container container4 = new FlowContainer(new BordaSolida());

        // Adicionando os elementos ao FlowContainerBordaSolida
        container4.addComponent(comboBox);
        container4.addComponent(label);
        container4.addComponent(radioButton);

        container4.doLayout();

        System.out.println("***************************************");

        // Criando um GridContainerBordaSolida para adicionar os elementos
        Container container5 = new GridContainer(new BordaSolida(), 2, 2);

        // Adicionando os elementos ao GridContainerBordaSolida
        container5.addComponent(button);
        container5.addComponent(textBox);
        container5.addComponent(textField);
        container5.addComponent(checkBox);

        container5.doLayout();

        System.out.println("***************************************");

        // Criando um GridContainerBordaPontilhada para adicionar os elementos
        Container container6 = new GridContainer(new BordaPontilhada(), 2, 2);

        // Adicionando os elementos ao GridContainerBordaPontilhada
        container6.addComponent(button);
        container6.addComponent(textBox);
        container6.addComponent(textField);
        container6.addComponent(checkBox);

        container6.doLayout();
    }
}
