package Task1;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;

        Color(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return color;
        }
    }

    private Color currentColor;
    private boolean isCapped;

    public Pen() {
        this.currentColor = Color.RED;
        this.isCapped = true;
    }

    public Pen(Color currentColor) {
        this.currentColor = currentColor;
        this.isCapped = true;
    }

    public void capOn(){
        this.isCapped = true;
    }
    public void capOff(){
        this.isCapped = false;
    }
    public void changeColor(Color newColor) {
        if (isCapped) {
            this.currentColor = newColor;
        }
    }
    public String draw() {
        if (this.isCapped) {
            return "";
        }
        return "Drawing " + this.currentColor.toString();
    }

}