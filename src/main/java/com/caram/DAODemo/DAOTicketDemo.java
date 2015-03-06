package com.caram.DAODemo;

import com.caram.DAOinterface.TicketDao;
import com.caram.DAOobject.TicketDaoImpl;
import com.caram.model.Ticket;

/**
 * Created by collin on 3/6/2015.
 */
public class DAOTicketDemo {
    public static void main(String[] args){
        TicketDao ticketDao = new TicketDaoImpl();

        //print the tickets
        for(Ticket ticket: ticketDao.getAllTickets()){
            System.out.println("Ticket id: " + ticket.getId() + " Ticket Cashier: " + ticket.getCashier());
        }


        //update Ticket
        ticketDao.updateTicket(0, "Walker is a faggot");
        ticketDao.updateTicket(1, "Joe Hernandez");

        //get some tickets
        ticketDao.getTicket(0);
        ticketDao.getTicket(1);

        //print the tickets
        for(Ticket ticket: ticketDao.getAllTickets()){
            System.out.println("Ticket id: " + ticket.getId() + " Ticket Cashier: " + ticket.getCashier());
        }
    }
}
