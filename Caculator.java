package First_App;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Caculator extends JFrame{
    /*
     * ͼ�λ��������
     * */
    private static final long serialVersionUID = 4907149509182425824L;
    public Caculator(){
        Container c = getContentPane(); //����һ����������c
        setLayout(new GridLayout(2,1));//�½����񲼾ֹ�������2��1��
        JTextField jtf = new JTextField("0",40);//����һ����ָ���ı����г�ʼ�������ı���--jtf
            jtf.setHorizontalAlignment(JTextField.RIGHT);//����ˮƽ���뷽ʽ�����Ҷ���
        JButton data0 = new JButton("0");
        JButton data1 = new JButton("1");
        JButton data2 = new JButton("2");
        JButton data3 = new JButton("3");
        JButton data4 = new JButton("4");
        JButton data5 = new JButton("5");
        JButton data6 = new JButton("6");
        JButton data7 = new JButton("7");
        JButton data8 = new JButton("8");
        JButton data9 = new JButton("9");
        JButton point = new JButton(".");
        JButton equ = new JButton("=");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mtp = new JButton("*");
        JButton dvd = new JButton("/");
        JButton sqr = new JButton("sqrt");
        JButton root = new JButton("x^2");
        JButton tg = new JButton("�˸�");
        JButton ql = new JButton("����");
        JPanel jp = new JPanel();   //�½�JPanel���--jp
        jp.setLayout(new GridLayout(4,5,5,5));//�½����񲼾ֹ�������������������������ˮƽ��ֱ��ࣩ
        jp.add(data7);
        jp.add(data8);
        jp.add(data9);
        jp.add(plus);
        jp.add(sqr);
        jp.add(data4);
        jp.add(data5);
        jp.add(data6);
        jp.add(minus);
        jp.add(root);
        jp.add(data1);
        jp.add(data2);
        jp.add(data3);
        jp.add(mtp);
        jp.add(ql);
        jp.add(data0);
        jp.add(point);
        jp.add(equ);
        jp.add(dvd);
        jp.add(tg);
        c.add(jtf);//���ı���jtf��ӵ���������c��
        c.add(jp);//��JPanel���jp��ӵ���������c��
        setSize(400,300);
        setTitle("������");
        setVisible(true);
        setResizable(false);//�����С�ɳ���Ա�������û��������ɸı��С
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*
         * *********************************************************
         *                  
                    ��ؼ��㹦�ܵ�ʵ��                             
         * *********************************************************
         * */

        data0.addActionListener(new ActionListener(){//����0������
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){//����ťֵ��0���Ƚ�
                    jtf.requestFocus();//�����뽹����ڵ�����������Ŀؼ���(���ѹ������ı���jtf��)
                }
                else{
                    String str = jtf.getText();//ȡ�õ�ǰ��ť�İ�ťֵ
                    jtf.setText(str+"0");   //���ı����ݺ�����ַ�0
                }
            }
        });
        data1.addActionListener(new ActionListener(){//����1������
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){//����ťֵ��0���Ƚ�
                    jtf.setText("");//���ı����ʼ��Ϊ��
                    jtf.setText("1");//���ı���������Ϊ 1
                    jtf.requestFocus();//�����뽹����ڵ�����������Ŀؼ���(���ѹ������ı���jtf��)
                }
                else{
                    String str = jtf.getText();//ȡ�õ�ǰ��ť�İ�ťֵ
                    jtf.setText(str+"1");   //���ı����ݺ�����ַ�1
                }
            }
        });
        data2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("2");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"2");
                }
            }
        });
        data3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("3");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"3");
                }
            }
        });
        data4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("4");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"4");
                }
            }
        });
        data5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("5");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"5");
                }
            }
        });
        data6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("6");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"6");
                }
            }
        });
        data7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("7");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"7");
                }
            }
        });
        data8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("8");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"8");
                }
            }
        });
        data9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("9");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"9");
                }
            }
        });
        point.addActionListener(new ActionListener(){    //��ŵ�����
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText(".");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+".");
                }
            }
        });
        plus.addActionListener(new ActionListener(){    //+�ŵ�����
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("+");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"+");
                }
            }
        });
        minus.addActionListener(new ActionListener(){    //-�ŵ�����
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("-");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"-");
                }
            }
        });
        mtp.addActionListener(new ActionListener(){    //*�ŵ�����
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("*");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"*");
                }
            }
        });
        dvd.addActionListener(new ActionListener(){    //���ŵ�����
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("/");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"/");
                }
            }
        });
        //��**�˸�������**��
        tg.addActionListener(new ActionListener(){//�����˸��
            public void actionPerformed(ActionEvent arg0){//�����˸�������µ��¼�
                String text = jtf.getText();
                int i = text.length();
                if(i>0){
                    text = text.substring(0,i-1);//ȥ�����һ���ַ�
                    if (text.length() == 0) {// ����ı�û�������ݣ����ʼ���������ĸ���ֵ
                        jtf.setText("0");
                    } else { // ��ʾ�µ��ı�
                        jtf.setText(text);
                }
            }
            }
        });
        //��**���㹦������**��
        ql.addActionListener(new ActionListener(){//���������
            public void actionPerformed(ActionEvent e) {
                jtf.setText("0");//���ı�����Ϊ0�����㹦�ܣ�
            }

        });
        //��**ƽ����������**��
        root.addActionListener(new ActionListener(){//����root��
            public void actionPerformed(ActionEvent e){//root�������¼�
                String i = jtf.getText();
                Double j = Double.parseDouble(i);//���ַ���iת���ɶ�Ӧ��double���͵���ֵ
                double ans = j*j;  //��ƽ��
                String answer =String.valueOf(ans);//��int������ת����String����
                jtf.setText(answer);//���ı�������Ϊƽ����Ľ��
            }
        });
        //��**������������**��
        sqr.addActionListener(new ActionListener(){//����sqrt��
            public void actionPerformed(ActionEvent e){//sqrt�������¼�
                String i = jtf.getText();
                Double j = Double.parseDouble(i);//���ַ���ת���ɶ�Ӧ��double���͵���ֵ
                double ans = (double)Math.sqrt(j);//�󿪷�
                String answer = String.valueOf(ans);//��double������ת����String����
                jtf.setText(answer);//���ı�������Ϊ������Ľ��
            }
        });

        //���Ⱥ�ʵ�� �Ӽ��˳� ���ܡ�
        equ.addActionListener(new ActionListener(){ //���� ���Ⱥš� ����
            public void actionPerformed(ActionEvent arg0){//�����Ⱥš� �����������¼�
                //��**�ӷ�����**��
                if(jtf.getText().indexOf("+")!= -1){
                    //���ַ����ָ�Ϊ���ַ�����Ȼ�󽫽����Ϊ�ַ������鷵��
                    String[] s = jtf.getText().split("[+]");//ת���ַ���Ҫ��"[+]"����"\+"
                    Double d1 = Double.parseDouble(s[0]);//����һ��ָ���ַ�����ʾ��doubleֵ
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1 + d2;
                    String answer = String.valueOf(ans);//�����ת��Ϊ�ַ���
                    jtf.setText(answer);//���ӷ�����Ľ�����ַ�����ʽ���ı�������ʾ
                }
                //��**��������**��
                else if(jtf.getText().indexOf("-")!= -1){
                    String[] s = jtf.getText().split("-");
                    jtf.setText("");
                    Double d1 = Double.parseDouble(s[0]);
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1-d2;
                    String answer =String.valueOf(ans);
                    jtf.setText(answer);
                }
                //��**�˷�����**��
                else if(jtf.getText().indexOf("*")!= -1){
                    String[] s = jtf.getText().split("[*]");//*��ת���ַ���Ҫ��"[*]",����"\*"
                    jtf.setText("");
                    Double d1 = Double.parseDouble(s[0]);
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1*d2;
                    String answer =String.valueOf(ans);
                    jtf.setText(answer);
                }
                //��**��������**��
                else if(jtf.getText().indexOf("/")!= -1){
                    String[] s = jtf.getText().split("/");
                    jtf.setText("");
                    Double d1 = Double.parseDouble(s[0]);
                    Double d2 = Double.parseDouble(s[1]);
                    double ans = d1/d2;
                    String answer =String.valueOf(ans);
                    jtf.setText(answer);
                }
                else{
                    jtf.setText("��ѡ��Ҫ���е�����");
                }
            }
        });
    }
    public static void main(String[] args) {
        new Caculator();
    }
}
