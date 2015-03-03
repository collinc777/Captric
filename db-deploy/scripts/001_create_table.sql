
-- Most databases don't apply DDL statements transactionally.
-- Therefore, to recover from failure more easily, only put a single DDL
-- statement in each change script.

CREATE TABLE Tickets(
    id int unsigned NOT NULL AUTO_INCREMENT,
    cashier VARCHAR(100),
    PRIMARY_KEY('id')
);
