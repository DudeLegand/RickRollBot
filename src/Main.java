/*




            https://www.youtube.com/watch?v=dQw4w9WgXcQ

*/



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.awt.event.InputEvent;
import java.security.Key;




public class Main {

        public static void main(String[] args) throws IOException,
                AWTException, InterruptedException
        {
            /*
            String command = "notepad.exe";
            Runtime run = Runtime.getRuntime();
            run.exec(command);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // Create an instance of Robot class
            Robot robot = new Robot();
            https://www.youtube.com/watch?v=dQw4w9WgXcQ
               */

            Robot robot = new Robot();


            /*
            robot.mouseMove(1360,125);
            Thread.sleep(50);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(1000);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(188,140);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(588,140);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_C);
            Thread.sleep(25);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_C);
            Thread.sleep(100);
            */

            Thread.sleep(1000);

            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_C);
            Thread.sleep(25);
            robot.keyPress(KeyEvent.VK_H);
            robot.keyRelease(KeyEvent.VK_H);
            Thread.sleep(25);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyRelease(KeyEvent.VK_R);
            Thread.sleep(25);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyRelease(KeyEvent.VK_O);
            Thread.sleep(25);
            robot.keyPress(KeyEvent.VK_M);
            robot.keyRelease(KeyEvent.VK_M);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
                    //https://www.youtube.com/watch?v=dQw4w9WgXcQ
            String b="https //www.youtube.com/watch v=d w4w9 g c ";
            char x = 'A';
            int y=b.length() + 1,z=0,w=0;

            for (int i = 0; z < b.length(); z++){
                if (i == 4){
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    Thread.sleep(100);
                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    Thread.sleep(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    Thread.sleep(100);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                    Thread.sleep(100);
                } else if(i == 28) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_SLASH);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_SLASH);
                } else if(i == 32) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_Q);
                } else if(i == 37) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_W);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_W);
                } else if(i == 39) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_X);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_X);
                } else if(i == 41) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_Q);
                } else {
                    x = b.charAt(z);
                    w = (int) x; //converts character to Unicode.
                    robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(w));
                }
                i=z;
                Thread.sleep(10);
            }

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            /*
            Thread.sleep(500);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyRelease(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyRelease(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_T);
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
            Thread.sleep(50);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(1000);

            String a="Get Rick Rolled.";
            char c = 'A';
            int d=a.length() + 1,e=0,f=0;

            for (int i = 0; e < a.length(); e++){
                c = a.charAt(e);
                f = (int) c; //converts character to Unicode.
                robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(f));

                i=e;
                Thread.sleep(100);
            }

             */
        }
    }