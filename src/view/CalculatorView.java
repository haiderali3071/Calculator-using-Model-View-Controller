package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {

    private JFrame frame;
    private JPanel panel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel upperPanel;
    private JButton AC = new JButton("AC");
    private JButton zero = new JButton("0");
    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");
    private JButton negativeSign = new JButton("+/-");
    private JButton percentage = new JButton("%");
    private JButton divide = new JButton("÷");
    private JButton multiply = new JButton("×");
    private JButton subtract = new JButton("-");
    private JButton add = new JButton("+");
    private JButton dot = new JButton(".");
    private JButton equall = new JButton("=");
    private JButton square = new JButton("x²");
    private JButton cube = new JButton("x³");
    private JButton customPower = new JButton("xⁿ");
    private JButton exp = new JButton("eⁿ");
    private JButton powerOf10 = new JButton("10ⁿ");
    private JButton sqrt2 = new JButton("²√x");
    private JButton sqrt3 = new JButton("³√x");
    private JButton ln = new JButton("ln");
    private JButton log10 = new JButton("log₁₀");
    private JButton oneOverX = new JButton("¹∕ᵪ");
    private JButton fact = new JButton("x!");
    private JButton sin = new JButton("sin");
    private JButton cos = new JButton("cos");
    private JButton tan = new JButton("tan");
    private JButton sinh = new JButton("sinh");
    private JButton cosh = new JButton("cosh");
    private JButton tanh = new JButton("tanh");
    private JButton pi = new JButton("π");
    private JButton rand = new JButton("Rand");
    private JButton expValue = new JButton("e");
    private JTextField textValue = new JTextField("0", 25);

    public CalculatorView() {

        // frame in which we'll add a panel later
        frame = new JFrame();
        Dimension dimension = new Dimension(600, 300);
        frame.setLayout(new BorderLayout());
        frame.setSize(dimension);
        frame.setMinimumSize(dimension);
        frame.setMaximumSize(dimension);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        // rightPanel is a panel in which simple functionality buttons included
        rightPanel = new JPanel(new GridLayout(5, 4));

        // buttons added in right panel
        rightPanel.add(AC);
        rightPanel.add(negativeSign);
        rightPanel.add(percentage);
        rightPanel.add(divide);
        rightPanel.add(seven);
        rightPanel.add(eight);
        rightPanel.add(nine);
        rightPanel.add(multiply);
        rightPanel.add(four);
        rightPanel.add(five);
        rightPanel.add(six);
        rightPanel.add(subtract);
        rightPanel.add(one);
        rightPanel.add(two);
        rightPanel.add(three);
        rightPanel.add(add);
        rightPanel.add(zero);
        rightPanel.add(dot);
        rightPanel.add(equall);

        //upper panel is a panel in which we add text field
        textValue.setBackground(Color.gray);
        textValue.setForeground(Color.white);
        upperPanel = new JPanel(new BorderLayout());
        upperPanel.add(textValue, BorderLayout.CENTER);

        // left panel is a panel in which complex functionality buttons included
        leftPanel = new JPanel(new GridLayout(5, 4));

        // buttons added in left panel
        leftPanel.add(square);
        leftPanel.add(cube);
        leftPanel.add(customPower);
        leftPanel.add(exp);
        leftPanel.add(powerOf10);
        leftPanel.add(sqrt2);
        leftPanel.add(sqrt3);
        leftPanel.add(ln);
        leftPanel.add(log10);
        leftPanel.add(oneOverX);
        leftPanel.add(fact);
        leftPanel.add(sin);
        leftPanel.add(cos);
        leftPanel.add(tan);
        leftPanel.add(sinh);
        leftPanel.add(cosh);
        leftPanel.add(tanh);
        leftPanel.add(pi);
        leftPanel.add(rand);
        leftPanel.add(expValue);

        // panel in which we add all panels
        panel = new JPanel(new BorderLayout());

        // all three panels added in a single panel
        panel.add(upperPanel, BorderLayout.NORTH);
        panel.add(leftPanel, BorderLayout.WEST);
        panel.add(rightPanel, BorderLayout.EAST);

        // panel added in frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }

    public void setACtoC() {
        this.AC.setText("C");
    }

    public void setCtoAC() {
        this.AC.setText("AC");
    }

    public double getNumber() {
        return Double.parseDouble(textValue.getText());
    }

    public void setNumber(double value) {
        int conciseValue = (int) value;
        if (value - conciseValue == 0) {
            this.textValue.setText(String.valueOf(conciseValue));
        } else {
            this.textValue.setText(String.valueOf(value));
        }
    }

    public void setText(String value) {
        this.textValue.setText(value);
    }

    public String getText() {
        return this.textValue.getText();
    }

    public void setACListner(ActionListener e) {
        this.AC.addActionListener(e);
    }

    public void setZeroListner(ActionListener e) {
        this.zero.addActionListener(e);
    }

    public void setOneListner(ActionListener e) {
        this.one.addActionListener(e);
    }

    public void setTwoListner(ActionListener e) {
        this.two.addActionListener(e);
    }

    public void setThreeListner(ActionListener e) {
        this.three.addActionListener(e);
    }

    public void setFourListner(ActionListener e) {
        this.four.addActionListener(e);
    }

    public void setFiveListner(ActionListener e) {
        this.five.addActionListener(e);
    }

    public void setSixListner(ActionListener e) {
        this.six.addActionListener(e);
    }

    public void setSevenListner(ActionListener e) {
        this.seven.addActionListener(e);
    }

    public void setEightListner(ActionListener e) {
        this.eight.addActionListener(e);
    }

    public void setNineListner(ActionListener e) {
        this.nine.addActionListener(e);
    }

    public void setNegativeSignListner(ActionListener e) {
        this.negativeSign.addActionListener(e);
    }

    public void setPercentageListner(ActionListener e) {
        this.percentage.addActionListener(e);
    }

    public void setAddListner(ActionListener e) {
        this.add.addActionListener(e);
    }

    public void setSubtractListner(ActionListener e) {
        this.subtract.addActionListener(e);
    }

    public void setMultiplyListner(ActionListener e) {
        this.multiply.addActionListener(e);
    }

    public void setDivideListner(ActionListener e) {
        this.divide.addActionListener(e);
    }

    public void setDotListner(ActionListener e) {
        this.dot.addActionListener(e);
    }

    public void setEquallListner(ActionListener e) {
        this.equall.addActionListener(e);
    }


    public void setSquareListner(ActionListener e) {
        this.square.addActionListener(e);
    }

    public void setSinListner(ActionListener e) {
        this.sin.addActionListener(e);
    }

    public void setCosListner(ActionListener e) {
        this.cos.addActionListener(e);
    }

    public void setTanListner(ActionListener e) {
        this.tan.addActionListener(e);
    }

    public void setSinhListner(ActionListener e) {
        this.sinh.addActionListener(e);
    }

    public void setCoshListner(ActionListener e) {
        this.cosh.addActionListener(e);
    }

    public void setTanhListner(ActionListener e) {
        this.tanh.addActionListener(e);
    }

    public void setPiListner(ActionListener e) {
        this.pi.addActionListener(e);
    }

    public void setRandListner(ActionListener e) {
        this.rand.addActionListener(e);
    }

    public void setExpListner(ActionListener e) {
        this.exp.addActionListener(e);
    }

    public void setExpValueListner(ActionListener e) {
        this.expValue.addActionListener(e);
    }

    public void setCubeListner(ActionListener e) {
        this.cube.addActionListener(e);
    }

    public void setCustomPowerListner(ActionListener e) {
        this.customPower.addActionListener(e);
    }

    public void setPowerOf10Listner(ActionListener e) {
        this.powerOf10.addActionListener(e);
    }

    public void setSqrt2Listner(ActionListener e) {
        this.sqrt2.addActionListener(e);
    }

    public void setSqrt3Listner(ActionListener e) {
        this.sqrt3.addActionListener(e);
    }


    public void setLnListner(ActionListener e) {
        this.ln.addActionListener(e);
    }

    public void setLog10Listner(ActionListener e) {
        this.log10.addActionListener(e);
    }

    public void setReciprocalListner(ActionListener e) {
        this.oneOverX.addActionListener(e);
    }

    public void setFactListner(ActionListener e) {
        this.fact.addActionListener(e);
    }

}
