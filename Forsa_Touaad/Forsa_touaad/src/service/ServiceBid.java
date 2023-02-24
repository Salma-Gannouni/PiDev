/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entite.Bid;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.DataSource;


public class ServiceBid implements IServiceBid<Bid> {
    
    
    private Connection conn;
    PreparedStatement ste;

    public ServiceBid() {
         conn = DataSource.getInstance().getCnx();
    }
 // ---------------------------------- Ajouter Bid ---------------------------------------//
    
    public void ajouterBid(Bid b) {
        
        String sql ="insert into Bid (bid_amount,active_duration,type) Values(?,?,?)";
        
        try
        {
           ste=conn.prepareStatement(sql);
           ste.setInt(1, b.getBid_amount());
           ste.setInt (2,b.getActive_duration());
           ste.setString(3, b.getType());
           ste.executeUpdate();
           System.out.println("Bid Effectué");
        }
        catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }         
    }
        //--------------------------------------- Afficher Bid ------------------------------------------------//
    
    public List<Bid> afficherBids() {
        
     List<Bid> bids =  new ArrayList<>();
      String sql="select * from bid";
      
      try
      {
          ste=conn.prepareStatement(sql);
          
          ResultSet rs=ste.executeQuery();
                  while(rs.next()){
                      Bid b = new Bid();
                      b.setId_bid(rs.getInt("id_bid"));
                      b.setBid_amount(rs.getInt("bid_amount"));
                      b.setEntry_date(rs.getDate("entry_date"));
                      b.setEntry_time(rs.getTime("entry_time"));
                      b.setActive_duration(rs.getInt("active_duration"));
                      b.setType(rs.getString("type"));
                      
                      bids.add(b) ;
                  }
      }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      return bids;
    }
 // ---------------------------------- Modifier Commande ---------------------------------------//

    
    public void modifierBid(Bid b) {
        
       String sql= "UPDATE bid SET active_duration=? ,type=?  where id_bid =?";
       try{
          ste = conn.prepareStatement(sql);
          
           ste.setInt(1, b.getActive_duration());
           ste.setString (2,b.getType());
           ste.setInt(3, b.getId_bid());
          
          ste.execute();
          
           System.out.println(" Bid modifiée avec succés !");
       }catch (SQLException ex) {
            System.out.println(ex.getMessage());
      
        }
       
       
       
       
        
        
        
    }
 // ---------------------------------- Supprimer Commande ---------------------------------------//

    
    public void supprimerBid(int id_bid) {
       String sql = "DELETE from commande where id_cmd = '"+id_bid+"' ";
        try{
           Statement st= conn.createStatement();
           st.executeUpdate(sql);
           System.out.println("Bid supprimée avec succés !");
       }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }  
    }
 // ---------------------------------- chercher Commande ---------------------------------------//

    public List<Bid> chercherBid(Bid b) {
        
        List<Bid> Bids =  new ArrayList<>();
        
        for (Bid i : Bids){
            if (i.equals(b))
            {
                Bids.add(i);
                System.out.println(" Recherche avec succés !");
            }
            else {
               System.out.println(" Recherche échouée !"); 
            }
        }
        return Bids; 

    }

    
    public List<Bid> displayByID(int id_cmd) {
        
            List <Bid> myList= new ArrayList<>();

    String req="select * from commande where id_cmd='"+id_cmd+"' ";

    try {
        Statement st = conn.createStatement();
        ResultSet rs=st.executeQuery(req);
        while(rs.next()){
        
                      Bid b = new Bid();
                      b.setId_bid(rs.getInt("id_bid"));
                      b.setBid_amount(rs.getInt("bid_amount"));
                      b.setEntry_date( rs.getDate("entry_date"));
                      b.setEntry_time( rs.getTime("entry_time"));
                      b.setActive_duration(rs.getInt("active_duration"));
                      b.setType(rs.getString("prix"));
                      myList.add(b);

        }
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return myList;
        
        
    }






}

    
 
        
        
    

 

