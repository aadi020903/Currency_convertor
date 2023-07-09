import java.awt.*;
import java.awt.event.*;


class currency_convertor implements ActionListener
{
    Frame f;
    double tot;
    int amount;
    Choice li1;
    Choice li2;
    TextField t1;
    TextField t2;
    Label l1;
    Label l2;
    Label l3;
    Label l4;
    Button b;

    currency_convertor()
    {

        li1 = new Choice();
         li2 = new Choice();
         t1 = new TextField(10);
         t2 = new TextField(10);
         l1 = new Label("Currency Convertor");
         l2 = new Label("Enter Amount");
         l3 = new Label("Select 1st Country");
        l4 = new Label("Select 2nd Country");
         b = new Button("Convert");
        
        
        f.setLayout(null);
        l1.setBounds(100, 0, 120, 30);
        l2.setBounds(10, 30, 120, 30);
        t1.setBounds(150, 30, 100, 25);
        l3.setBounds(10, 70, 120, 30);
        li1.setBounds(150, 70, 100, 30);
        l4.setBounds(10, 110, 120, 30);
        li2.setBounds(150, 110, 100, 30);
        b.setBounds(100, 150, 100, 30);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(l4);
        li1.addItem("INR");
        li1.addItem("USD");
        li1.addItem("EUR");
        li1.addItem("AUD");
        li1.addItem("CAD");
        
        f.add(li1);
       
        
        li2.addItem("INR");
        li2.addItem("USD");
        li2.addItem("EUR");
        li2.addItem("AUD");
        li2.addItem("CAD");
        
        f.add(li2);
        f.add(b);
        f.add(t2);
        
        
        b.addActionListener(this);
        
        f.setSize(500, 500);
        
        f.setVisible(true);

        t2.setEditable(false);
    }
   
     


    public void actionPerformed(ActionEvent e)
    {
            amount = Integer.parseInt(t1.getText());
            if(li1.getSelectedItem()== "INR" && li2.getSelectedItem() == "USD")
            {
                    tot = (amount* 0.0122);
                    t2.setText("US Dollar " + (tot));
            }
            else if(li1.getSelectedItem()== "INR" && li2.getSelectedItem() == "EUR")
            {
                    tot = (amount* 0.0112);
                    t2.setText(" Euro " + (tot));
            }
            else if(li1.getSelectedItem()== "INR" && li2.getSelectedItem() == "AUD")
            {
                    tot = (amount* 0.0184);
                    t2.setText("Australian Dollar " + (tot));
            }
            else if(li1.getSelectedItem()== "INR" && li2.getSelectedItem() == "CAD")
            {
                    tot = (amount* 0.0162);
                    t2.setText("Canadian Dollar " + (tot));
            }
            else if(li1.getSelectedItem()== "USD" && li2.getSelectedItem() == "INR")
            {
                    tot = (amount* 81.8305);
                    t2.setText("Indian Rupee " + (tot));
            }
            else if(li1.getSelectedItem()== "USD" && li2.getSelectedItem() == "EUR")
            {
                    tot = (amount* 0.9161);
                    t2.setText(" Euro " + (tot));
            }
            else if(li1.getSelectedItem()== "USD" && li2.getSelectedItem() == "CAD")
            {
                    tot = (amount* 1.3244);
                    t2.setText("Canadian Dollar " + (tot));
            }
            else if(li1.getSelectedItem()== "USD" && li2.getSelectedItem() == "AUD")
            {
                    tot = (amount* 1.4996);
                    t2.setText("Australian Dollar " + (tot));
            }
            else if(li1.getSelectedItem()== "EUR" && li2.getSelectedItem() == "INR")
            {
                    tot = (amount* 89.5832);
                    t2.setText("Indian Rupee " + (tot));
            }
            else if(li1.getSelectedItem()== "EUR" && li2.getSelectedItem() == "USD")
            {
                    tot = (amount* 1.0915);
                    t2.setText("US Dollar " + (tot));
            }
            else if(li1.getSelectedItem()== "EUR" && li2.getSelectedItem() == "CAD")
            {
                    tot = (amount* 1.4458);
                    t2.setText("Canadian Dollar " + (tot));
            }
            else if(li1.getSelectedItem()== "EUR" && li2.getSelectedItem() == "AUD")
            {
                    tot = (amount* 1.6372);
                    t2.setText("Australian Dollar " + (tot));
            }
            else if(li1.getSelectedItem()== "AUD" && li2.getSelectedItem() == "INR")
            {
                    tot = (amount* 89.5832);
                    t2.setText("Indian Rupee " + (tot));
            }
            else if(li1.getSelectedItem()== "AUD" && li2.getSelectedItem() == "USD")
            {
                    tot = (amount* 1.0915);
                    t2.setText("US Dollar " + (tot));
            }
            else if(li1.getSelectedItem()== "AUD" && li2.getSelectedItem() == "CAD")
            {
                    tot = (amount* 1.4458);
                    t2.setText("Canadian Dollar " + (tot));
            }
            else if(li1.getSelectedItem()== "AUD" && li2.getSelectedItem() == "EUR")
            {
                    tot = (amount* 1.6372);
                    t2.setText(" Euro" + (tot));
            }
    }

    public static void main(String[] args) {
        currency_convertor c1 = new currency_convertor();
    }
}
