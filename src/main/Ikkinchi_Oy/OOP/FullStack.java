package Ikkinchi_Oy.OOP;

public class FullStack implements BackendBuildable, DesignBuildable {

    @Override
    public void Backend() {
        System.out.println("Backend Developer");
    }

    @Override
    public void Design() {
        System.out.println("Frontend Developer");
    }
}
