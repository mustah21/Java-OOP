public class Television {

    private boolean on;
    private int channel;
    //private boolean off;

    public Television() {
        on = false;
        //off = true;
        channel = 1;
    }

    public void pressOnOff() {
        on = !on; //toggle
    }

    public boolean isOn() {
        return on;
    }

    public boolean isOff() {
        return !on;
    }

    public void setChannel(int x) {
        //System.out.println("Watching channel: " + " " + x);
        channel = x;
    }

    public int getChannel() {
/*      if (channel == 11) {
            return channel = 1;
        } else {
            return channel;
*/
        return channel == 11 ? (channel = 1):channel;

    }
}
