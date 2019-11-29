package model;

public class CalculatorModel {

    private double result = 0;

    public double add(double ... v) {
        double sum = 0;
        for (int i=0; i<v.length; i++){
            sum += v[i];
        }
        result = sum;
        return result;
    }

    public double subtract(double ... v) {
        double subtract = v[0];
        for (int i=0; i<v.length -1; i++){
            subtract -= v[i+1];
        }
        result = subtract;
        return result;
    }

    public double multiply(double ... v) {
        double mul = 1;
        for (int i=0; i<v.length; i++){
            mul *= v[i];
        }
        result = mul;
        return result;
    }

    public double divide(double ... v) {
        double div = v[0];
        for (int i=1; i<v.length; i++){
            div /= v[i];
        }
        result = div;
        return result;
    }

    public double percentage(double v){
        result = v/100;
        return result;
    }

    public double square(double v) {
        result = Math.pow(v,2);
        return result;
    }

    public double cube(double v) {
        result = Math.pow(v,3);
        return result;
    }

    public double customPower(double v1, double v2) {
        result = Math.pow(v1,v2);
        return result;
    }

    public double exp(double v) {
        result = Math.exp(v);
        return result;
    }

    public double powerOf10(double v){
        result = Math.pow(10,v);
        return result;
    }

    public double sqrt2(double v){
        result = Math.sqrt(v);
        return result;
    }

    public double sqrt3(double v){
        result = Math.cbrt(v);
        return result;
    }

    public double ln(double v){
        result = Math.log(v);
        return result;
    }

    public double log10(double v){
        result = Math.log10(v);
        return result;
    }

    public double reciprocal(double v) {
        result = 1/v;
        return result;
    }

    public double fact(int v){
        int fact = 1;
        for (int i = v; i>0; i--){
            fact *= i;
        }
        result = fact;
        return result;
    }

    public double sin(double x) {
        result = Math.sin(x);
        return result;
    }

    public double cos(double x) {
        result = Math.cos(x);
        return result;
    }

    public double tan(double x) {
        result = Math.tan(x);
        return result;
    }

    public double sinh(double x) {
        result = Math.sinh(x);
        return result;
    }

    public double cosh(double x) {
        result = Math.cosh(x);
        return result;
    }

    public double tanh(double x) {
        result = Math.tanh(x);
        return result;
    }

    public double pi(){
        result = 3.14159265;
        return result;
    }

    public double rand(double x) {
        result = Math.random();
        return result;
    }

    public double expValue(){
        result = 2.71828182;
        return result;
    }

    public double getResult() {
        return result;
    }
}
