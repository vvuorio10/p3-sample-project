package ro.uvt.p3;

import ro.uvt.p3.io.InputDevice;
import ro.uvt.p3.io.OutputDevice;

public class Application {
    private InputDevice id;
    private OutputDevice od;

    public Application(InputDevice id, OutputDevice od) {
        this.id = id;
        this.od = od;
    }

    public void run(){
        String line = id.nextLine();
        od.writeMessage(line);
    }
}
