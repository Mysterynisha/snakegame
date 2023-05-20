import javax.swing.JFrame;
public class frame extends JFrame{
    //create constructor of class
    frame(){
        //it will specify properties of constructor
        this.setTitle("snake");
        //adding pannel to frame
        this.add(new panel());
      //by default it is false we have to make it true
        this.setVisible(true);
        this.setResizable(false);//now maximization navigation bar will not work
        this.pack();  //whatever elements we are adding the element in frame it forces those element to atleast be preferable size.

    }
}
