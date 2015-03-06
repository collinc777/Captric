
-- Most databases don't apply DDL statements transactionally.
-- Therefore, to recover from failure more easily, only put a single DDL
-- statement in each change script.

CREATE TABLE Tickets
(
    ID int NOT NULL AUTO_INCREMENT,
    cashier varchar(255) NOT NULL,
    PRIMARY KEY (ID)
)