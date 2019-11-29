package model;

import java.util.ArrayList;

public class CalculatorModel {

    private double result = 0;

    public double add(ArrayList<Double> v) {
        double sum = 0;
        for (int i=0; i<v.size(); i++){
            sum += v.get(i);
        }
        result = sum;
        return result;
    }

    public double subtract(ArrayList<Double> v) {
        double subtract = v.get(0);
        for (int i=1; i<v.size(); i++){
            subtract -= v.get(i);
        }
        result = subtract;
        return result;
    }

    public double multiply(ArrayList<Double> v) {
        double mul = 1;
        for (int i=0; i<v.size(); i++){
            mul *= v.get(i);
        }
        result = mul;
        return result;
    }

    public double divide(ArrayList<Double> v) {
        double div = v.get(0);
        for (int i=1; i<v.size(); i++){
            div /= v.get(i);
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

    public double getPi(){
        result = 3.14159265;
        return result;
    }

    public double getRand() {
        result = Math.random();
        return result;
    }

    public double getExpValue(){
        result = 2.71828182;
        return result;
    }

    public double getResult() {
        return result;
    }
}
