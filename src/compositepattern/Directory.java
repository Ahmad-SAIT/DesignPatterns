package compositepattern;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ahxxm
 */

// Composite class representing directories
class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        System.out.println("Contents:");
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}

