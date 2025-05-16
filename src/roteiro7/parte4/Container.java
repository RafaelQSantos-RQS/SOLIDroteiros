package roteiro7.parte4;

public abstract class Container {

    protected Borda borda;

    public Container () {}

    public Container (Borda borda) {
        this.borda = borda;
    }

    /**
     * Add a component to this container.
     *
     * @param component The component to be added.
     */
    public abstract void addComponent (Component component);

    /**
     * Remove a component from this container.
     *
     * @param component The component to be removed.
     */
    public abstract void removeComponent (Component component);

    /**
     * Do the layout of all components in this container.
     */
    public abstract void doLayout ();

    /**
     * Disposes this container.
     */
    public void dispose () {
        System.out.println("Disposing container...");
    }
}
