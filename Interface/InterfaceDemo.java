package Interface;

interface AreaFind
{
    float triangleArea(float height, float wight);
}

public class InterfaceDemo implements AreaFind
{
    @Override
    public float triangleArea(float height, float wight) {return (height*wight)/2;}

    public static void main(String[] args) {
         InterfaceDemo obj = new InterfaceDemo();

        System.out.println(obj.triangleArea(4,3));
    }
}
