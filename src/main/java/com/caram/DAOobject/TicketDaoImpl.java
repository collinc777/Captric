package com.caram.DAOobject;

import com.caram.DAOinterface.TicketDao;
import com.caram.model.Ticket;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by collin on 3/6/2015.
 */

// do we want to use arraylist as out holder??? just following example online with implementatio
//using the ticket ID as index in list. don't know if this is correct
public class TicketDaoImpl implements TicketDao {

    List<Ticket> tickets;

    //constructor for class. dont know if this is necessary
    public TicketDaoImpl(){
        tickets = new ArrayList<Ticket>();
        //what do we want to use as the ticket constructor? just stick with the defualt???
        //a little confused because obviously don't want to manually generate ids
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        tickets.add(ticket1);
        tickets.add(ticket2);
    }


    @Override
    public List<Ticket> getAllTickets() {
        return tickets;
    }

    @Override
    //THIS IS WRONG IMPLEMENTATION.. NEED TO USE SQL?
    public Ticket getTicket(int id) {
        Ticket result = getAllTickets().get(id);
        return result;
    }

    @Override
    public void updateTicket(int id, String cashier) {
        Ticket ticket = tickets.get(id);
        ticket.setCashier(cashier);
    }

    @Override
    public void deleteTicket(int id) {
        tickets.remove(id);
    }
}
