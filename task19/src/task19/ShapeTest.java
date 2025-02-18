package task19;


	interface Shape{
		double calculateArea();
	}
	abstract class Rectangle implements Shape{
		protected double width;
		protected double height;
		
		public Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}
	}
	public class ShapeTest {

		public static void main(String[] args) {
			Rectangle rectangle = new Rectangle(5,10) {
				
				@Override
				public double calculateArea() {
					return width * height;
				}
			};
			class Circle implements Shape{
				private double radius;
				
				public Circle(double radius) {
					this.radius=radius;
				}
				@Override
				public double calculateArea() {
					return Math.PI * radius * radius;
				}
			}
			Circle circle  = new Circle(7);
			System.out.println("Rectangle area : "+ rectangle.calculateArea());
			
			System.out.println("circle area : "+ circle.calculateArea());	
		}
	}

	