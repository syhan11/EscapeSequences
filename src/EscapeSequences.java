/*
 * Write a Java program to print a box, an oval, or a diamond (choose one) using asterisks.
 */

public class EscapeSequences {
    public static String drawTopBottom(int max, char charSymb) {
        String tmpLine = "";
        int cnt = 0;

        do {
            tmpLine = tmpLine + charSymb;
            cnt++;
        } while (cnt < max);
        tmpLine = tmpLine + '\n';

        return(tmpLine);
    }

    public static String drawSide(int max, char charSymb) {
        String tmpLine = "";
        char symb = ' ';
        int cnt = 1;

        tmpLine = tmpLine + charSymb;
        while (cnt < max) {
            tmpLine = tmpLine + symb;
            cnt++;
        }

        tmpLine = tmpLine + charSymb + '\n';

        return(tmpLine);
        }

    public static void drawRectangle(int maxL, int maxW, char symChar){
        int cntLine = 0, cntWidth = 0;
        String drawLine = "";

        drawLine = drawTopBottom(maxW, symChar);           // top line

        cntLine = 2;                                       // subtract top & bottom line
        while (cntLine < maxL) {
            drawLine = drawLine + drawSide(maxW - 1, symChar);
            cntLine++;
        }

        drawLine = drawLine + drawTopBottom(maxW, symChar); // bottom line

        System.out.println(drawLine);
    }

    public static void main(String[] arg) {
        final char SYMB = '*';
        int maxWidth = 8, maxHeight = 6;

        drawRectangle(maxHeight, maxWidth, SYMB);
    }
}
