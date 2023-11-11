public class Circle {
    public double radius;
    public int x, y;

    public Circle()
    {
        radius = 0;
        x = 0;
        y = 0;
    }

    public Circle(double radius)
    {
        this.radius = radius;
        x = 0;
        y = 0;
    }

    public Circle(int x, int y)
    {
        this.x = x;
        this.y = y;
        radius = 0;
    }
    public Circle(double radius, int x, int y)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show()
    {
        System.out.println("Radius: " + radius + " X: " + x + " Y: " + y);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  void setCenter(int x, int y)
    {
        this.x += x;
        this.y += y;
    }
    public double square()
    {
        return Math.PI * radius * radius;
    }
    public double length()
    {
        return 2 * Math.PI * radius;
    }
}
