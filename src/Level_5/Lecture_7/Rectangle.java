package Level_5.Lecture_7;

public class Rectangle {
    int left = 0, top = 0, width = 0, height = 0;

    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top){
        this.left = left;
        this.top = top;
    }

    public void initialize(int left, int width, int height){
        this.left = left;
        this.top = width;
        this.width = width;
        this.height = height;
    }

    public void initialize(Rectangle rectangle){
        this.left = rectangle.left;
        this.top = rectangle.width;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {
    }
}
