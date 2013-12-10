/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9;

import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class Message {
   private String to;
   private String subject;
   private String message;

    public Message() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) throws Exception{
        String pola="[a-zA-Z0-9\\._]*@[A-Za-z0-9]*\\.[A-Za-z0-9\\.]*";
        if(to.matches(pola)){
            this.to=to;
        }
        else{
            throw new Exception("Alamat email harus mengandung @ dan dot, serta hanya terdiri dari kata dan angka");
        }
    }

    public void setSubject(String subject) throws Exception{
        int jumS=0;
        String[] arr=subject.split(" ");
        if(arr.length<11){
            this.subject=subject;
        }
        else{
            throw new Exception("Jumlah kata tidak melebihi 10");
        }
    }

    public void setMessage(String message) throws Exception{
        StringTokenizer st=new StringTokenizer(subject);
        if(st.countTokens()<51){
            this.message=message;
        }else{
            throw new Exception("Jumlah kata tidak melebihi 50");
        }
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
    public String getresume(){
        String hasil=new String();
        hasil="<html>To :";
        hasil=hasil.concat(to.substring(0,to.indexOf("@")));
        //gabung subject
        StringTokenizer st=new StringTokenizer(subject);
        String sub=new String(); 
        sub="";
        sub="<br>Subject : ";
        if(st.countTokens()>1){
            for (int i = 0; i < 2; i++) 
                if(st.hasMoreTokens())
                    sub=sub.concat(st.nextToken().concat(" "));
        }
        else
            sub=sub.concat(st.nextToken().concat(" "));
            hasil=hasil.concat(sub);
            //gabung message
            String[] mess=message.split("\\.");
            hasil=hasil.concat("<br>Message : ").concat(mess[0]);
           
        
        return hasil;
    }
  
}
