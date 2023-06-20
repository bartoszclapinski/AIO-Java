package AccessSpecifiers.Exercise1;

import AccessSpecifiers.Exercise1.controller.PointController;
import AccessSpecifiers.Exercise1.data.Point;

public class PointApp {
    public static void main(String[] args) {
        Point point = new Point(1, 1);
        PointController pointController = new PointController();

        pointController.addX(point);
        pointController.addY(point);
        pointController.addY(point);
        pointController.minusX(point);
        pointController.minusY(point);

        System.out.println(point);

    }
}
