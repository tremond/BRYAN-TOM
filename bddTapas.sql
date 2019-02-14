CREATE TABLE Client (
    idClient int(11) NOT NULL AUTO_INCREMENT,
    pseudo VARCHAR(64),
    couleur VARCHAR(64),
    PRIMARY KEY (idClient)
)   DEFAULT CHARSET=utf8;

CREATE TABLE Groupe (
    idGroupe int(11) NOT NULL AUTO_INCREMENT,
    numTable int(11),
    PRIMARY KEY (idGroupe)
)   DEFAULT CHARSET=utf8;

CREATE TABLE Commande (
    idCommande int(11) NOT NULL AUTO_INCREMENT,
    heure VARCHAR(64),
    PRIMARY KEY (idCommande)
)   DEFAULT CHARSET=utf8;

CREATE TABLE CommandeTapas (
    idCommandeTapas int(11) NOT NULL AUTO_INCREMENT,
    quantité int(11),
    idClient int(11),
    idCommande int(11),
    PRIMARY KEY (idCommandeTapas)
)   DEFAULT CHARSET=utf8;

CREATE TABLE Tapas (
    idTapas int(11) NOT NULL AUTO_INCREMENT,
    nomTapas VARCHAR(64),
    PRIMARY KEY (idTapas)
)   DEFAULT CHARSET=utf8;

CREATE TABLE Categorie (
    idCategorie int(11) NOT NULL AUTO_INCREMENT,
    libelle VARCHAR(64),
    PRIMARY KEY (idCategorie)
)   DEFAULT CHARSET=utf8;

/*ALTER TABLE Exercice   
ADD CONSTRAINT Exercice_idTP
FOREIGN KEY (idTP)
REFERENCES TP(idTP);*/
