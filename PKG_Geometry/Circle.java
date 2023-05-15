//Circle Class inside Package Geometry

package PKG_Geometry;

public class Circle 
{
    private float radius;

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public float getRadius()
    {
        return radius;
    }

    public float getArea()
    {
        final float PI = 3.14f;
        return (PI * radius * radius);
    }

    public float getPerimeter()
    {
        final float PI = 3.14f;
        return (2 * PI * radius);
    }    
}