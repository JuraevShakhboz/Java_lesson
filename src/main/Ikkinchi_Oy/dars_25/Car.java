package Ikkinchi_Oy.dars_25;

public class Car {
    private String brendName;
    private Integer maxSpeed;
    private String dvigatel;

    public class Dvigatel{
        private Integer numberOfSlinder;
        private String typeOfFuel;

        public Dvigatel(Integer numberOfSlinder, String typeOfFuel) {
            this.numberOfSlinder = numberOfSlinder;
            this.typeOfFuel = typeOfFuel;
        }
    }
}
