package com.caram.DAOinterface;
import com.caram.model.Ticket;

import java.util.List;

/**
 * Created by collin on 3/6/2015.
 */
public interface TicketDao {
    public List<Ticket> getAllTickets();
    public Ticket getTicket(int id);
    public void updateTicket(int id, String cashier);
    public void deleteTicket(int id);
}
