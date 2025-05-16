package roteiro7.parte1;

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
        GridContainer container1 = new GridContainer(2, 2);

        // Adicionando os elementos ao GridContainer
        container1.addComponent(button);
        container1.addComponent(textBox);
        container1.addComponent(textField);
        container1.addComponent(checkBox);

        container1.doLayout();

        System.out.println("***************************************");

        // Criando um FlowContainer para adicionar os elementos
        FlowContainer container2 = new FlowContainer();

        // Adicionando os elementos ao FlowContainer
        container2.addComponent(comboBox);
        container2.addComponent(label);
        container2.addComponent(radioButton);

        container2.doLayout();
    }
}
