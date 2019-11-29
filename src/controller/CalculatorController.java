package controller;

import model.CalculatorModel;
import view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorController {

    private CalculatorView view;
    private CalculatorModel model;
    private String text = "0";
    private ArrayList<Double> numbers = new ArrayList();
    private boolean buttonClicked = true;
    private char sign = '\0';
    private double lastValue = 0.0;
    private char lastSign = '\0';

    public CalculatorController(CalculatorView calculatorView, CalculatorModel calculatorModel){
        view = calculatorView;
        model = calculatorModel;

        view.setEquallListner(new equallListner1());
        view.setACListner(new ACListner());
        view.setNegativeSignListner(new negativeSignListner());
        view.setZeroListner(new zeroListner());
        view.setOneListner(new oneListner());
        view.setTwoListner(new twoListner());
        view.setThreeListner(new threeListner());
        view.setFourListner(new fourListner());
        view.setFiveListner(new fiveListner());
        view.setSixListner(new sixListner());
        view.setSevenListner(new sevenListner());
        view.setEightListner(new eightListner());
        view.setNineListner(new nineListner());
        view.setPercentageListner(new percentageListner());
        view.setAddListner(new addListner());
        view.setSubtractListner(new subtractListner());
        view.setMultiplyListner(new multiplyListner());
        view.setDivideListner(new divideListner());
        view.setDotListner(new dotListner());
        view.setSquareListner(new squareListner() );
        view.setCubeListner(new cubeListner());
        view.setCustomPowerListner(new customPowerListner());
        view.setExpListner(new expListner());
        view.setSinListner(new sinListner());
        view.setCosListner(new cosListner());
        view.setTanListner(new tanListner());
        view.setSinhListner(new sinhListner());
        view.setCoshListner(new coshListner());
        view.setTanhListner(new tanhListner());
        view.setFactListner(new factListner());
        view.setReciprocalListner(new reciprocalListner());
        view.setSqrt3Listner(new cbrtListner());
        view.setSqrt2Listner(new sqrtListner());
        view.setPiListner(new piListner());
        view.setExpValueListner(new expValueListner());
        view.setRandListner(new randListner());
        view.setPowerOf10Listner(new powerOf10Listner());
        view.setLnListner(new lnListner());
        view.setLog10Listner(new log10Listner());
    }

    // helping methods
    private boolean isDotFound(){
        String hold = view.getText();
        for (int i=0; i<hold.length(); i++) {
            if (hold.charAt(i) == '.') {
                return true;
            }
        }
        return false;
    }

    private void calculation(){
        if (sign == '+') {
            numbers.add(lastValue = view.getNumber());
            double hold =  model.add(numbers);
            numbers.clear();
            numbers.add(hold);
            view.setNumber(numbers.get(0));
            lastSign = '+';
        }
        else  if (sign == '-') {
            numbers.add(lastValue = view.getNumber());
            double hold =  model.subtract(numbers);
            numbers.clear();
            numbers.add(hold);
            view.setNumber(numbers.get(0));
            lastSign = '-';
        }
        else  if (sign == '*') {
            numbers.add(lastValue = view.getNumber());
            double hold =  model.multiply(numbers);
            numbers.clear();
            numbers.add(hold);
            view.setNumber(numbers.get(0));
            lastSign = '*';
        }
        else  if (sign == '/') {
            numbers.add(lastValue = view.getNumber());
            double hold =  model.divide(numbers);
            numbers.clear();
            numbers.add(hold);
            view.setNumber(numbers.get(0));
            lastSign = '/';
        }
        else  if (sign == '^') {
            numbers.add(lastValue = view.getNumber());
            double hold =  model.customPower(numbers.get(0), lastValue);
            numbers.clear();
            numbers.add(hold);
            view.setNumber(numbers.get(0));
            lastSign = '^';
        }
        else if (sign == '='){
            numbers.add(lastValue);
            double hold = 0;
            switch (lastSign){
                case '+':
                    hold =  model.add(numbers);
                    break;
                case '-':
                    hold =  model.subtract(numbers);
                    break;
                case '*':
                    hold =  model.multiply(numbers);
                    break;
                case '/':
                    hold =  model.divide(numbers);
                    break;
                case '^':
                    hold =  model.customPower(numbers.get(0), lastValue);
                default:
                    hold = view.getNumber();
            }
            numbers.clear();
            numbers.add(hold);
            view.setNumber(numbers.get(0));
        }
        else {
            numbers.add(view.getNumber());
        }

    }


    class ACListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setCtoAC();
            text = "0";
            view.setText(text);
            numbers.clear();
            buttonClicked = true;
            lastValue = 0.0;
            lastSign ='\0';
            sign = '\0';
        }
    }

    class zeroListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (text == "0") {
                text = "0";
            }else {
                text += "0";
            }
            view.setText(text);
            buttonClicked = false;
        }
    }

    class oneListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setACtoC();
            if (text == "0") {
                text = "";
            }
            text+="1";
            view.setText(text);
            buttonClicked = false;
        }
    }

    class twoListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setACtoC();
            if (text == "0") {
                text = "";
            }
            text+="2";
            view.setText(text);
            buttonClicked = false;
        }
    }

    class threeListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setACtoC();
            if (text == "0") {
                text = "";
            }
            text+="3";
            view.setText(text);
            buttonClicked = false;
        }
    }

    class fourListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setACtoC();
            if (text == "0") {
                text = "";
            }
            text+="4";
            view.setText(text);
            buttonClicked = false;
        }
    }

    class fiveListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setACtoC();
            if (text == "0") {
                text = "";
            }
            text+="5";
            view.setText(text);
            buttonClicked = false;
        }
    }

    class sixListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setACtoC();
            if (text == "0") {
                text = "";
            }
            text+="6";
            view.setText(text);
            buttonClicked = false;
        }
    }

    class sevenListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setACtoC();
            if (text == "0") {
                text = "";
            }
            text+="7";
            view.setText(text);
            buttonClicked = false;
        }
    }

    class eightListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setACtoC();
            if (text == "0") {
                text = "";
            }
            text+="8";
            view.setText(text);
            buttonClicked = false;
        }
    }

    class nineListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setACtoC();
            if (text == "0") {
                text = "";
            }
            text+="9";
            view.setText(text);
            buttonClicked = false;
        }
    }

    class negativeSignListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(view.getText());
            if ( text != "0" && text.compareTo("0.") != 0) {
                text = "-"+text;
            }

            view.setText(text);
            buttonClicked = false;
        }
    }

    class percentageListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            text = "";
            view.setNumber(model.percentage(view.getNumber()));
        }
    }

    class addListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            text = "";
           if (!buttonClicked){
               calculation();
               buttonClicked = true;
           }
           //sign must be after the execution of calculation() method
            sign = '+';
        }
    }

    class subtractListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            text = "";
            if (!buttonClicked){
               calculation();
               buttonClicked = true;
            }
            sign = '-';
        }
    }

    class multiplyListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            text = "";
            if (!buttonClicked){
                calculation();
                buttonClicked = true;
            }
            sign = '*';
        }
    }

    class divideListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            text = "";
            if (!buttonClicked){
                calculation();
                buttonClicked = true;
            }
            sign = '/';
        }
    }

    class customPowerListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            text = "";
            if (!buttonClicked){
                calculation();
                buttonClicked = true;
            }
            sign = '^';
        }
    }

    class equallListner1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            text = "";
            calculation();
            sign = '=';
            buttonClicked = true;
        }
    }


    class dotListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setACtoC();
            if (!isDotFound()){
                text+=".";
            }
            else if (text.equals("")){
                text = "0.";
            }
            view.setText(text);
        }
    }

    class squareListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.square(view.getNumber()));
        }
    }

    class cubeListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.cube(view.getNumber()));
        }
    }

    class expListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.exp(view.getNumber()));
        }
    }

    class sinListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.sin(view.getNumber()));
        }
    }

    class cosListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.cos(view.getNumber()));
        }
    }

    class tanListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.tan(view.getNumber()));
        }
    }

    class sinhListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.sinh(view.getNumber()));
        }
    }

    class coshListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.cosh(view.getNumber()));
        }
    }

    class tanhListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.tanh(view.getNumber()));
        }
    }

    class factListner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.fact((int)view.getNumber()));
        }
    }

    class reciprocalListner implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.reciprocal(view.getNumber()));
        }
    }

    class piListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.getPi());
        }
    }

    class expValueListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.getExpValue());
        }
    }

    class randListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.getRand());
        }
    }

    class log10Listner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.log10(view.getNumber()));
        }
    }

    class lnListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.ln(view.getNumber()));
        }
    }

    class powerOf10Listner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.powerOf10(view.getNumber()));
        }
    }

    class sqrtListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.sqrt2(view.getNumber()));
        }
    }

    class cbrtListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setNumber(model.sqrt3(view.getNumber()));
        }
    }

}
