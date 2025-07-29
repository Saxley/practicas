import Objetos.Point2d;
public abstract class Shape{
  private Point2d position;
  public Shape(final Point2d p){
    this.position = p;
  }
  public Shape(final Integer x, final Integer y){
    this.position = new Point2d(Double.parseDouble(x.toString()), Double.parseDouble(y.toString()));
  }
  public Shape(final Double x, final Double y){
    this.position = new Point2d(x,y);
  }
  public abstract Double getArea();
}