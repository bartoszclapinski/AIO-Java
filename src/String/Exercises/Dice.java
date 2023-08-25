package String.Exercises;

import java.util.Random;

public class Dice {
    private final static Random RANDOM = new Random();
    private final static String[] SIDES = {
            """
                    +-------+
                    |       |
                    |   *   |
                    |       |
                    +-------+
                    """,
            """
                    +-------+
                    | *     |
                    |       |
                    |     * |
                    +-------+
                    """,
            """
                    +-------+
                    | *     |
                    |   *   |
                    |     * |
                    +-------+
                    """,
            """
                    +-------+
                    | *   * |
                    |       |
                    | *   * |
                    +-------+
                    """,
            """
                    +-------+
                    | *   * |
                    |   *   |
                    | *   * |
                    +-------+
                    """,
            """
                    +-------+
                    | *   * |
                    | *   * |
                    | *   * |
                    +-------+
                    """
    };

    static String roll() {
        return SIDES[RANDOM.nextInt(6)];
    }
}
