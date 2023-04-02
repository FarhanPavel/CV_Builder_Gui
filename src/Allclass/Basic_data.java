/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Allclass;

import java.util.Formatter;
import javax.swing.JTextField;

/**
 *
 * @author Youtech BD
 */
public class Basic_data extends Alldata {
    @Override
    public void set(JTextField[] textFields) {
        
         
        String []data=new String[15];
        int i=0;
        for (JTextField textField : textFields) {
        String value = textField.getText();
        data[i]=value;
        i++;
        }
        name=data[0];
        father_name=data[1];
        mother_name=data[2];
        add1=data[3];
        add2=data[4];
        mob=data[5];
        sex=data[6];
        nationality=data[7];
        dob=data[8];
        try {
            Formatter file =new Formatter("pavel.html");
            file.format("%s\n","<h1 style=color:blue align=center >Curriculum Vitae<h1>");
            file.format("%s\n\n\n\n\n\n","<table border=1 align =center width=1000 height=100 cellspacing=0 cellpadding=6>");
            file.format("%s","<tr><td><font size=5>Name</font></td>");
            file.format("%s%s%s","<td colspan=3><font size=5>",name,"</td></tr>");
            file.format("%s","<tr><td><font size=5>Father's Name</font></td>");
            file.format("%s%s%s","<td colspan=3><font size=5>",father_name,"</td></tr>");
            file.format("%s","<tr><td><font size=5>Mother's Name</font></td>");
            file.format("%s%s%s","<td colspan=3><font size=5>",mother_name,"</td></tr>");
            file.format("%s","<tr><td><font size=5>Present Address</font></td>");
            file.format("%s%s%s","<td colspan=3><font size=5>",add1,"</td></tr>");
            file.format("%s","<tr><td><font size=5>Permanent Address</font></td>");
            file.format("%s%s%s","<td colspan=3><font size=5>",add2,"</td></tr>");
            file.format("%s","<tr><td><font size=5>Moblie Number</font></td>");
            file.format("%s%s%s","<td colspan=3><font size=5>",mob,"</td></tr>");
            file.format("%s","<tr><td><font size=5>Date Of Birth</font></td>");
            file.format("%s%s%s","<td colspan=3><font size=5>",dob,"</td></tr>");
            file.format("%s","<tr><td><font size=5>Sex</font></td>");
            file.format("%s%s%s","<td colspan=3><font size=5>",sex,"</td></tr>");
            file.format("%s","<tr><td><font size=5>Nationality</font></td>");
            file.format("%s%s%s","<td colspan=3><font size=5>",nationality,"</td></tr>");
            file.format("%s","<tr><td colspan=4><font size=5>Educational Qualification</font></td></tr>");
            file.format("%s","<tr><td><font size=5>Degree</font></td>");
            file.format("%s","<td><font size=5>Board/University</font></td>");
            file.format("%s","<td><font size=5>GPA/CGPA</font></td>");
            file.format("%s","<td><font size=5>Pass.Year</font></td></tr>");
             file.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
}
   
}
