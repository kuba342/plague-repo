package test;
import map.Map;
import map.Doctor;
import map.Man;

public class Test {
    public static void main(String[] Args) {
        Map mapa = new Map(10, 20);
        mapa.setField(new Man(), 5, 10);
        mapa.setField(new Man(), 5, 13);
        mapa.setField(new Doctor(), 6, 12);
        mapa.displayMap();
    }
}