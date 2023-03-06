package oops;

interface Camera{
     void click();
     void record();
}
interface MusicPlayer{
     void play();
     void stop();
}
class Phone{
   public void call(){
        System.out.println("Calling...");
    }
    public void sms(){
        System.out.println("Sending sms...");
    }
}
class SmartPhone extends Phone implements Camera, MusicPlayer{
    public void click(){
        System.out.println("Clicking picture...");
    }
    public void record(){
        System.out.println("Recording...");
    }
    public void play(){
        System.out.println("Playing music...");
    }
    public void stop(){
        System.out.println("Stopping music...");
    }
}
public class Interface {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.call();
        s1.sms();
        s1.click();
        s1.record();
        s1.play();
        s1.stop();
    }
}
