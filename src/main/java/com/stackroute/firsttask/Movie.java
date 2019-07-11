package com.stackroute.firsttask;

public class Movie {
    private Actor ac;

    public void setAc(Actor ac) {
        this.ac = ac;
    }


    public void display()
    {
      ac.display();
      System.out.println("Displayed");
    }
}
