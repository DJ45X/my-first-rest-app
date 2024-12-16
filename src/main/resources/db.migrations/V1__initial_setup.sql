-- Create table for Players
CREATE TABLE Players
(
    id SERIAL PRIMARY KEY,
    discordID VARCHAR(20) NOT NULL,
    discordName VARCHAR(100) NOT NULL,
    league VARCHAR(25) NOT NULL,
    team VARCHAR(25) NOT NULL,
    isBanned BOOLEAN NOT NULL DEFAULT FALSE
)