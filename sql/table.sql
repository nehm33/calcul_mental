CREATE TABLE scores (
	pseudo VARCHAR(30) NOT NULL,
	score INTEGER,
	niveau INTEGER,
	mode_jeu VARCHAR(10) NOT NULL,
	heure_jeu TIMESTAMP PRIMARY KEY,
	temps INTEGER
);