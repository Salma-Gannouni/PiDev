/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entite.Bid;
import java.util.List;

/**
 *
 * @param <B>
 */
public interface IServiceBid<B> {
    
        
    public void ajouterBid(Bid b);
    public List<Bid> afficherBids();
    public void modifierBid(Bid b);
    public void supprimerBid(int id_bid);
    public List<Bid> chercherBid(Bid b);
    public List<Bid> displayByID(int id_bid) ;
    
}
