/*
* 第三次上传，代码没变
* */

package YilLint.com;

import java.util.Scanner;

public class caculator {
    public static  void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double x,y,z;
        System.out.println("请先输入圆的横坐标");
        x= reader.nextDouble();
        System.out.println("请先输入圆的纵坐标");
        y= reader.nextDouble();
        System.out.println("请先输入圆的半径");
        z= reader.nextDouble();
        System.out.println("现在是第二次上传咯");

        Circle circle= new Circle();
        circle.setvalues(x,y,z);
        circle.getvalues();
        circle.Area();
        circle.perimeter();
    }
}

class Circle{
    double x,y,z;

    void setvalues(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    void getvalues(){
        System.out.println("圆的坐标是"+"("+x+","+y+")"+"半径是"+z);
    }
    void Area(){
        System.out.println("该圆的面积为"+Math.PI*z*z);
    }
    void perimeter(){
        System.out.println("该圆的周长为"+Math.PI*2*z);
    }
}

