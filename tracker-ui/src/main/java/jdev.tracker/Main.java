package jdev.tracker;

import jdev.dto.PointDTO;

/**
 * Created by user on 31.01.2021.
 */
public class Main {
    public static  void main(String... args) throws Exception {
        for (int i=0; i<5; i++) {
            System.out.println("tracker ui main here");
            PointDTO point= new PointDTO();
            point.setLat(45);
            System.out.println(point.toJson());
            Thread.sleep(1000);
        }
    }
}
