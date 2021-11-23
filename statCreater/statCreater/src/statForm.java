import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.util.*;

public class statForm {
    private JButton button1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JPanel comboPanel;
    private JPanel mainPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel strLabel;
    private JLabel dexLabel;
    private JLabel conLabel;
    private JLabel intLabel;
    private JLabel wisLabel;
    private JLabel chaLabel;
    private JLabel strMLabel;
    private JLabel dexMLabel;
    private JLabel conMLabel;
    private JLabel intMLabel;
    private JLabel chaMLabel;
    private JLabel wisMLabel;
    private JTextField textField1;

    int str, dex, con, in, wis, cha;
    int max = 6;
    int min = 1;
    int range = max - min + 1;

    public statForm(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] dices;
                dices = new int[24];
                for (int i = 0; i < 24; i++){
                    dices[i] = (int)(Math.random()*range)+min;
                }
                //STR dice roller
                int dice1 = dices[0], dice2 = dices[1], dice3 = dices[2], dice4 = dices[3];
                String dice1S = String.valueOf(dice1);
                String dice2S = String.valueOf(dice2);
                String dice3S = String.valueOf(dice3);
                String dice4S = String.valueOf(dice4);
                label1.setText(dice1S+","+dice2S+","+dice3S+","+dice4S);
                int[] strDices;
                strDices = new int[4];
                strDices[0] = dice1;
                strDices[1] = dice2;
                strDices[2] = dice3;
                strDices[3] = dice4;
                Arrays.sort(strDices);
                str = strDices[1] + strDices[2] + strDices[3];
                String strS = String.valueOf(str);
                strLabel.setText(strS);
                float strModifier = (float) Math.floor((str - 10)/2.0);
                if(strModifier > 0){
                    String strMS = String.valueOf(strModifier);
                    strMLabel.setText("+"+strMS);
                    if (str == 11) {
                        strMLabel.setText(strMS);
                    }
                }
                else if (strModifier < 0){
                    String strMS = String.valueOf(strModifier);
                    strMLabel.setText(strMS);
                }
                else{
                    String strMS = String.valueOf(strModifier);
                    strMLabel.setText(strMS);
                }
                //DEX dice roller
                int dice5 = dices[4], dice6 = dices[5], dice7 = dices[6], dice8 = dices[7];
                String dice5S = String.valueOf(dice5);
                String dice6S = String.valueOf(dice6);
                String dice7S = String.valueOf(dice7);
                String dice8S = String.valueOf(dice8);
                label2.setText(dice5S+","+dice6S+","+dice7S+","+dice8S);
                int[] dexDices;
                dexDices = new int[4];
                dexDices[0] = dice5;
                dexDices[1] = dice6;
                dexDices[2] = dice7;
                dexDices[3] = dice8;
                Arrays.sort(dexDices);
                dex = dexDices[1] + dexDices[2] + dexDices[3];
                String dexS = String.valueOf(dex);
                dexLabel.setText(dexS);
                float dexModifier = (float) Math.floor((dex - 10)/2.0);
                if(dexModifier > 0){
                    String dexMS = String.valueOf(dexModifier);
                    dexMLabel.setText("+"+dexMS);
                    if (dex == 11) {
                        dexMLabel.setText(dexMS);
                    }
                }
                else if (dexModifier < 0){
                    String dexMS = String.valueOf(dexModifier);
                    dexMLabel.setText(dexMS);
                }
                else{
                    String dexMS = String.valueOf(strModifier);
                    dexMLabel.setText(dexMS);
                }
                //CON dice roller
                int dice9 = dices[8], dice10 = dices[9], dice11 = dices[10], dice12 = dices[11];
                String dice9S = String.valueOf(dice9);
                String dice10S = String.valueOf(dice10);
                String dice11S = String.valueOf(dice11);
                String dice12S = String.valueOf(dice12);
                label3.setText(dice9S+","+dice10S+","+dice11S+","+dice12S);
                int[] conDices;
                conDices = new int[4];
                conDices[0] = dice9;
                conDices[1] = dice10;
                conDices[2] = dice11;
                conDices[3] = dice12;
                Arrays.sort(conDices);
                con = conDices[1] + conDices[2] + conDices[3];
                String conS = String.valueOf(con);
                conLabel.setText(conS);
                float conModifier = (float) Math.floor((con - 10)/2.0);
                if(conModifier > 0){
                    String conMS = String.valueOf(conModifier);
                    conMLabel.setText("+"+conMS);
                    if (con == 11) {
                        conMLabel.setText(conMS);
                    }
                }
                else if (conModifier < 0){
                    String conMS = String.valueOf(conModifier);
                    conMLabel.setText(conMS);
                }
                else{
                    String conMS = String.valueOf(conModifier);
                    conMLabel.setText(conMS);
                }
                //INT dice roller
                int dice13 = dices[12], dice14 = dices[13], dice15 = dices[14], dice16 = dices[15];
                String dice13S = String.valueOf(dice13);
                String dice14S = String.valueOf(dice14);
                String dice15S = String.valueOf(dice15);
                String dice16S = String.valueOf(dice16);
                label4.setText(dice13S+","+dice14S+","+dice15S+","+dice16S);
                int[] intDices;
                intDices = new int[4];
                intDices[0] = dice13;
                intDices[1] = dice14;
                intDices[2] = dice15;
                intDices[3] = dice16;
                Arrays.sort(intDices);
                in = intDices[1] + intDices[2] + intDices[3];
                String intS = String.valueOf(in);
                intLabel.setText(intS);
                float intModifier = (float) Math.floor((in - 10)/2.0);
                if(intModifier > 0){
                    String intMS = String.valueOf(intModifier);
                    intMLabel.setText("+"+intMS);
                    if (in == 11) {
                        intMLabel.setText(intMS);
                    }
                }
                else if (intModifier < 0){
                    String intMS = String.valueOf(intModifier);
                    intMLabel.setText(intMS);
                }
                else{
                    String intMS = String.valueOf(intModifier);
                    intMLabel.setText(intMS);
                }
                //WIS dice roller
                int dice17 = dices[16], dice18 = dices[17], dice19 = dices[18], dice20 = dices[19];
                String dice17S = String.valueOf(dice17);
                String dice18S = String.valueOf(dice18);
                String dice19S = String.valueOf(dice19);
                String dice20S = String.valueOf(dice20);
                label5.setText(dice17S+","+dice18S+","+dice19S+","+dice20S);
                int[] wisDices;
                wisDices = new int[4];
                wisDices[0] = dice17;
                wisDices[1] = dice18;
                wisDices[2] = dice19;
                wisDices[3] = dice20;
                Arrays.sort(wisDices);
                wis = wisDices[1] + wisDices[2] + wisDices[3];
                String wisS = String.valueOf(wis);
                wisLabel.setText(wisS);
                float wisModifier = (float) Math.floor((wis - 10)/2.0);
                if(wisModifier > 0){
                    String wisMS = String.valueOf(wisModifier);
                    wisMLabel.setText("+"+wisMS);
                    if (wis == 11) {
                        wisMLabel.setText(wisMS);
                    }
                }
                else if (wisModifier < 0){
                    String wisMS = String.valueOf(wisModifier);
                    wisMLabel.setText(wisMS);
                }
                else{
                    String wisMS = String.valueOf(wisModifier);
                    wisMLabel.setText(wisMS);
                }
                //CHA dice roller
                int dice21 = dices[20], dice22 = dices[21], dice23 = dices[22], dice24 = dices[23];
                String dice21S = String.valueOf(dice21);
                String dice22S = String.valueOf(dice22);
                String dice23S = String.valueOf(dice23);
                String dice24S = String.valueOf(dice24);
                label6.setText(dice21S+","+dice22S+","+dice23S+","+dice24S);
                int[] chaDices;
                chaDices = new int[4];
                chaDices[0] = dice21;
                chaDices[1] = dice22;
                chaDices[2] = dice23;
                chaDices[3] = dice24;
                Arrays.sort(chaDices);
                cha = chaDices[1] + chaDices[2] + chaDices[3];
                String chaS = String.valueOf(cha);
                chaLabel.setText(chaS);
                float chaModifier = (float) Math.floor((cha - 10)/2.0);
                if(chaModifier > 0){
                    String chaMS = String.valueOf(chaModifier);
                    chaMLabel.setText("+"+chaMS);
                    if (cha == 11) {
                        chaMLabel.setText(chaMS);
                    }
                }
                else if (chaModifier < 0){
                    String chaMS = String.valueOf(chaModifier);
                    chaMLabel.setText(chaMS);
                }
                else{
                    String chaMS = String.valueOf(chaModifier);
                    chaMLabel.setText(chaMS);
                }
            }
        }
        );
    comboBox2.addComponentListener(new ComponentAdapter() { } );}
    public static void main(String[] args) {
        JFrame frame = new JFrame("mainPanel");
        frame.setContentPane(new statForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}