package com.example.databasedemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {

    @FXML
    public Label studentname;
    public Label id;
    public Label age;
    public void connectBtn(ActionEvent actionEvent){
        DatabaseConnectivity connect=new DatabaseConnectivity();
        Connection connectDB=connect.getConnection();
        if(connectDB!=null){
            String connectQuery="select sname, id, age from studentid2";
            try{
                Statement stmt=connectDB.createStatement();
                ResultSet queryOutput=stmt.executeQuery(connectQuery);
                while(queryOutput.next())
                {
                    studentname.setText(queryOutput.getString("sname"));
                    id.setText(queryOutput.getString("id"));
                    age.setText(queryOutput.getString("age"));
                }
            }catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Error connecting to the database");
        }
    }
}
