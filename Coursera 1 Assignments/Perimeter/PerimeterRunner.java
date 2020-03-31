import edu.duke.*;
import java.io.File;

public class PerimeterRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        int numberOfPoints = 0;
        for(Point p : s.getPoints()) {
            numberOfPoints++;
        }
        return numberOfPoints;
    }

    public double getAverageLength(Shape s) {
        double perimeter = getPerimeter(s);
        int numberofSides = getNumPoints(s);
        double averageLength = perimeter/numberofSides;
        return averageLength;
    }

    public double getLargestSide(Shape s) {
        Point prevPoint = s.getLastPoint();
        double largestDistance = 0.0;

        for(Point p : s.getPoints()) {
            double dist = prevPoint.distance(p);
            if(dist > largestDistance) {
                largestDistance = dist;
            }
            prevPoint = p;
        }
         return largestDistance;
    }

    public double getLargestX(Shape s) {
        Point prevPoint = s.getLastPoint();
        double largestX = prevPoint.getX();

        for(Point p : s.getPoints()) {
            double newX = p.getX();
            if(newX > largestX) {
                largestX = newX;
            }
        }
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        DirectoryResource dr = new DirectoryResource();
        double largestPerimeter = 0.0;

        for (File f : dr.selectedFiles()) {
            FileResource file = new FileResource();
            Shape s = new Shape(file);
            double perimeter = getPerimeter(s);
            if(perimeter > largestPerimeter) {
                largestPerimeter = perimeter;
            }
        }
        return largestPerimeter;
    }

    public String getFileWithLargestPerimeter() {
        DirectoryResource dr = new DirectoryResource();
        double largestPerimeter = 0.0;
        File largestFile = null;

        for (File f : dr.selectedFiles()) {
            FileResource file = new FileResource(f);
            Shape s = new Shape(file);
            double perimeter = getPerimeter(s);
            if(perimeter > largestPerimeter) {
                largestPerimeter = perimeter;
                largestFile = f;
            }
        }
        return largestFile.getParent();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
    }

    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}