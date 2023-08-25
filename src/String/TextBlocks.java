package String;

public class TextBlocks {
    public static void main(String[] args) {

        String textBlocks = """
                This is a text block.
                It has multiple lines.
                """;
        System.out.println(textBlocks);

        String sql = """
                SELECT
                    id, title, description
                FROM
                    books
                WHERE
                    title = "%s"
                """;
        sql = sql.formatted("Java");
        sql = sql.indent(2);
        System.out.println(sql);

    }
}
